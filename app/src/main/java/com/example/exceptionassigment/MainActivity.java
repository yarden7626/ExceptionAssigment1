package com.example.exceptionassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //חריגה 1
            int[] arr = new int[10];
            try {
                int x = arr[30]; //חריגה מגבולות המערך
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An error occurred while accessing the array: " + e.getMessage());
            }
            //חריגה 2
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }


            try {
                firstFunction();
            } catch (Exception e) {
                System.out.println("Exception caught in main: " + e.getMessage());
            }
        }

        //פונקציה ראשונה
        public static void firstFunction() {
            try {
                secondFunction(); //קריאה לפונקציה השנייה
            } catch (Exception e) {
                System.out.println("Exception caught in firstFunction: " + e.getMessage());
            }
        }
        //פונקציה שנייה
        public static void secondFunction() throws Exception {
            thirdFunction(); //קריאה לפונקציה השלישית
        }
        //פונקציה שלישית
        public static void thirdFunction() throws Exception {
            // יצירת חריגה
            throw new Exception("This is an exception from thirdFunction.");
        }
    }
