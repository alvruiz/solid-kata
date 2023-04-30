package com.codurance.dip;

import java.util.ArrayList;

public interface Formatter{
    public String format(String toFormat, String values);
    public String format(String toFormat, ArrayList<String> values);
}
