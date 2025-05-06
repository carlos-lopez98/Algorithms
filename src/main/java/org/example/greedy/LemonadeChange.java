package org.example.greedy;

public class LemonadeChange {

    //Decision based algorithm
    //Guess it's greedy because we're tying to return the best possible answer for each bill in our bills
    public boolean lemonadeChange(int[] bills) {

        int fives = 0;
        int tens = 0;

        for(int bill: bills){

            if(bill == 5){
                fives++;
            }else if(bill == 10){

                if(fives > 0){
                    fives--;
                    tens++;
                }else{
                    return false;
                }


            }else{

                if(tens > 0 && fives > 0 ){
                    tens--;
                    fives--;
                }else if(fives > 2){
                    fives -= 3;
                }else{
                    return false;
                }

            }
        }

        return true;
    }
}
