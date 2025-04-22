package org.example.greedy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        //Since our customers will come in with $5 bills, 10$bills, or$20 bills
        //We only need to worry about giving change to those with $10 or $20 dollars
        //$10 will always be a $5 bill for change
        //$20 will always be a $10 and $5 or 3 $5
        //So what we can do is iterate through the bills and just keep track of what bills we have
        int fiveDollarBill = 0;
        int tenDollarBill = 0;

        for(int bill : bills){
            //If the bill given is $5 no change is required we just increase or five dollar bill count
            if(bill == 5){
                fiveDollarBill++;
            }else if(bill == 10){
                //Change is required but we gained a $10 dollar bill
                if(fiveDollarBill > 0){
                    fiveDollarBill--;
                    tenDollarBill++;
                }else {
                    return false;
                }
            }else {
                //We have two options with the
                if(tenDollarBill > 0 && fiveDollarBill > 0){
                    tenDollarBill--;
                    fiveDollarBill--;
                }else if(fiveDollarBill > 2){
                    fiveDollarBill -= 3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
