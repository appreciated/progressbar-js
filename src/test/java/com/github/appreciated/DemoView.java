package com.github.appreciated;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Route("")
@Push
public class DemoView extends VerticalLayout {

    private final ProgressCircle circle1;
    private final ProgressCircle circle2;
    private final ProgressCircle circle3;
    private final ProgressCircle circle4;

    public DemoView() {

        circle1 = new ProgressCircle();
        circle1.setDrawNumber(true);
        circle1.setNumberSuffix("%");
        circle1.setNumberPrefix("+");
        circle1.setValue(0.0);

        circle2 = new ProgressCircle();
        circle3 = new ProgressCircle();
        circle3.setDrawNumber(true);
        circle3.setNumberSuffix("%");
        circle3.setNumberPrefix("+");
        circle4 = new ProgressCircle();

        circle1.setHeight("150px");
        circle2.setHeight("150px");
        circle3.setHeight("150px");
        circle4.setHeight("150px");

        circle1.setWidth("150px");
        circle2.setWidth("150px");
        circle3.setWidth("150px");
        circle4.setWidth("150px");

        add(circle1, circle2, circle3, circle4);
        setSpacing(true);
        setSizeFull();
        circle2.setValue(0.5);
        circle3.setValue(0.75);
        circle4.setValue(1.0);
    }
}
