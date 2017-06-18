package at.notamWebapp.interestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import at.notamWebapp.interestSpec.model.customConverter.MyConverterFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class SemNotamUI extends UI {
    Navigator navigator;
//    private VerticalLayout mainLayout = new VerticalLayout();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VaadinSession session = getSession();
        VaadinSession.getCurrent().getSession().setMaxInactiveInterval(300);
        session.setConverterFactory(new MyConverterFactory());
//        mainLayout.addComponents(controller.getView());
//        setContent(mainLayout);

        getPage().setTitle("SemNotam WebApp");

        // Create a navigator to control the views
        navigator = new Navigator(this, this);
        // Create and register the views
        navigator.addView("", new InterestSpecificationForm());
        navigator.addView("EvalInterestSpec", new EvaluatedInterestSpecificationForm());
    }

   /* public VerticalLayout getMainLayout() {
        return mainLayout;
    }*/

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SemNotamUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}
