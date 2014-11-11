package com.example.alumnot.hechos_curiosos;

import java.util.Random;

/**
 * Created by AlumnoT on 06/11/2014.
 */
public class FactBook {

public static String[] mFacts ={
        "Las hormigas se estiran cuando se despiertan por la mañana",
        "Las avestruces pueden correr más rápido que los caballos",
        "Las medallas de oro de los juegos olímpicos están hechas de plata",
        "Naciste con 300 huesos. En la edad adulta tendrás sólo 206",
        "La luz del sol tarda 8 minutos en llegar a la tierra",
        "Peter Parker es Spiderman",
         "Algunas plantas de bambú pueden llegar a crecer 1m al día",
         "Batman es Bruce Wayne",
         "Halloween nunca cae en viernes 13",
         "Correlación no implica causalidad",

    };

public static String getRandomFact(){

    Random randomGenerator = new Random();

    //create a random number based on the number of elements from array
    int randomNumber = randomGenerator.nextInt(mFacts.length);

    //update fact
    String newFact = mFacts[randomNumber];

    return newFact;
}
}
