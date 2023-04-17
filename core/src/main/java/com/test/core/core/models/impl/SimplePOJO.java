package com.test.core.core.models.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.test.core.core.models.SamplePOJO;

public class SimplePOJO {
    public static void main(String[] args) {
        
        SamplePOJO samplePOJO = new SamplePOJO();

        samplePOJO.setId("id");
        samplePOJO.setDescription("desc");
        samplePOJO.setName("myname");

        System.out.println(samplePOJO.getId());
        System.out.println(samplePOJO.getName());
        System.out.println(samplePOJO.getDescription());

        List<String> list = new ArrayList();

        list.add("bh");

        Map<String,String> myMap = new LinkedHashMap<>();
        myMap.put("id", "val");



    }
}
