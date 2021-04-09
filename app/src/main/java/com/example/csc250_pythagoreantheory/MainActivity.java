package com.example.csc250_pythagoreantheory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity
{
    private button AButton;
    private button BButton;
    private button CButton;
    private button CalculateButton;
    private button TotalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TotalButton = this.findViewById(R.id.TotalButton);
        this.AButton = this.findViewById(R.id.AButton);
        this.BButton = this.findViewById(R.id.BButton;
        this.CButton = this.findViewById(R.id.CButton;
        this.CalculateButton = this.findViewById(R.id.CalculateButton);
        this.TotalButton.setText("");
        this.AButton.setText = "";
        this.BButton.setText("");
        this.CButton.setText("");
        this.CalculateButton.setText("");
    }

    public void TotalButtonPressed(View v)
    {
        Button b = (Button) v;

        if (this.TotalButton.length() == 0 && b.getText().equals("0")) {
            return;
        }
        this.TotalButton += b.getText();
        this.qtyTV.setText(this.TotalButton);
    }

    public void AButtonPressed(View v)
    {
        this.button.AButton = "";
        this.AButton.setText(this.AButton);
    }
    public void BButtonPressed(View v)
    {
        this.button.BButton = "";
        this.BButton.setText(this.BButton);
    }
    public void CButtonPressed(View v)
    {
        this.button.CButton = "";
        this.CButton.setText(this.CButton);
    }

    public class QuickTester {

        private static final int MAX = 25;

        public static void main(String[] args) {

            int a, b, c;

            for(a = 1; a < MAX; a++)
            {
                for(b = a; b < MAX; b++)
                {
                    for(c = b; c < MAX; c++)
                    {
                        if((Math.pow(a, 2) + Math.pow(b, 2))
                                == Math.pow(c, 2))
                        {
                            System.out.printf("%d %d %d\n",
                                    a, b, c);
                        }
                    }
                }
            }
        }
    }

}