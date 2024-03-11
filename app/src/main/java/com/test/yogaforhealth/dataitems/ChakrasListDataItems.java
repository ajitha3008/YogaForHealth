package com.test.yogaforhealth.dataitems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChakrasListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> chakras = new ArrayList<String>();
        chakras.add("Mooladhara Chakra");
        chakras.add("Swasdisthana Chakra");
        chakras.add("Manipoora Chakra");
        chakras.add("Anahata Chakra");
        chakras.add("Vishuddhi Chakra");
        chakras.add("Jnana Chakra");
        chakras.add("Sahasrara Chakra");

        expandableDetailList.put("Saptha Chakras", chakras);
        return expandableDetailList;
    }
}