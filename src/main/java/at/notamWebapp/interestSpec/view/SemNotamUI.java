package at.notamWebapp.interestSpec.view;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.model.customConverter.MyConverterFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

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

    private VerticalLayout mainLayout = new VerticalLayout();
    private SemNotamController controller;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        controller = new SemNotamController(this);
        VaadinSession session = getSession();
        session.setConverterFactory(new MyConverterFactory());
        mainLayout.addComponents(controller.getView());
        setContent(mainLayout);
    }

    public VerticalLayout getMainLayout() {
        return mainLayout;
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SemNotamUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
