package org.example;

public class OneAway {

    public OneAway() {
    }

    public boolean algoOne(String one, String two){

        if(one.equals(two)){
            return true;
        }else if(Math.abs(one.length() - two.length()) >= 2){
            return false;
        } else if (one.length() == two.length()){
            int mismatch = 0;
            for(int i = 0; i < one.length(); i++){
                if(one.toCharArray()[i] != two.toCharArray()[i]){
                    mismatch++;
                }
                if(mismatch > 1){
                    return false;
                }else {
                    return true;
                }
            }
        }else if(one.length() > two.length()){
            int mismatch = 0;
            for(int i = 0; i < two.length(); i++){
                if(one.toCharArray()[i] != two.toCharArray()[i] || mismatch >= 1){
                    mismatch++;
                }
                if(mismatch > 1){
                    return false;
                }else {
                    return true;
                }
            }
        }else if(one.length() < two.length()){
            int mismatch = 0;
            for(int i = 0; i < one.length(); i++){
                if(one.toCharArray()[i] != two.toCharArray()[i]){
                    mismatch++;
                }
                if(mismatch > 1){
                    return false;
                }else {
                    return true;
                }
            }
        }

        return false;
    }
}
