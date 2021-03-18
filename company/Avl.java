//Author: Leah Moser
//Date: 3/6/20
//Program 5: A calendar application using an AVL self balancing tree
//This is the portion of th program that is in charge of the insertion into the self balancing tree
//The tree node keeps has a variable that keeps track of the height and based on that the tree rotates
//one or twice depending on the "balance" factor or height.

package com.company;

public class Avl {
    protected t_node root; // root of the tree

    public Avl()
            //default constructor
    {
        root = null;
    }

    private int height(t_node node)
            //resets the height variable each time a new node is inserted. I use this for the balance factor
            //which tells the tree to rotate one or twice.
    {
        if(node ==null)
            return -1;
        else return node.height;

    }

    private int max(int lhs, int rhs)
            //checks weather the right or left side of the tree is higher or unbalanced
    {
        if(lhs > rhs)
        {
            return lhs;
        }
        else {
            return rhs;
        }

    }


    public void insert(t_node to_add)
       //wrapper function for insertion into balanced tree
    {

        root = insert(to_add, root);

    }

    protected  t_node insert(t_node to_add, t_node root)
            //recursive insertion into balanced tree
    {
        if(root == null)
        {
            root = to_add; //assigning root to the new node for insertion
        }

        else if(root.find_cname().compareToIgnoreCase(to_add.find_cname())>= 0) //compares to go left or right
        {
            root.set_left(insert(to_add, root.get_left())); //recursive go left
            if(height(root.get_left()) - height(root.get_right()) == 2)//compare the heights to see if we need to rotate
            {
                if(to_add.find_cname().compareToIgnoreCase(root.get_left().find_cname()) < 0)
                {
                    root = rotate_left_child(root);
                }
                else
                {
                    root = double_rotate_left_child(root);
                }
            }


        }
        else
        {
            root.set_right(insert(to_add, root.get_right()));//recursive go right

            if(height(root.get_right()) - height(root.get_left()) == 2) //the check for rotation
            {
                if(to_add.find_cname().compareToIgnoreCase(root.get_right().find_cname())>= 0)
                {
                    root = rotate_right_child(root);
                }
                else
                {
                    root = double_rotate_right_child(root);
                }
            }

        }

        root.height = max(height(root.get_left()), height(root.get_right())) + 1;
        return root;


    }
    private t_node rotate_left_child(t_node current)
            //takes in root as current and does a rotation by setting it to currents left child to swap
    {
        t_node swap = current.get_left();
        current.set_left(swap.get_right());
        swap.set_right(current);
        current.height = max(height(current.get_left()), height(current.get_right())) + 1;
        swap.height = max(height(swap.get_left()), current.height) + 1;
        return swap;
    }

    private t_node rotate_right_child(t_node current)
            //does the same thing but with roots right child
    {
        t_node swap = current.get_right();
        current.set_right(swap.get_left());
        swap.set_left(current);
        current.height = max(height(current.get_left()), height(current.get_right())) + 1;
        swap.height = max(height(swap.get_right()), current.height) + 1;
        return swap;
    }


    private t_node double_rotate_left_child(t_node current)
            //this takes in root as current and does the double rotation calling on the rotate left function
    {
        current.set_left(rotate_right_child(current.get_left()));
        return rotate_left_child(current);
    }

    private t_node double_rotate_right_child(t_node current)
            //same thing as above but for right double rotate
    {
        current.set_right(rotate_left_child(current.get_right()));
        return rotate_right_child(current);
    }


//lines 141 to 169 are an insert for a regular bst I used for testing


    /*
    protected t_node insert(t_node root, t_node node)


         //regular bst insert
    {
        if(root == null)
        {
            root = new t_node();
            root = node;
            root.set_right(null);
            root.set_left(null);
            //root = fix_insert(root);
            return root;
        }
         else if(root.find_cname().compareToIgnoreCase(node.find_cname())<= 0) {
            root.set_left(insert(root.get_left(), node));

        }
        else {
            root.set_right(insert(root.get_right(), node));


        }
        return root;

        }

    */

        public void display_tree_inorder()
                //displays balanced tree in order you are then able to draw it out to see if its balanced
                //wrapper funtion
        {
            if(root == null)
            {
                System.out.println("The tree is empty!");
                return;
            }
            display_tree_inorder(root);
        }

        protected void display_tree_inorder(t_node root)
                //recursive function
        {
            if(root == null)
            {
                return;
            }
            display_tree_inorder(root.get_left());
            root.display_t_node();
            display_tree_inorder(root.get_right());
        }



    public void search(int index, String c_name, event to_add)
            //searches the tree to add to existing calendar
            //wrapper function
    {
       int katch = search(index, c_name, to_add, root);
       if (katch != 1)
       {
           System.out.println("The name doesn't exist in the tree.");
       }

    }

    protected int search(int index, String c_name, event to_add, t_node root)
            //recursive function
    {
        if(root == null)
        {
            return 0;
        }

        if(root.find_cname().compareToIgnoreCase(c_name) == 0)
        {
            root.insert_node(index, to_add);
            return 1;

        }

        else if(root.find_cname().compareToIgnoreCase(c_name) >0)
            return search(index, c_name, to_add, root.get_left());
        else
        return search(index, c_name, to_add, root.get_right());


    }

    public void remove_all()
            //wrapper function to remove all the nodes in the balanced tree
    {
        root = remove_all(root);
    }

    protected t_node remove_all(t_node root)
            //recursive function for remove all the nodes in the tree
    {
        if(root == null)
        {
            return null;
        }
        remove_all(root.get_left());
        remove_all(root.get_right());
        root = null;
        return root;
    }



}
