//Author:Leah Moser
//Date:3/2/20
//Program: Calendar application
//This is the class that is in charge of organizing the nodes in the linear linked list
//It contains an event class item in it via "has a"

package com.company;

public class l_node {
    protected l_node next;
    protected event item;
     l_node()
    {
        this.next = null;
        this.item = null;
    }
    l_node(event nw)
    {
        this.item = nw;
        this.next = null;
    }
    public void set_next(l_node next) //sets the next pointer
    {
        this.next = next;
    }

    public l_node get_next()
            //gets the next pointer
    {
        return this.next;

    }

    public void display_l_node()
            //this might not work
    {
        //System.out.println("_____node_______"); //for testing only
        //System.out.println("The event is: ");
        System.out.println();
        item.display();

    }
    public String find_name()
    {
        return item.find_name();

    }
}


