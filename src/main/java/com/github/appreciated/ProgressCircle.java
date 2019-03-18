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
        getElement().getStyle().set("position", "relative");
        setStrokeWidth(2);
        setTrailWidth(2);
        setColor("var(--lumo-primary-color)");
        setEasing("easeInOut");
        setTrailColor("var(--lumo-contrast-10pct)");
        setDuration(1000);
        setDrawNumber(true);
        setRoundStroke(true);
    }

    /**
     * The thickness of the progressbar.
     *
     * @param strokeWidth the width progressbar as svg stroke (default is '2')
     */
    public void setStrokeWidth(double strokeWidth) {
        getModel().setStrokeWidth(strokeWidth);
    }

    /**
     * The thickness of the trail the progressbar is embedded in.
     *
     * @param trailWidth the width of the trail as svg stroke (default is '2')
     */
    public void setTrailWidth(double trailWidth) {
        getModel().setTrailWidth(trailWidth);
    }

    /**
     * Sets the color of the Text and of the progressbar. Will have no effect on the progressbar if {@link #setFromColor(String)} and {@link #setToColor(String)} is being used.
     *
     * @param color A valid css color, also css-variables allowed.
     */
    public void setColor(String color) {
        getModel().setColor(color);
    }

    /**
     * Sets the transition-timing-function of the animation
     *
     * @param color Allowed values 'linear', 'easeIn', 'easeOut', 'easeInOut' also custom functions seem to be allowed.
     * @see <a href="https://progressbarjs.readthedocs.io/en/latest/api/parameters/">progressbarjs docs</a>
     */
    public void setEasing(String color) {
        getModel().setEasing(color);
    }

    /**
     * The color of the trail the progress is presented on
     *
     * @param color
     */
    public void setTrailColor(String color) {
        getModel().setTrailColor(color);
    }

    /**
     * sets the duration for the transition between two progress values
     *
     * @param duration non negative milliseconds
     */
    public void setDuration(int duration) {
        getModel().setDuration(duration);
    }

    /**
     * Sets whether the progress number is supposed to be drawn
     *
     * @param drawNumber passing true cause the number to be drawn
     */
    public void setDrawNumber(boolean drawNumber) {
        getModel().setDrawNumber(drawNumber);
    }

    /**
     * whether the SVG stroke that is used for the progressbar is supposed to be round. True be default.
     *
     * @param roundStroke false will cause the stroke to have corners
     */
    public void setRoundStroke(boolean roundStroke) {
        getModel().setRoundStroke(roundStroke);
    }

    /**
     * to be used in combination with {@link #setToColor(String)}
     *
     * @param color
     */
    public void setFromColor(String color) {
        getModel().setFromColor(color);
    }

    /**
     * to be used in combination with {@link #setFromColor(String)}
     *
     * @param color
     */
    public void setToColor(String color) {
        getModel().setToColor(color);
    }

    /**
     * Causes the during the transition between two values the width of the stroke to translate.
     * to be used in combination with {@link #setToColor(String)}, {@link #setFromColor(String)} and {@link #setToStrokeWidth(double)}
     *
     * @param strokeWidth The value of the begin of the translation. RGB color in hex format (f.e. #fff or #ffffff)
     */
    public void setFromStrokeWidth(double strokeWidth) {
        getModel().setFromStrokeWidth(strokeWidth);
    }

    /**
     * Causes the during the transition between two values the width of the stroke to translate.
     * to be used in combination with {@link #setToColor(String)}, {@link #setFromColor(String)} and {@link #setFromStrokeWidth(double)}
     *
     * @param strokeWidth The value of the end of the translation. RGB color in hex format (f.e. #fff or #ffffff)
     */
    public void setToStrokeWidth(double strokeWidth) {
        getModel().setToStrokeWidth(strokeWidth);
    }

    /**
     * Sets the current progress of the Progressbar
     *
     * @param progress
     */
    public void setProgress(double progress) {
        getModel().setAnimate(progress);
    }

    /**
     * Sets prefix before the number of the of the progress value
     *
     * @param prefix A string but make sure it fits in one line inside the progressbar
     */
    public void setNumberPrefix(String prefix) {
        getModel().setNumberPrefix(prefix);
    }

    /**
     * Sets the suffix after the number of the of the progress value
     *
     * @param suffix A string but make sure it fits in one line inside the progressbar
     */
    public void setNumberSuffix(String suffix) {
        getModel().setNumberSuffix(suffix);
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

        String getNumberPrefix();

        void setNumberPrefix(String numberPrefix);

        String getNumberSuffix();

        void setNumberSuffix(String numberSuffix);

        boolean getRoundStroke();

        void setRoundStroke(boolean roundStroke);
    }
}

