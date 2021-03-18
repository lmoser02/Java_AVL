//Author: Leah Moser
//Date: 3/3/20
//Program: Calendar application
//This is the class that is in charge of organizing the array. I did all for loops recursivley
//except in the default constructor.





package com.company;

public class table {
    protected int size;
    protected lll_class[] array;
    protected int day_of_month;

    table()
    {

        day_of_month = 0;
        size = 31;
        array = new lll_class[size];
        for(int i = 0; i <size; ++i)
        {
            array[i] = new lll_class();
        }
    }
    public int build_table(int index, event to_add)
    {
        array[index].build_list(to_add);
        return 0;
    }

    public int display()
            //wrapper for the recursive function instead of the for loop
    {
        System.out.println("Welcome to this months calander!\n");
        display(0);
        return 0;

    }

    protected int display(int num)
            //recursive function instead of for loop
    {
        if(num >= size)
            return 0;
        if(array[num] != null)
        {
            System.out.println("Scheduled for " + (num+1) + " this day of the month is: ");//why is this printing all
            array[num].display();
        }

        return display(num+1);

    }

    public int remove_by_name(String name)
            //wrapper for the function instead of full loop
    {
        remove_by_name(name, 0);
        return 0;

    }

    protected int remove_by_name(String name, int num)
    {
        if(num >= size)
            return 0;

            array[num].remove(name);


        return remove_by_name(name, num+1);
    }


}
