package com.test.yogaforhealth.dataitems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MudrasListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> mudras = new ArrayList<String>();
        mudras.add("Drona Mudra");
        mudras.add("Chin Mudra");
        mudras.add("Chinmaya Mudra");
        mudras.add("Adi Mudra");
        mudras.add("Akasha Mudra");
        mudras.add("Bramha Mudra");
        mudras.add("Bhairava Mudra");
        mudras.add("Mrugi Mudra");
        mudras.add("Shanmuga Mudra");
        mudras.add("Karna Mudra");
        mudras.add("Khechari Mudra");
        mudras.add("Bhoochari Mudra");

        expandableDetailList.put("Mudras", mudras);
        return expandableDetailList;
    }
}