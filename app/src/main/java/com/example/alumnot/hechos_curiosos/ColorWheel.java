package com.example.alumnot.hechos_curiosos;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by AlumnoT on 06/11/2014.
 */
public class ColorWheel {

    public static String[] colors ={

            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"

    };

    public static int randomColor(){

        Random randomGenerator = new Random();

        //create a random number based on the number of elements from array
        int randomNumber = randomGenerator.nextInt(colors.length);
        String newColor = colors[randomNumber];
        int color= Color.parseColor(newColor);
        return color;
    }
}
