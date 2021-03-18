//Author: Leah Moser
//Date: 2/28/20
//Program: A calendar to help organize events
//This class is in charge of different projects that are due
//It is a derived class of base event

package com.company;

public class projects extends event {
    protected String type;
    protected String group_type;


    public projects()
    {
        type = null;
        group_type = null;


    }

    public projects(String add_name, String add_time, String add_type, String add_group_type)
    {
        super(add_name, add_time);
        type = add_type;
        group_type = add_group_type;

    }

    public void display()
    {
        System.out.println("The event is: projects.");
        super.display();
        System.out.println("Project type: " + type);
        System.out.println("The project is: " + group_type);
        System.out.println();
    }

    public void prompt()
    {
        System.out.println("What is the ");
    }


}
