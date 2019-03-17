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
        setWidth("200px");
        setHeight("200px");
        getElement()
                .getStyle()
                .set("position", "relative")
                .set("overflow", "visible")
                .set("padding","10px");
        setStrokeWidth(2);
        setTrailWidth(1);
        setColor("green");
        setEasing("easeInOut");
        setTrailColor("#fafafa");
        setDuration(1400);
        setDrawNumber(false);
        setFromColor("#aaa");
        setToColor("#f00");
        setFromStrokeWidth(1);
        setToStrokeWidth(3);
    }

    public void setStrokeWidth(double strokeWidth) {
        getModel().setStrokeWidth(strokeWidth);
    }

    public void setTrailWidth(double trailWidth) {
        getModel().setTrailWidth(trailWidth);
    }

    public void setColor(String color) {
        getModel().setColor(color);
    }

    public void setEasing(String color) {
        getModel().setEasing(color);
    }

    public void setTrailColor(String color) {
        getModel().setTrailColor(color);
    }

    public void setDuration(int duration) {
        getModel().setDuration(duration);
    }

    public void setDrawNumber(boolean drawNumber) {
        getModel().setDrawNumber(drawNumber);
    }

    public void setFromColor(String color) {
        getModel().setFromColor(color);
    }

    public void setToColor(String color) {
        getModel().setToColor(color);
    }

    public void setFromStrokeWidth(double strokeWidth) {
        getModel().setFromStrokeWidth(strokeWidth);
    }

    public void setToStrokeWidth(double strokeWidth) {
        getModel().setToStrokeWidth(strokeWidth);
    }

    public void setProgress(double progress) {
        getModel().setAnimate(progress);
    }

    public interface ProgressCircleModel extends TemplateModel {
        double getAnimate();

        void setAnimate(double progress);

        String getColor();

        void setColor(String color);

        String getTrailColor();

        void setTrailColor(String color);

        double getStrokeWidth();

        void setStrokeWidth(double strokeWidth);

        double getTrailWidth();

        void setTrailWidth(double trailWidth);

        double getDuration();

        void setDuration(double duration);

        String getEasing();

        void setEasing(String easing);

        String getFromColor();

        void setFromColor(String colorFrom);

        String getToColor();

        void setToColor(String colorTo);

        double getFromStrokeWidth();

        void setFromStrokeWidth(double strokeFrom);

        double getToStrokeWidth();

        void setToStrokeWidth(double strokeTo);

        boolean getDrawNumber();

        void setDrawNumber(boolean drawNumber);
    }
}

