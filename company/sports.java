//Author: Leah Moser
//Date: 2/28/20
//Program: A calendar to help organize events
//This class is in charge of different sporting events
//It is a derived class of event type

package com.company;

public class sports extends event {
    protected String stype;
    protected String pract_or_game;


    public sports()
    {
        stype = null;
        pract_or_game = null;


    }

    public sports(String add_name, String add_time, String add_stype, String add_pract_game)
    {
        super(add_name, add_time);
        stype = add_stype;
        pract_or_game = add_pract_game;

    }

    public void display()
            //display for sports
    {
        System.out.println("The event is: Sporting events.");
        super.display();
        System.out.println("The sporting event is for:  " + stype);
        System.out.println("The type is: " + pract_or_game);
        System.out.println();

    }

    public void prompt()
            //the prompt for user information
    {
        System.out.println("What is the ");
    }


}
