package org.example;

public class OneWay {
    String string = "carlos";

    public OneWay() {
    }

    public boolean algoOne(String one, String two){

        if(one.equals(two)){
            return true;
        }else if (one.length() == two.length()){
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
