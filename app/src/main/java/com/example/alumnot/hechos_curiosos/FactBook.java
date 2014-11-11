package com.example.alumnot.hechos_curiosos;

import android.content.Context;
import android.content.res.Resources;

import java.util.Random;

/**
 * Created by AlumnoT on 06/11/2014.
 */
public class FactBook{

static String[] mFacts;

    FactBook(Context contexto){
        Resources res = contexto.getResources();
        mFacts = res.getStringArray(R.array.hechos);
    }




public static String getRandomFact(){

    Random randomGenerator = new Random();

    //create a random number based on the number of elements from array
    int randomNumber = randomGenerator.nextInt(mFacts.length);

    //update fact
    String newFact = mFacts[randomNumber];

    return newFact;
}
}
