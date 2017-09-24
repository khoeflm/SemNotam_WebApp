package at.notamWebapp.interestSpec.specificInterest.view;

import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import at.notamWebapp.util.customConverter.MyConverterFactory;
import com.frequentis.semnotam.ws.generalInterest.GeneralInterestWS;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class SemNotamUI extends UI {
    //    private VerticalLayout mainLayout = new VerticalLayout();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VaadinSession session = getSession();

        session.setConverterFactory(new MyConverterFactory());
//        mainLayout.addComponents(controller.getView());
//        setContent(mainLayout);

        Properties properties = new Properties();
        String propFileName = "config.properties";
        getPage().setTitle("SemNotam WebApp");

        InputStream inputStream;


        try {
            inputStream = new FileInputStream(propFileName);
            properties.load(inputStream);
            String semNotamWebServiceUrl = (String) properties.get("semNotamWebServiceUrl");
            String containerDescriptionServiceUrl = (String) properties.get("containerDescriptionServiceUrl");
            int timeOutInterval = Integer.parseInt((String) properties.get("timeOutInterval"));
            new SpecificInterestWS(semNotamWebServiceUrl);
            new GeneralInterestWS(containerDescriptionServiceUrl);
            VaadinSession.getCurrent().getSession().setMaxInactiveInterval(timeOutInterval);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Create a navigator to control the views
        Navigator navigator = new Navigator(this, this);
        // Create and register the views
        navigator.addView("InterestSpec", new InterestSpecificationForm());
        navigator.addView("EvalInterestSpec", new EvaluatedInterestSpecificationForm());
        navigator.navigateTo("InterestSpec");
    }

   /* public VerticalLayout getMainLayout() {
        return mainLayout;
    }*/

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SemNotamUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
