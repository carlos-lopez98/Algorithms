package org.example.greedy;

public class LemonadeChange {

    //Decision based algorithm
    //Guess it's greedy because we're tying to return the best possible answer for each bill in our bills
    public boolean lemonadeChange(int[] bills) {
        int fiveDollarBill = 0;
        int tenDollarBill = 0;

        for(int bill : bills){

            if(bill == 5){
                fiveDollarBill++;
            }else if(bill == 10){
                if(fiveDollarBill > 0){
                    fiveDollarBill--;
                    tenDollarBill++;
                }else {
                    return false;
                }

            }else {


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
