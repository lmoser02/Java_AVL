//Author: Leah Moser
//Date: 3/3/20
//Program: to create a calendar type application for storing data
// for a scheduler
//This is the main where we will be able to test all the functionality


package com.company;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    protected Scanner input = null;
    public Main() {
        input = new Scanner(System.in);


    }

        public static void main(String[] args) {
            Main obj = new Main();
            table stuff = new table();//kids calendar item
            table school = new table(); //school calendar item
            table work = new table(); //work calendar name
            String c_name = new String();
            Avl calendar = new Avl();
            //lines 16-40 were for testing the structures during the programming bottom up
            /*
            sports sp = new sports("Sports", "1:30pm", "basketball", "Practice");
            //sp.display(); //testing
            //l_node nw = new l_node(sp);
            //lll_class nn = new lll_class();
            //nn.build_list(nw);
            //nn.display();//testing
            stuff.build_table(12, sp);
            //stuff.display();

            projects pj = new projects("CS202", "4:15pm","Program1", false);
            //pj.display();//testing
            //l_node pw = new l_node(pj);
            //nn.build_list(pw);
            stuff.build_table(12, pj);
            //stuff.display();
            school_classes sc = new school_classes("Chemistry", "10:30pm", "class 3", "class");
            stuff.build_table(16, sc);
           // stuff.display();
            //sc.display();//testing
            //l_node sw = new l_node(sc);
            //nn.build_list(sw);
            //nn.display();
            //sw.display_l_node();//testing

             */

//The following lines of code are for read in file only.
            String file_name = "src/com/company/read_in";

            try {
                read_in file = new read_in(file_name);
                String[] arylines = file.OpenFile();
                sports ba = new sports(arylines[0], arylines[1], arylines[2], arylines[3]);
                stuff.build_table(12, ba);
                sports ba1 = new sports(arylines[4], arylines[5], arylines[6], arylines[7]);
                stuff.build_table(12, ba1);
                sports bb = new sports(arylines[8], arylines[9], arylines[10], arylines[11]);
                stuff.build_table(17, bb);
                sports bb2 = new sports(arylines[12], arylines[13], arylines[14], arylines[15]);
                stuff.build_table(20, bb2);
                sports t = new sports(arylines[16], arylines[17], arylines[18], arylines[19]);
                stuff.build_table(22, t);
                projects w = new projects(arylines[20], arylines[21], arylines[22], arylines[23]);
                stuff.build_table(2, w);
                projects sc = new projects(arylines[24], arylines[25], arylines[26], arylines[27]);
                stuff.build_table(5, sc);
                school_classes sr = new school_classes(arylines[28], arylines[29], arylines[30], arylines[31]);
                stuff.build_table(3, sr);
                school_classes sr2 = new school_classes(arylines[32], arylines[33], arylines[34], arylines[35]);
                stuff.build_table(5, sr2);
                school_classes sr3 = new school_classes(arylines[36], arylines[37], arylines[38], arylines[39]);
                stuff.build_table(7, sr3);
                school_classes sr4 = new school_classes(arylines[40], arylines[41], arylines[42], arylines[43]);
                stuff.build_table(10, sr4);
                school_classes sr5 = new school_classes(arylines[44], arylines[45], arylines[46], arylines[47]);
                stuff.build_table(25, sr5);
                //stuff.display(); //testing
                t_node things = new t_node("Kids ", stuff); //testing only
                //things.display_t_node();//testing
                calendar.insert(things);
                //System.out.println("Tree stuff");//testing
                //calendar.display_tree_inorder();//testing
                school_classes sr8 = new school_classes(arylines[32], arylines[33], arylines[34], arylines[35]);
                school.build_table(5, sr2);
                school_classes sr9 = new school_classes(arylines[36], arylines[37], arylines[38], arylines[39]);
                school.build_table(7, sr3);
                school_classes sr10 = new school_classes(arylines[40], arylines[41], arylines[42], arylines[43]);
                school.build_table(10, sr4);
                school_classes sr11 = new school_classes(arylines[44], arylines[45], arylines[46], arylines[47]);
                school.build_table(25, sr5);
                t_node things2 = new t_node("School ", school);
                calendar.insert(things2);
                //calendar.display_tree_inorder();
                projects sr12 = new projects(arylines[48],arylines[49],arylines[50], arylines[51]);
                work.build_table(2, sr12);
                projects sr13 = new projects(arylines[52], arylines[53], arylines[54], arylines[55]);
                work.build_table(13, sr13);
                projects sr14 = new projects(arylines[48],arylines[49],arylines[50], arylines[51]);
                work.build_table(6, sr14);
                projects sr15 = new projects(arylines[48],arylines[49],arylines[50], arylines[51]);
                work.build_table(8, sr15);
                projects sr16 = new projects(arylines[48],arylines[49],arylines[50], arylines[51]);
                work.build_table(10, sr16);

                t_node things3 = new t_node("Work", work);
                calendar.insert(things3);
                //calendar.display_tree_inorder();//testing



            }

            catch(IOException e)
                {
                    System.out.println("You can't do that");
                }

            int choice = 0;//to use in the menu interface
            String name; //to use for the entering of information from user
            String time; //to use for the entering of information from the user
            String sport; //to use for the entering of information from the user
            String game; //to use for the entering of information from the user
            int date; //to use for the entering of information from the user
           // String to_remove; //this is the data to remove from the LLL
            String calendar_name;



            System.out.println("Welcome to your calendar!");




            do{
                System.out.println("If you would you like to display the all the calendars in order press 1.");
                System.out.println("If you would like to add a sporting event press 2.");
                System.out.println("If you would like to add a project event press 3.");
                System.out.println("If you would like to add a school classes press 4.");
                System.out.println("If you would like to delete everything press 5");
                System.out.println("If you would like to quit press 0.");
                choice = obj.input.nextInt();

                if (choice == 1) {
                    calendar.display_tree_inorder();
                } else if (choice == 2) {

                    System.out.println("What event type would you like to add?");
                    obj.input.nextLine();
                    name = new String(obj.input.nextLine());

                    System.out.println("What is the day of the month the event is on.");
                    date = obj.input.nextInt();

                    System.out.println("What is the time of the event.");
                    obj.input.nextLine();
                    time = new String(obj.input.nextLine());

                    System.out.println("What type of sporting event is it? example basketball.");
                    sport = new String(obj.input.nextLine());

                    System.out.println("Is it a practice, game, meeting? ");
                    game = new String(obj.input.nextLine());


                    sports sp = new sports(name, time, sport, game);
                    int to_add = 0;
                    System.out.println("Would you like to add into an existing calendar press 1");
                    System.out.println("Would you like to add this to a new calendar press 2");
                    to_add = obj.input.nextInt();
                    if(to_add == 1)
                    {
                        String search_name;
                        System.out.println("What calendar would you like to add to?");
                        obj.input.nextLine();
                        search_name = new String(obj.input.nextLine());
                        calendar.search((date -1), search_name, sp);

                    }
                    else
                    {
                        String cal_name;

                        System.out.println("What is the name of the new calendar?");
                        obj.input.nextLine();
                        cal_name = new String(obj.input.nextLine());
                       table new_thing = new table();
                       new_thing.build_table((date -1), sp);
                        t_node things4 = new t_node(cal_name, new_thing);
                        calendar.insert(things4);
                    }
                    //stuff.build_table((date -1), sp);//from program 4




                }

                else if (choice == 3) {

                    System.out.println("What is the name of the event would you like to add?");
                    obj.input.nextLine();
                    name = new String(obj.input.nextLine());

                    System.out.println("What is the day of the month the event is on.");
                    date = obj.input.nextInt();

                    System.out.println("What is the time of the event.");
                    obj.input.nextLine();
                    time = new String(obj.input.nextLine());

                    System.out.println("What type of project is it? example work or school");
                    sport = new String(obj.input.nextLine());

                    System.out.println("Is it group or individual? ");
                    game = new String(obj.input.nextLine());


                    projects sp = new projects(name, time, sport, game);
                    int to_add = 0;
                    System.out.println("Would you like to add into an existing calendar press 1");
                    System.out.println("Would you like to add this to a new calendar press 2");
                    to_add = obj.input.nextInt();
                    if(to_add == 1)
                    {
                        String search_name;
                        System.out.println("What calendar would you like to add to?");
                        obj.input.nextLine();
                        search_name = new String(obj.input.nextLine());
                        calendar.search((date -1), search_name, sp);

                    }
                    else
                    {
                        String cal_name;

                        System.out.println("What is the name of the new calendar?");
                        obj.input.nextLine();
                        cal_name = new String(obj.input.nextLine());
                        table new_thing = new table();
                        new_thing.build_table((date -1), sp);
                        t_node things4 = new t_node(cal_name, new_thing);
                        calendar.insert(things4);
                    }
                    //work.build_table((date - 1), sp);//for program 4
                }

                else if (choice == 4) {

                    System.out.println("What is the name of the event would you like to add?");
                    obj.input.nextLine();
                    name = new String(obj.input.nextLine());

                    System.out.println("What is the day of the month the event is on.");
                    date = obj.input.nextInt();

                    System.out.println("What is the time of the event.");
                    obj.input.nextLine();
                    time = new String(obj.input.nextLine());

                    System.out.println("What class is it?");
                    sport = new String(obj.input.nextLine());

                    System.out.println("Is it group or individual? ");
                    game = new String(obj.input.nextLine());


                    school_classes sp = new school_classes(name, time, sport, game);
                    int to_add = 0;
                    System.out.println("Would you like to add into an existing calendar press 1");
                    System.out.println("Would you like to add this to a new calendar press 2");
                    to_add = obj.input.nextInt();
                    if(to_add == 1)
                    {
                        String search_name;
                        System.out.println("What calendar would you like to add to?");
                        obj.input.nextLine();
                        search_name = new String(obj.input.nextLine());
                        calendar.search((date -1), search_name, sp);

                    }
                    else
                    {
                        String cal_name;

                        System.out.println("What is the name of the new calendar?");
                        obj.input.nextLine();
                        cal_name = new String(obj.input.nextLine());
                        table new_thing = new table();
                        new_thing.build_table((date -1), sp);
                        t_node things4 = new t_node(cal_name, new_thing);
                        calendar.insert(things4);
                    }
                    //school.build_table((date - 1), sp);//for program 4
                }
                //this was for removal of one for program number four
/*
                if(choice == 5)
                {
                    System.out.println("What is the name of the event you would like to remove?");
                    obj.input.nextLine();
                    to_remove = new String(obj.input.nextLine());

                    stuff.remove_by_name(to_remove);
                }

 */
                if(choice == 5)
                {
                    calendar.remove_all();
                }




                }while(choice != 0);








        }
	// write your code here



}


