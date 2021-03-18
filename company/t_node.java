//Author: Leah Moser
//Date: 3/5/20
//Program: Calendar application
//This is the portion of the object oriented design that is in charge of the tree's node
//It also holds the helper functions for all the trees nodes.




package com.company;

public class t_node {
    protected t_node left; //left node
    protected t_node right; //right node
    protected t_node parent; //parent of the nodes
    protected String c_name; //calendar name
   // protected int color; //color based on numbers 0 is black and red is 1
    protected int height; // avl tree
    protected table c_type; //the month of activities

    t_node() {
        left = null;
        right = null;
        parent = null;
        c_name = null;
       // color = 1;
        height = 0;
        c_type = null;
    }

    t_node(String add_name, table add_calendar) {
        this.c_name = add_name;
        this.c_type = add_calendar;

    }

    public t_node get_left() {
        return this.left;
    }

    public t_node get_right() {
        return this.right;
    }

   // public t_node get_parent() {
    //    return this.parent;// if then statement
   // }


    public void set_left(t_node left) {
        this.left = left;
    }

    public void set_right(t_node right) {
        this.right = right;
    }

   // public void set_parent(t_node parent) {
    //    this.parent = parent;
   // }


    public void display_t_node() {

        System.out.println("__________________");

        System.out.println("This is the " + c_name + " calander.");
        System.out.println("_____________");
        c_type.display();
    }

    public String find_cname() {
        return c_name;
    }

    public void insert_node(int index, event to_add)
    {
        c_type.build_table(index, to_add);

    }

}
