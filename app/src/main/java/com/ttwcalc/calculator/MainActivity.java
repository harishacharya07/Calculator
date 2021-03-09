package com.ttwcalc.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button cut,brc,mod,div,sev,eigh,nigh,mul,five,four,six,neg,two,three,zero,dot,equal,one,add,dzero;
    TextView tvInput,tvOutput;

    TextView crunchifyEditText;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, mMod;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cut = findViewById(R.id.cut);
        brc = findViewById(R.id.brc);
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);

        sev = findViewById(R.id.sev);
        eigh = findViewById(R.id.eigh);
        nigh = findViewById(R.id.nigh);
        mul = findViewById(R.id.mul);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        six = findViewById(R.id.six);
        neg = findViewById(R.id.neg);
        two =findViewById(R.id.two);
        one = findViewById(R.id.one);
        three = findViewById(R.id.three);
        zero = findViewById(R.id.zero);
        dzero = findViewById(R.id.dzero);

        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);
        crunchifyEditText = findViewById(R.id.crunchifyEditText);



        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");


            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");

            }
        });

        sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");

            }
        });

        eigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        nigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "00");
            }
        });

        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText().length() != 0){
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mSubtract = true;
                    crunchifyEditText.setText(null);


                }
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText().length() != 0){
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyMultiplication = true;
                    crunchifyEditText.setText(null);


                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText().length() != 0){
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyDivision = true;
                    crunchifyEditText.setText(null);


                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (crunchifyEditText.getText().length() != 0){
                   mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                   crunchifyAddition = true;
                   crunchifyEditText.setText(null);

               }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText().length() != 0){
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mSubtract = true;
                    crunchifyEditText.setText(null);


                }
            }
        });



      /*  brc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkbracket) {

                    process = tvInput.getText().toString();
                    tvInput.setText(process + ")");
                    checkbracket = false;

                }else {

                    process = tvInput.getText().toString();
                    tvInput.setText(process + "(");
                    checkbracket = true;

                }
            }
        });*/

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSubtract || crunchifyAddition || crunchifyDivision || crunchifyMultiplication) {
                    if (crunchifyEditText.getText().length() == 0){
                        crunchifyEditText.setText("");
                    }
                    else {
                        mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                    }
                    //mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");


                }
                if (crunchifyAddition == true) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    mSubtract = false;
                }

                if (mSubtract == true) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;

                }
            }


        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about_us,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== R.id.about){
            Intent i = new Intent(MainActivity.this,AboutUs.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}