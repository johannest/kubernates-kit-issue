package org.vaadin.example;

import com.vaadin.flow.spring.annotation.RouteScope;
import com.vaadin.flow.spring.annotation.RouteScopeOwner;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@RouteScope
@RouteScopeOwner(MainView.class)
public class VaadinUiScopeBean implements Serializable {

    public void testMe() {
        System.out.println("I'm working");
    }
}
