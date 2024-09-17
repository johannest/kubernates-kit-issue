package org.vaadin.example;

import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.spring.annotation.RouteScope;
import com.vaadin.flow.spring.annotation.RouteScopeOwner;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope("prototype")
public class SomeBeanLayout implements Serializable {

    private final transient VaadinUiScopeBean vaadinUiScopeBean;

    public SomeBeanLayout(@Autowired @RouteScopeOwner(MainView.class)VaadinUiScopeBean vaadinUiScopeBean) {
        this.vaadinUiScopeBean = vaadinUiScopeBean;
    }

    @PostConstruct
    public void postInit() {
        System.out.println("Session is " + VaadinSession.getCurrent());
        vaadinUiScopeBean.testMe();
    }
}
