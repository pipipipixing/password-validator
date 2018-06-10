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
   return true;
   }
}