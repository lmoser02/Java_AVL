//Author: Leah Moser
//Date: 3/2/20
//Program: Calendar application
//THis is the class that is in charge of organizing data about school classes I have
//It is a derived class of the event type

package com.company;

public class school_classes extends event {

    protected String ctype;
    protected String lab_or_class;


    public school_classes()
    {
        ctype = null;
        lab_or_class = null;


    }

    public school_classes(String add_name, String add_time, String add_ctype, String add_lab_class)
    {
        super(add_name, add_time);
        ctype = add_ctype;
        lab_or_class = add_lab_class;

    }

    public void display()
    //display for sports
    {
        System.out.println("The event is: School Classes.");
        super.display();
        System.out.println("The of class is:  " + ctype);
        System.out.println("The class type is: " + lab_or_class);
        System.out.println();

    }

    public void prompt()
    //the prompt for user information
    {
        System.out.println("What is the ");
    }


}








