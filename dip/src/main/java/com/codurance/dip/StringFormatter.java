package com.codurance.dip;

import java.util.ArrayList;

public class StringFormatter implements Formatter{
    @Override
    public String format(String str, String values) {
        return new java.util.Formatter().format(str,values).toString();
    }

    @Override
    public String format(String str, ArrayList<String> values) {
        String valuesJoined="";
        for(String s: values)
            valuesJoined = valuesJoined+s;
        return new java.util.Formatter().format(str,values).toString();
    }
}
