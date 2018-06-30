package com.example.assignment2;

public class Validator {
    public boolean check_password(String PW){

        if (PW == null || PW.isEmpty()) {
            return false;
        }
        if (PW.equals("PASSWORD")||PW.equals("password")) {
            return  false;
        }
        if (PW.length() <= 8) {
            return false;
        }

        if (PW.indexOf('!') != -1 || PW.indexOf('@') != -1
                || PW.indexOf('#') != -1 || PW.indexOf('&') != -1
                || PW.indexOf('*') != -1) {
            return false;
        }

        char[] a1 = new char[10000];
        for (int i=0;i<PW.length();i++){
            a1[i]=PW.charAt(i);
        }
        if(!checkUpp(a1)){
            return false;
        }
        if(!checknumber(a1)){
            return false;
        }

        /*if(!checksc(a1)){
            return false;
        }*/
        return true;
    }
    public boolean checkUpp(char[]chars){
        for (int i=0;i<chars.length;i++){
            if(Character.isUpperCase(chars[i]))
                return true;
        }
        return false;
    }
    public boolean checknumber(char[]chars){
        for (int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i]))
                return true;
        }
        return false;

    }
    /*char[] sc={'!','@','#','<','>','.','?','/',':',':','[','}','{',']','*','^'};
    public boolean checksc(char[]chars){
        for (int i=0;i<chars.length;i++){
            for (int j =0; i<sc.length;i++) {
                if (sc[j]==chars[i])
                    return true;
            }
        }
        return false;
    }
    */
}
