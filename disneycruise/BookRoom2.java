package com.example.stephanie.disneycruise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.Toast;

public class BookRoom2 extends AppCompatActivity {
    //variables total of rooms
    double totRoom = 0;
    double totCoc = 0;
    double totDel = 0;
    double totVera = 0;
    double totState = 0;
    //variables for of rooms selected
    int c = 0;
    int d = 0;
    int v = 0;
    int st = 0;
    //variables for adult and children input
    int adnum = 1;
    int kidsnum = 0;
    //variables for total of adults and kids permitted per room
    int maxAdConc = 2;
    int maxKidConc = 3;
    int maxAdDel = 4;
    int maxKidDel = 5;
    int maxAdVera = 3;
    int maxKidVera = 3;
    int maxAdState = 2;
    int maxKidState = 1;
    //total number of adults and kids
    int totalGuest = 0;
    int totalKidGuest = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_room2);

        //room price
        final double CONCPRICE = 1500;
        final double DELUXPRICE = 1000;
        final double VERAPRICE = 750;
        final double STATEPRICE = 500;

        //buttons and name input
        final EditText fullName = (EditText) findViewById(R.id.fullName);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);

        //cabins selection
        final TableRow cabin1 = (TableRow) findViewById(R.id.cabin1);
        final TableRow cabin2 = (TableRow) findViewById(R.id.cabin2);
        final TableRow cabin3 = (TableRow) findViewById(R.id.cabin3);
        final TableRow cabin4 = (TableRow) findViewById(R.id.cabin4);
        final TableRow cabin5 = (TableRow) findViewById(R.id.cabin5);
        final TableRow cabin6 = (TableRow) findViewById(R.id.cabinBtn);

        //deck floor selection
        final TableRow deck1 = (TableRow) findViewById(R.id.deck1);
        final TableRow deck2 = (TableRow) findViewById(R.id.deck2);
        final TableRow deck3 = (TableRow) findViewById(R.id.deck3);
        final TableRow deck4 = (TableRow) findViewById(R.id.deck4);
        final TableRow deck5 = (TableRow) findViewById(R.id.deckBtn);

        //cabin checkboxes
        final CheckBox concierge = (CheckBox) findViewById(R.id.concierge);
        final CheckBox delux = (CheckBox) findViewById(R.id.delux);
        final CheckBox verandah = (CheckBox) findViewById(R.id.verandah);
        final CheckBox stateroom = (CheckBox) findViewById(R.id.stateroom);

        //deck floor checkboxes
        final CheckBox deckbox1 = (CheckBox)findViewById(R.id.deckbox1);
        final CheckBox deckbox2 = (CheckBox)findViewById(R.id.deckbox2);
        final CheckBox deckbox3 = (CheckBox)findViewById(R.id.deckbox3);
        final CheckBox deckbox4 = (CheckBox)findViewById(R.id.deckbox4);
        final CheckBox deckbox5 = (CheckBox)findViewById(R.id.deckbox5);
        final CheckBox deckbox6 = (CheckBox)findViewById(R.id.deckbox6);

        //cabins invisible
        cabin1.setVisibility(View.INVISIBLE);
        cabin2.setVisibility(View.INVISIBLE);
        cabin3.setVisibility(View.INVISIBLE);
        cabin4.setVisibility(View.INVISIBLE);
        cabin5.setVisibility(View.INVISIBLE);
        cabin6.setVisibility(View.INVISIBLE);

        //deck floor invisible
        deck1.setVisibility(View.INVISIBLE);
        deck2.setVisibility(View.INVISIBLE);
        deck3.setVisibility(View.INVISIBLE);
        deck4.setVisibility(View.INVISIBLE);
        deck5.setVisibility(View.INVISIBLE);

        //button 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //name string
                //not outside and declared final in case the person wants to change the name later
                String name = fullName.getText().toString();

                //if no name input give error
                if(name.matches("")){
                    Toast.makeText(getApplication(), "Please write your full name!",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    //set cabin selection visible
                    cabin1.setVisibility(View.VISIBLE);
                    cabin2.setVisibility(View.VISIBLE);
                    cabin3.setVisibility(View.VISIBLE);
                    cabin4.setVisibility(View.VISIBLE);
                    cabin5.setVisibility(View.VISIBLE);
                    cabin6.setVisibility(View.VISIBLE);
                }
            }
        });

        //button 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cabin number input and number of adults and kids imput
                //not outside and declared final in case the person wants to change the number of cabins
                EditText concNum = (EditText) findViewById(R.id.concNum);
                EditText deluxNum = (EditText) findViewById(R.id.deluxNum);
                EditText veraNum = (EditText) findViewById(R.id.veraNum);
                EditText stateNum = (EditText) findViewById(R.id.stateNum);
                EditText adultsNUm = (EditText) findViewById(R.id.adultNum);
                EditText childNum = (EditText) findViewById(R.id.childNum);
                String conc = concNum.getText().toString();
                String delx = deluxNum.getText().toString();
                String vera = veraNum.getText().toString();
                String state = stateNum.getText().toString();
                String ads = adultsNUm.getText().toString();
                String kids = childNum.getText().toString();

                //accepts an empty input
                if (ads.matches("")) {
                } else {
                    //if not empty parse it
                    adnum = Integer.parseInt(ads) + 1;
                }
                //accepts an empty input
                if (kids.matches("")) {
                } else {
                    //if not empty parse it
                    kidsnum = Integer.parseInt(kids);
                }
                //if CONCIERGE cabin in selected
                if (concierge.isChecked()) {

                    if (conc.matches("")) {
                        //if the guest don't input the number of cabins give error and don't show the next set of options
                        Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                Toast.LENGTH_LONG).show();
                    } else {
                        //set deck options visible
                        deck1.setVisibility(View.VISIBLE);
                        deck2.setVisibility(View.VISIBLE);
                        deck3.setVisibility(View.VISIBLE);
                        deck4.setVisibility(View.VISIBLE);
                        deck5.setVisibility(View.VISIBLE);
                    }
                }

                //if DELUX cabin is selected
                if (delux.isChecked()) {

                    if (delx.matches("")) {
                        //if the guest don't input the number of cabins give error and don't show the next set of options
                        Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                Toast.LENGTH_LONG).show();

                    } else {
                        //set deck options visible
                        deck1.setVisibility(View.VISIBLE);
                        deck2.setVisibility(View.VISIBLE);
                        deck3.setVisibility(View.VISIBLE);
                        deck4.setVisibility(View.VISIBLE);
                        deck5.setVisibility(View.VISIBLE);
                    }
                }

                //if VERANDAH cabin is selected
                if (verandah.isChecked()) {
                    if (vera.matches("")) {
                        //if the guest don't input the number of cabins give error and don't show the next set of options
                        Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                Toast.LENGTH_LONG).show();
                    } else {
                        //set deck options visible
                        deck1.setVisibility(View.VISIBLE);
                        deck2.setVisibility(View.VISIBLE);
                        deck3.setVisibility(View.VISIBLE);
                        deck4.setVisibility(View.VISIBLE);
                        deck5.setVisibility(View.VISIBLE);
                    }
                }

                //if STATEROOM cabin is selected
                if (stateroom.isChecked()) {

                    if (state.matches("")) {
                        //if the guest don't input the number of cabins give error and don't show the next set of options
                        Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                Toast.LENGTH_LONG).show();
                    } else {
                        //set deck options visible
                        deck1.setVisibility(View.VISIBLE);
                        deck2.setVisibility(View.VISIBLE);
                        deck3.setVisibility(View.VISIBLE);
                        deck4.setVisibility(View.VISIBLE);
                        deck5.setVisibility(View.VISIBLE);
                    }
                }

                //if no cabin is selected give error
                if (concierge.isChecked() == false && delux.isChecked() == false && verandah.isChecked() == false && stateroom.isChecked() == false) {
                    Toast.makeText(getApplication(), "Please select at least one room option!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        //button 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cabin number input
                //not outside and declared final in case the person wants to change the number of cabins
                EditText concNum = (EditText) findViewById(R.id.concNum);
                EditText deluxNum = (EditText) findViewById(R.id.deluxNum);
                EditText veraNum = (EditText) findViewById(R.id.veraNum);
                EditText stateNum = (EditText) findViewById(R.id.stateNum);
                EditText adultsNUm = (EditText) findViewById(R.id.adultNum);
                EditText childNum = (EditText) findViewById(R.id.childNum);
                String conc = concNum.getText().toString();
                String delx = deluxNum.getText().toString();
                String vera = veraNum.getText().toString();
                String state = stateNum.getText().toString();
                String ads = adultsNUm.getText().toString();
                String kids = childNum.getText().toString();

                //accepts an empty input
                if (ads.matches("")){}
                else{
                    //if not empty parse it
                    adnum = Integer.parseInt(ads) + 1;
                }
                //accepts an empty input
               if (kids.matches("")){}
                else{
                   //if not empty parse it
                    kidsnum = Integer.parseInt(kids);
                }

                //if no deck floor is selected give error
                if (deckbox1.isChecked() == false && deckbox2.isChecked() == false && deckbox3.isChecked() == false && deckbox4.isChecked() == false && deckbox5.isChecked() == false && deckbox6.isChecked() == false){
                    Toast.makeText(getApplication(), "Please select a Deck Floor!",
                            Toast.LENGTH_LONG).show();
                }

                else {
                    if(concierge.isChecked()){
                        //if CONCIERGE is selected but no input for number of rooms give error
                        if (conc.matches("")) {
                            Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                    Toast.LENGTH_LONG).show();
                        }
                        else{
                            //parse number of room input
                            c = Integer.parseInt(conc);
                            //add a total price for this room
                            totCoc = CONCPRICE * c;
                            //add total number of adults possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of adults if any other room is selected
                            totalGuest += maxAdConc * c;
                            //add total number of kids possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of kids if any other room is selected
                            totalKidGuest += maxKidConc * c;
                        }
                    }
                    if (delux.isChecked()) {
                        //if DELUX is selected but no input for number of rooms give error
                        if (delx.matches("")) {
                            Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                    Toast.LENGTH_LONG).show();

                        }
                        else {
                            //parse number of room input
                            d = Integer.parseInt(delx);
                            //add a total price for this room
                            totDel = DELUXPRICE * d;
                            //add total number of adults possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of adults if any other room is selected
                            totalGuest += maxAdDel * d;
                            //add total number of kids possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of kids if any other room is selected
                            totalKidGuest += maxKidDel * d;
                        }
                    }

                    if (verandah.isChecked()) {
                        //if VERANDAH is selected but no input for number of rooms give error
                        if (vera.matches("")) {
                            Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                    Toast.LENGTH_LONG).show();
                        }
                        else {
                            //parse number of room input
                            v = Integer.parseInt(vera);
                            //add a total price for this room
                            totVera = VERAPRICE * v;
                            //add total number of adults possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of adults if any other room is selected
                            totalGuest += maxAdVera * v;
                            //add total number of kids possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of kids if any other room is selected
                            totalKidGuest += maxKidVera * v;
                        }
                    }

                    if (stateroom.isChecked()) {
                        //if STATEROOM is selected but no input for number of rooms give error
                        if (state.matches("")) {
                            Toast.makeText(getApplication(), "Please enter the number of rooms!",
                                    Toast.LENGTH_LONG).show();
                        }
                        else {
                            //parse number of room input
                            st = Integer.parseInt(state);
                            //add a total price for this room
                            totState = STATEPRICE * st;
                            //add total number of adults possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of adults if any other room is selected
                            totalGuest += maxAdState * st;
                            //add total number of kids possible with the MAXIMUM of adults possible for this room room
                            //(+=) so it add to the MAXIMUM number of kids if any other room is selected
                            totalKidGuest += maxKidState * st;
                        }
                    }

                    //total room price
                    totRoom = totCoc + totDel + totState + totVera;
                    //clear the total price per room so it doesn't keep adding up every time the button is clicked
                    totDel = 0;
                    totCoc = 0;
                    totState = 0;
                    totVera = 0;

                    //if the number of adults inputted is bigger than the TOTAL available number of adults for this room selection give error
                    if (adnum > totalGuest){
                        Toast.makeText(getApplication(), "Too many Adults for this room selection!",
                                Toast.LENGTH_LONG).show();
                        //clear the total adult guests so it doesn't keep adding up.
                        totalGuest = 0;
                        //keep adults at 1
                        adnum = 1;
                    }

                    //if the number of children inputted is bigger than the TOTAL available number of children for this room selection give error
                    else if (kidsnum > totalKidGuest) {
                        Toast.makeText(getApplication(), "Too many Kids for this room selection! " + totalKidGuest + " " + totalGuest,
                                Toast.LENGTH_LONG).show();
                        //clear total kids guest so it doesn't keep adding up
                        totalKidGuest = 0;
                    }

                    //if any room is selected but nothing in inputted for number of room the error will show because of the condition previously setted
                    else if(concierge.isChecked() && conc.matches("")|| delux.isChecked() && delx.matches("") || verandah.isChecked() && vera.matches("")|| stateroom.isChecked() && state.matches("")){
                        //clear totals so it doesn't add up
                        totalGuest = 0;
                        totalKidGuest = 0;
                        //keep adults at 1
                        adnum = 1;
                    }

                    //if all conditions are met go to next page
                    else {
                        Intent i = new Intent(BookRoom2.this, Party.class);
                        startActivity(i);
                        //test if correct data is applied
                        //Toast.makeText(getApplication(), "Total adults possible: " + totalGuest + " total Kids possible " + totalKidGuest + " total adults selected: " + adnum + " total kids selected: " + kidsnum + " total price of all rooms: " + totRoom,
                                //Toast.LENGTH_LONG).show();
                        //clear input in case the person goes back and changes anything so it doesn't add up
                        //not sure how this will transfer to the SQLITE but we can change this if needed
                        totalGuest = 0;
                        totalKidGuest = 0;
                        totRoom = 0;
                        adnum = 1;
                    }
                }
            }
        });
    }
}
