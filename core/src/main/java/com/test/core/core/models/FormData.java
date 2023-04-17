package com.test.core.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FormData {
    @Inject
    @Optional
    @Named(value = "jcr:created")
    private String slingResourceType;

    @Self
    Resource resource;

    @ChildResource(name = "inputs")
    Resource childResource;

    public String getSlingResourceType() {
        return slingResourceType;
    }

    public List<Map <String , Map<String,String>>> getData(){

        if(Objects.isNull(this.childResource)) return Collections.EMPTY_LIST;

        List<Map <String , Map<String,String>>> dataList = new ArrayList<>();

        for(Resource childResource :this.childResource.getChildren()){

        Map<String ,Map <String, String>> elementMap = new LinkedHashMap<>();

        String elementName = childResource.getValueMap().get("element",String.class);

        Resource attributeResource = childResource.getChild("attributes");

        Map<String, String> attributeMap = null;

        attributeMap = new LinkedHashMap<>();

        for (Resource innerChild : attributeResource.getChildren()){



            String attributeKey = innerChild.getValueMap().get("key",String.class);
            String attributeValue = innerChild.getValueMap().get("value",String.class);
            attributeMap.put(attributeKey,attributeValue);
        }

        elementMap.put(elementName, attributeMap);

        dataList.add(elementMap);
        }

        return dataList;

    }


}
