package com.github.appreciated;

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("progressbar-circle")
@HtmlImport("frontend://com/github/appreciated/progressbar/progressbar-circle.html")
public class ProgressCircle extends PolymerTemplate<ProgressCircle.ProgressCircleModel> implements HasSize {

    public ProgressCircle() {
        setWidth("300px");
        setHeight("300px");
        getElement().getStyle().set("position", "relative");
    }

    public double getAnimate() {
        return getModel().getAnimate();
    }

    public void setAnimate(double progress) {
        getModel().setAnimate(progress);
    }

    public interface ProgressCircleModel extends TemplateModel {
        double getAnimate();

        void setAnimate(double progress);
    }


}

