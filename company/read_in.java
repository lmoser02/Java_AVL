//Author:Leah Moser
//Date: 3/20/12
//Program: Calendar Application
//This is the read in file source code
//I looked it up in the book to figure out how best to do it




package com.company;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;




public class read_in {

    private String path;

    public read_in(String file_path)
    {
        path = file_path;
    }

    public String [] OpenFile() throws IOException
    {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);


        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        int i;
        for(i = 0; i < numberOfLines; ++i)
        {
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;

    }

    int readLines() throws IOException
    {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        String aLine;
        int numberOfLines = 0;

        while((aLine = bf.readLine()) != null)
        {
            ++numberOfLines;
        }
        bf.close();
        return numberOfLines;
    }

}
