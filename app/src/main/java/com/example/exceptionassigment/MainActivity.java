package com.example.exceptionassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] arr = new int [10];
        try {
            int x= arr[30]; //חריגה מגבולות המערך
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("An error occurred while accessing the array: " + e.getMessage());
        }

        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }






    }
}