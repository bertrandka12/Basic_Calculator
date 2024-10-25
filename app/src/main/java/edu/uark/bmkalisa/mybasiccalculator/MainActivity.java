//Name: Bertrand Munihuzi Kalisa
//csce 4623
//HW1 MyBasic Calculator android App

package edu.uark.bmkalisa.mybasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calculate, results;
    private String curr, res;
    private Button btn0, btn1, btn2, btn3, btn4 , btn5, btn6, btn7, btn8, btn9, btnAC, btnPosNeg, btnDel, btnDiv, btnMul, btnAdd, btnSub, btnEqual, btnDec;

    private boolean pointIsInserted, operatorIsInserted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = (TextView) findViewById(R.id.calculation);
        results = (TextView) findViewById(R.id.result);
        curr = "";
        res = "";
        pointIsInserted =false;
        operatorIsInserted = false;

        //Initializing all the private variables to their matching buttons
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnPosNeg = (Button) findViewById(R.id.btnPosNeg);
        btnDel = (Button) findViewById(R.id.btnDelete);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDec = (Button) findViewById(R.id.btnDecimal);

        //setting all buttons to onclick events
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "0";
                displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "9";
                displayOne();
            }
        });

        //clickListeners for Operators
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set pointIsInserted to false
                pointIsInserted = false;

                if(!curr.isEmpty()){
                    //checking if last character is a point(.) then we remove it if last char is a "."
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }

                    //checking if operatorIsInserted is false
                    if(operatorIsInserted == false){
                        curr = curr + " ÷ ";
                        operatorIsInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set pointIsInserted to false
                pointIsInserted = false;

                if(!curr.isEmpty()){
                    //checking if last character is a point(.) then we remove it if last char is a "."
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }

                    //checking if operatorIsInserted is false
                    if(operatorIsInserted == false){
                        curr = curr + " * ";
                        operatorIsInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set pointIsInserted to false
                pointIsInserted = false;

                if(!curr.isEmpty()){
                    //checking if last character is a point(.) then we remove it if last char is a "."
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }

                    //checking if operatorIsInserted is false
                    if(operatorIsInserted == false){
                        curr = curr + " + ";
                        operatorIsInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set pointIsInserted to false
                pointIsInserted = false;

                if(!curr.isEmpty()){
                    //checking if last character is a point(.) then we remove it if last char is a "."
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }

                    //checking if operatorIsInserted is false
                    if(operatorIsInserted == false){
                        curr = curr + " - ";
                        operatorIsInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set pointIsInserted to false
                pointIsInserted = false;

                if(!curr.isEmpty()){
                    //checking if last character is a point(.) then we remove it if last char is a "."
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }

                    //checking if operatorIsInserted is false
                    if(operatorIsInserted == false){
                        curr = "-"+ curr;
                        operatorIsInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checking if the text is empty then put it after a zero "0."
                if(curr.isEmpty()){
                    curr = "0.";
                    pointIsInserted = true;
                }
                //if the boolean pointIsInserted is false then we append
                if(pointIsInserted == false){
                    curr = curr + ".";
                    pointIsInserted = true;
                }else{
                    curr = curr;
                }
                displayOne();


            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checking if last char is not an operator
                if(operatorIsInserted == true && !curr.substring(curr.length()-1,curr.length()).equals(" ")){
                    String [] arrTokens = curr.split(" ");

                    switch(arrTokens[1].charAt(0)){
                        case '÷':
                            res = Double.toString(Double.parseDouble(arrTokens[0]) / Double.parseDouble(arrTokens[2]));
                            break;
                        case '*':
                            res = Double.toString(Double.parseDouble(arrTokens[0]) * Double.parseDouble(arrTokens[2]));
                            break;
                        case '+':
                            res = Double.toString(Double.parseDouble(arrTokens[0]) + Double.parseDouble(arrTokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(arrTokens[0]) - Double.parseDouble(arrTokens[2]));
                            break;
                    }
                    displayAnswer();
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearing();
                displayOne();
                displayAnswer();
            }
        });

    }
        //this function is for displaying on the calculation TextView
        public void displayOne(){

            calculate.setText(curr);
        }
        //this function is for displaying on the result on its TextView
        public void displayAnswer(){
            res = res.indexOf(".") < 0 ? res : res.replaceAll("0*$", "").replaceAll("\\.$", "");
            results.setText(res);
        }

        public void clearing(){
            curr = "";
            res = "";
            pointIsInserted = false;
            operatorIsInserted = false;
        }

        public void delete(){
            //if curr isn't empty we delete the last char/
                if(!curr.isEmpty()) {

                    // check if dot is last char in string/EditText if true then we set pointIsInserter to false
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        pointIsInserted = false;
                    }

                    //if operator is found, we delete/remove 3 numbers or chars from curr then set operatorIsInserted to false
                    if (curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                        curr = curr.substring(0, curr.length() - 3);
                        operatorIsInserted = false;
                    } else {
                        curr = curr.substring(0, curr.length() - 1);
                    }

                }

        }



    }