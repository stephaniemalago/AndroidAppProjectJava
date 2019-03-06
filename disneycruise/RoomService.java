package com.example.stephanie.disneycruise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class RoomService extends AppCompatActivity {
    //variable for total price
    double totalPrice = 0;
    //variable for quantity inputs
    double hambQuant = 0;
    double frieQuant = 0;
    double peppQuant = 0;
    double cheeseQuant = 0;
    double cokeQuant = 0;
    double orangQuant = 0;
    double appleQuant = 0;
    double waterQuant = 0;
    double vanillaQuant = 0;
    double chocQuant = 0;
    double strawQuant = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_service);

        //buttons
        Button btnUpdate = (Button) findViewById(R.id.updateBtn);
        Button btnSubmit = (Button) findViewById(R.id.submitBtn);
        Button btnBack = (Button) findViewById(R.id.backBtn);

        //food checkboxes
        final CheckBox hamburguerCbx = (CheckBox) findViewById(R.id.hamChbx);
        final CheckBox friesCbx = (CheckBox) findViewById(R.id.frieChbx);
        final CheckBox pepperoniCbx = (CheckBox) findViewById(R.id.pepChbx);
        final CheckBox cheeseCbx = (CheckBox) findViewById(R.id.cheeseChbx);

        //drink checkboxes
        final CheckBox cokeCbx = (CheckBox) findViewById(R.id.cokeChbx);
        final CheckBox orangeCbx = (CheckBox) findViewById(R.id.orangeChbx);
        final CheckBox appleCbx = (CheckBox) findViewById(R.id.appleChbx);
        final CheckBox waterCbx = (CheckBox) findViewById(R.id.waterChbx);

        //dessert checkboxes
        final CheckBox vanillaCbx = (CheckBox) findViewById(R.id.vanillaChbx);
        final CheckBox chocolateCbx = (CheckBox) findViewById(R.id.chocChbx);
        final CheckBox strawberryCbx = (CheckBox) findViewById(R.id.strawChbx);

        //final prices
        final double HAMBURGUERPRICE = 5;
        final double FRIESPRICE = 4;
        final double PEPPERONIPRICE = 12;
        final double CHEESEPRICE = 10;
        final double COKEPRICE = 2;
        final double ORANGEPRICE = 3;
        final double APPLEPRICE = 3;
        final double WATERPRICE = 3;
        final double VANILLAPRICE = 4;
        final double CHOCOLATEPRICE = 4;
        final double STRAWBERRYPRICE = 4;

        //back to the main menu button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RoomService.this, Menu.class);
                startActivity(i);
            }
        });

        //update price button
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView total = (TextView) findViewById(R.id.totalPrice);
                EditText hamburguerNum = (EditText) findViewById(R.id.hamNum);
                EditText friesNum = (EditText) findViewById(R.id.frieNum);
                EditText pepperoniNum = (EditText) findViewById(R.id.pepNum);
                EditText cheeseNum = (EditText) findViewById(R.id.cheeseNum);
                EditText cokeNum = (EditText) findViewById(R.id.cokeNum);
                EditText orangeNum = (EditText) findViewById(R.id.orangeNum);
                EditText appleNUm = (EditText) findViewById(R.id.appleNum);
                EditText waterNum = (EditText) findViewById(R.id.waterNum);
                EditText vanillaNum = (EditText) findViewById(R.id.vanillaNum);
                EditText chocolateNum = (EditText) findViewById(R.id.chocNum);
                EditText strawberryNum = (EditText) findViewById(R.id.strawNum);
                String totalStr = total.getText().toString();
                String hamburguerStr = hamburguerNum.getText().toString();
                String friesStr = friesNum.getText().toString();
                String pepperoniStr = pepperoniNum.getText().toString();
                String cheeseStr = cheeseNum.getText().toString();
                String cokeStr = cokeNum.getText().toString();
                String orangeStr = orangeNum.getText().toString();
                String appleStr = appleNUm.getText().toString();
                String waterStr = waterNum.getText().toString();
                String vanillaStr = vanillaNum.getText().toString();
                String chocolateStr = chocolateNum.getText().toString();
                String strawberryStr = strawberryNum.getText().toString();

                if(hamburguerCbx.isChecked() && hamburguerStr.matches("")||friesCbx.isChecked() && friesStr.matches("")||
                        pepperoniCbx.isChecked() && pepperoniStr.matches("")||cheeseCbx.isChecked() && cheeseStr.matches("")||
                        cokeCbx.isChecked() && cokeStr.matches("")||orangeCbx.isChecked() && orangeStr.matches("")||
                        appleCbx.isChecked() && appleStr.matches("")||waterCbx.isChecked() && waterStr.matches("")||
                        vanillaCbx.isChecked() && vanillaStr.matches("")||chocolateCbx.isChecked() && chocolateStr.matches("")||
                        strawberryCbx.isChecked() && strawberryStr.matches(""))
                {
                    Toast.makeText(getApplication(), "One of the items selected DOESN'T have a QUANTITY!",
                            Toast.LENGTH_LONG).show();
                }

                else
                {
                    if(hamburguerStr.matches("")){}
                    else {
                        hambQuant = Double.parseDouble(hamburguerStr);
                    }
                    if(friesStr.matches("")){}
                    else{
                        frieQuant = Double.parseDouble(friesStr);
                    }
                    if(pepperoniStr.matches("")){}
                    else {
                        peppQuant = Double.parseDouble(pepperoniStr);
                    }
                    if(cheeseStr.matches("")){}
                    else {
                        cheeseQuant = Double.parseDouble(cheeseStr);
                    }
                    if(cokeStr.matches("")){}
                    else {
                        cokeQuant = Double.parseDouble(cokeStr);
                    }
                    if(orangeStr.matches("")){}
                    else {
                        orangQuant = Double.parseDouble(orangeStr);
                    }
                    if(appleStr.matches("")){}
                    else {
                        appleQuant = Double.parseDouble(appleStr);
                    }
                    if(waterStr.matches("")){}
                    else {
                        waterQuant = Double.parseDouble(waterStr);
                    }
                    if(vanillaStr.matches("")){}
                    else {
                        vanillaQuant = Double.parseDouble(vanillaStr);
                    }
                    if(chocolateStr.matches("")){}
                    else {
                        chocQuant = Double.parseDouble(chocolateStr);
                    }
                    if(strawberryStr.matches("")){}
                    else {
                        strawQuant = Double.parseDouble(strawberryStr);
                    }

                    totalPrice = (HAMBURGUERPRICE * hambQuant) + (FRIESPRICE * frieQuant) + (PEPPERONIPRICE * peppQuant) +
                            (CHEESEPRICE * cheeseQuant) + (COKEPRICE * cokeQuant) + (ORANGEPRICE * orangQuant) + (APPLEPRICE * appleQuant) +
                            (WATERPRICE * waterQuant) + (VANILLAPRICE * vanillaQuant) + (CHOCOLATEPRICE * cheeseQuant) +
                            (STRAWBERRYPRICE * strawQuant);

                    total.setText("Total: $" + totalPrice);
                    hambQuant=0;
                    frieQuant=0;
                    peppQuant=0;
                    cheeseQuant=0;
                    cokeQuant=0;
                    orangQuant=0;
                    appleQuant=0;
                    waterQuant=0;
                    vanillaQuant=0;
                    chocQuant=0;
                    strawQuant=0;

                }

            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView total = (TextView) findViewById(R.id.totalPrice);
                EditText hamburguerNum = (EditText) findViewById(R.id.hamNum);
                EditText friesNum = (EditText) findViewById(R.id.frieNum);
                EditText pepperoniNum = (EditText) findViewById(R.id.pepNum);
                EditText cheeseNum = (EditText) findViewById(R.id.cheeseNum);
                EditText cokeNum = (EditText) findViewById(R.id.cokeNum);
                EditText orangeNum = (EditText) findViewById(R.id.orangeNum);
                EditText appleNUm = (EditText) findViewById(R.id.appleNum);
                EditText waterNum = (EditText) findViewById(R.id.waterNum);
                EditText vanillaNum = (EditText) findViewById(R.id.vanillaNum);
                EditText chocolateNum = (EditText) findViewById(R.id.chocNum);
                EditText strawberryNum = (EditText) findViewById(R.id.strawNum);
                String totalStr = total.getText().toString();
                String hamburguerStr = hamburguerNum.getText().toString();
                String friesStr = friesNum.getText().toString();
                String pepperoniStr = pepperoniNum.getText().toString();
                String cheeseStr = cheeseNum.getText().toString();
                String cokeStr = cokeNum.getText().toString();
                String orangeStr = orangeNum.getText().toString();
                String appleStr = appleNUm.getText().toString();
                String waterStr = waterNum.getText().toString();
                String vanillaStr = vanillaNum.getText().toString();
                String chocolateStr = chocolateNum.getText().toString();
                String strawberryStr = strawberryNum.getText().toString();

                if(hamburguerCbx.isChecked() && hamburguerStr.matches("")||friesCbx.isChecked() && friesStr.matches("")||
                        pepperoniCbx.isChecked() && pepperoniStr.matches("")||cheeseCbx.isChecked() && cheeseStr.matches("")||
                        cokeCbx.isChecked() && cokeStr.matches("")||orangeCbx.isChecked() && orangeStr.matches("")||
                        appleCbx.isChecked() && appleStr.matches("")||waterCbx.isChecked() && waterStr.matches("")||
                        vanillaCbx.isChecked() && vanillaStr.matches("")||chocolateCbx.isChecked() && chocolateStr.matches("")||
                        strawberryCbx.isChecked() && strawberryStr.matches(""))
                {
                    Toast.makeText(getApplication(), "One of the items selected DOESN'T have a QUANTITY!",
                            Toast.LENGTH_LONG).show();
                }

                else
                {
                    if(hamburguerStr.matches("")){}
                    else {
                        hambQuant = Double.parseDouble(hamburguerStr);
                    }
                    if(friesStr.matches("")){}
                    else{
                        frieQuant = Double.parseDouble(friesStr);
                    }
                    if(pepperoniStr.matches("")){}
                    else {
                        peppQuant = Double.parseDouble(pepperoniStr);
                    }
                    if(cheeseStr.matches("")){}
                    else {
                        cheeseQuant = Double.parseDouble(cheeseStr);
                    }
                    if(cokeStr.matches("")){}
                    else {
                        cokeQuant = Double.parseDouble(cokeStr);
                    }
                    if(orangeStr.matches("")){}
                    else {
                        orangQuant = Double.parseDouble(orangeStr);
                    }
                    if(appleStr.matches("")){}
                    else {
                        appleQuant = Double.parseDouble(appleStr);
                    }
                    if(waterStr.matches("")){}
                    else {
                        waterQuant = Double.parseDouble(waterStr);
                    }
                    if(vanillaStr.matches("")){}
                    else {
                        vanillaQuant = Double.parseDouble(vanillaStr);
                    }
                    if(chocolateStr.matches("")){}
                    else {
                        chocQuant = Double.parseDouble(chocolateStr);
                    }
                    if(strawberryStr.matches("")){}
                    else {
                        strawQuant = Double.parseDouble(strawberryStr);
                    }

                    totalPrice = (HAMBURGUERPRICE * hambQuant) + (FRIESPRICE * frieQuant) + (PEPPERONIPRICE * peppQuant) +
                            (CHEESEPRICE * cheeseQuant) + (COKEPRICE * cokeQuant) + (ORANGEPRICE * orangQuant) + (APPLEPRICE * appleQuant) +
                            (WATERPRICE * waterQuant) + (VANILLAPRICE * vanillaQuant) + (CHOCOLATEPRICE * cheeseQuant) +
                            (STRAWBERRYPRICE * strawQuant);

                    total.setText("Total: $" + totalPrice);
                    if(hamburguerCbx.isChecked()==false && friesCbx.isChecked()==false && pepperoniCbx.isChecked()==false &&
                            cheeseCbx.isChecked()==false && cokeCbx.isChecked()==false && orangeCbx.isChecked()==false && appleCbx.isChecked()==false &&
                            waterCbx.isChecked()==false && vanillaCbx.isChecked()==false && chocolateCbx.isChecked()==false &&
                            strawberryCbx.isChecked()==false){

                        Toast.makeText(getApplication(), "Nothing was Selected",
                                Toast.LENGTH_LONG).show();
                    }
                    else{
                    hamburguerNum.setText("");
                    friesNum.setText("");
                    pepperoniNum.setText("");
                    cheeseNum.setText("");
                    cokeNum.setText("");
                    orangeNum.setText("");
                    appleNUm.setText("");
                    waterNum.setText("");
                    vanillaNum.setText("");
                    chocolateNum.setText("");
                    strawberryNum.setText("");

                    if(hamburguerCbx.isChecked()){
                        hamburguerCbx.toggle();
                    }
                    if(friesCbx.isChecked()){
                        friesCbx.toggle();
                    }
                    if(pepperoniCbx.isChecked()){
                        pepperoniCbx.toggle();
                    }
                    if(cheeseCbx.isChecked()){
                        cheeseCbx.toggle();
                    }

                    if(cokeCbx.isChecked()){
                        cokeCbx.toggle();
                    }
                    if(orangeCbx.isChecked()){
                        orangeCbx.toggle();
                    }
                    if(appleCbx.isChecked()){
                        appleCbx.toggle();
                    }
                    if(waterCbx.isChecked()){
                        waterCbx.toggle();
                    }
                    if(vanillaCbx.isChecked()){
                        vanillaCbx.toggle();
                    }
                    if(chocolateCbx.isChecked()){
                        chocolateCbx.toggle();
                    }
                    if(strawberryCbx.isChecked()){
                        strawberryCbx.toggle();
                    }



                    Toast.makeText(getApplication(), "Order Submitted! Your total is: " + totalPrice,
                            Toast.LENGTH_LONG).show();}

                    hambQuant=0;
                    frieQuant=0;
                    peppQuant=0;
                    cheeseQuant=0;
                    cokeQuant=0;
                    orangQuant=0;
                    appleQuant=0;
                    waterQuant=0;
                    vanillaQuant=0;
                    chocQuant=0;
                    strawQuant=0;

                }



            }
        });

    }


}
