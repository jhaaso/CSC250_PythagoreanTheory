package com.example.csc250_pythagoreantheory;

public class button {


    public void qtyButtonPressed(View v) {
        Button b = (Button) v;

        if (this.TotalButton.length() == 0 && b.getText().equals("0")) {
            return;
        }
        this.currentQtyText += b.getText();
        this.qtyTV.setText(this.currentQtyText);
    }
}