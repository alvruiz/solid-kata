package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayClock implements Clock{
    public MonthDay monthDay(){
        return MonthDay.now();
    }
}