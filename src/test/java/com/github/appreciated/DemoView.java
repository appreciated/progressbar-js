package com.github.appreciated;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Route("")
@Push
public class DemoView extends VerticalLayout {

    private final ProgressCircle circle;

    public DemoView() {
        circle = new ProgressCircle();
        add(circle);
        setSizeFull();
        circle.setProgress(1.0);
    }
}
