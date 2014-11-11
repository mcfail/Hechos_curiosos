package com.example.alumnot.hechos_curiosos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class hc_main extends Activity {

    FactBook factBook;
    RelativeLayout fondo;
    Button bot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc_main);

        factBook = new FactBook(this);

    }


    public void factButtonAction(View view) {
        //generate a random number to get an entry from the array
        //Toast.makeText(this,"entra",Toast.LENGTH_LONG).show();
        TextView factLabel = (TextView)findViewById(R.id.hechoCurioso);
        String newFact= FactBook.getRandomFact();
        fondo=(RelativeLayout)findViewById(R.id.curiosidadesLayout);
        bot=(Button)findViewById(R.id.botonCurioso);
        factLabel.setText(newFact);
        fondo.setBackgroundColor(ColorWheel.randomColor());
        bot.setBackgroundColor(ColorWheel.randomColor());

    }


}
