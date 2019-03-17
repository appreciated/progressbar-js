package com.github.appreciated;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("progress-circle")
@HtmlImport("org/vaadon/custom-media-query.html")
public class ProgressSemiCircle extends PolymerTemplate<ProgressSemiCircle.ProgressCircleModel> {

    public interface ProgressCircleModel extends TemplateModel {
    }
}

