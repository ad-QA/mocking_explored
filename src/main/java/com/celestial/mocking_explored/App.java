/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.mocking_explored;

/**
 *
 * @author selvy
 */
public class App
{
    public static void main( String[] args )
    {
        TextFileLoader tfl = new TextFileLoader();
        String fname = "C:\\tmp\\KeyboardHandler.java.txt";
        Iterable<String> lines = tfl.loadData(fname);

        
        lines.forEach((element) ->{
            System.out.println(element);
        });

        DataLoader dl = new DataLoader(tfl);
        long noOfChars = dl.loadData(fname);
        System.out.println("No of Characters in the file: "+noOfChars);
    }
    
}
