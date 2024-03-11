package com.test.yogaforhealth.dataitems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PranayamsListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> pranayamas = new ArrayList<String>();
        pranayamas.add("Anuloma –Viloma");
        pranayamas.add("Aumkara Pranayama");
        pranayamas.add("Chandranuloma");
        pranayamas.add("Suryanuloma");
        pranayamas.add("Chandrabedhana");
        pranayamas.add("Suryabedhana");
        pranayamas.add("Naadishodhana");
        pranayamas.add("Bhastrika");
        pranayamas.add("Kapalabhati");
        pranayamas.add("Sheethali");
        pranayamas.add("Sheetkari");
        pranayamas.add("Sadantha");
        pranayamas.add("Bhramari");

        expandableDetailList.put("Pranayama techniques", pranayamas);
        return expandableDetailList;
    }
}