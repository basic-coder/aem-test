package com.test.core.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;

import java.util.ArrayList;
import java.util.List;


@Model(adaptables = Resource.class, resourceType = "test/components/custom/textbox",defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name="jackson",extensions = "json")
public class SlingModelExporter {

    @Self
    Resource resource;

    @ChildResource(name = "inputs")
    Resource childResource;

    public List<String> getElements(){
        List<String> dataElements = new ArrayList<>();
        childResource.listChildren().forEachRemaining(childResourceElement ->{
            dataElements.add(childResourceElement.getValueMap().get("element",String.class));
        });

        return dataElements;
    }

}
