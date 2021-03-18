//Author:Leah Moser
//Date: 3/3/20
//Program to organize the events in a schedule
//This is the class the is in charge of organizing the linear linked list
//It contains two l_node class objects head and tail.

package com.company;

public class lll_class {
    protected l_node head;
    protected l_node tail;


    lll_class() {
        head = null;
        tail = null;

    }
    public void build_list(event to_add)
    {
        l_node adding = new l_node(to_add);
        build_list(adding, head);
    }


    protected l_node build_list(l_node to_add, l_node head) {
        if (this.head == null)
        {
            this.head = to_add;
            this.tail = this.head;
            return head;
        }
        l_node temp = new l_node();
        temp = to_add;
        temp.set_next(head);
        this.head = temp;

        return head;


    }
    public void display()
            //wrapper function
    {
        display(head);

    }


    protected void display(l_node head)
            //recursive function
    {
        if(head == null) {
            System.out.println("There is nothing on the calendar for this day.");
            System.out.println();
            return;
        }
        //System.out.println("________list______");//testing
       // System.out.println("The number information is:  " );//testing
        head.display_l_node();
        display(head.get_next());


    }

    public int remove(String name)
    {
        if(head == null)
            return 0;
        if(name.compareTo(head.find_name()) == 0)
        {
            this.head = head.get_next();
            return 1;
        }
        l_node prev = head;

        remove(name, prev, head.get_next());

       return 1;


    }

    public l_node remove(String name, l_node prev, l_node current) {
        if (current == null)
            return null;
        if (name.compareTo(current.find_name()) == 0)
        {
            prev.set_next(current.get_next());
            //System.out.println("The name to compare." + name);
            //System.out.println("The name that comes back." + head.find_name());
            return current;
        }

        return remove(name, prev.get_next(), current.get_next());


    }




    }













