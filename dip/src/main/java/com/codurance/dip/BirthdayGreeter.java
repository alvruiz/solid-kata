package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Clock clock;
    private final Notificator notificator;
    private final Formatter formatter;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, Notificator notificator,Formatter formatter) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.notificator = notificator;
        this.formatter = formatter;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .map(employee -> emailFor(employee))
                .forEach(email -> notificator.send(email));
    }

    private Email emailFor(Employee employee) {
        //String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        String message = (String) formatter.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }

}