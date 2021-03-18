//Author:Leah Moser
//Date:2/28/20
//This the class that will be in charge of the base class for the
//events that will be added to the calendar
//This is the class that is the base class to the three derived classes.
//It is in charge of holding the information that is in all of the base classes.



package com.company;

abstract public class event {
    protected String name;
    protected String time;

    public event()
            //default constructor
    {
        name = null;
        time = null;
    }

    public event(String add_name, String add_time)
            //constructor with arguments
    {
        name = add_name;
        time = add_time;

    }

    public void display()
    {
        System.out.println("Event Name: " + name);
        System.out.println("Event time: " + time);

    }

    public String find_name()
    {
        return name;
    }






}
