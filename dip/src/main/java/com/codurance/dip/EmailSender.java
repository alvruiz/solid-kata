package com.codurance.dip;

import java.util.ArrayList;
import java.util.Arrays;

public class EmailSender implements Notificator {

    private final Formatter formatter;
    public EmailSender(Formatter formatter){
        this.formatter = formatter;
    }
    public void send(Email email) {
        formatter.format("To:%s, Subject:%s, Message: %s",new ArrayList<>(Arrays.asList(email.getTo(),email.getSubject(),email.getSubject())));
    }
}
