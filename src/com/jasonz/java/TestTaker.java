package com.jasonz.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTaker {
    public TestTaker(){
        Scanner sc;
        System.out.println("Type the exact location to the input file (Include the .txt part in the path)");
        Scanner loc = new Scanner(System.in);
        String location=loc.nextLine();
        try {
             sc = new Scanner(new File(location));
        } catch (FileNotFoundException e) {
            System.out.println("The path was not found, make sure you enter the exact path to the file including the .txt part");
            return;
        }
        System.out.println(sc.nextLine());
    }
    public static void main(String[] args) {
        TestTaker test = new TestTaker();
    }
}
