package fop.w10pass;

public class Password {
    private final int nrUpperShould, nrLowerShould, nrSpecialShould,
            nrNumbersShould, lengthShould;
    private final char[] illegalChars;

    private static boolean matchesIllegalCharacter(char[] illegalChars,
            char c) {
        for (int i = 0; i < illegalChars.length; i++) {
            if (c == illegalChars[i]) {
                return true;
            }
        }
        return false;
    }

    public Password(int nrUpperShould, int nrLowerShould, int nrSpecialShould,
            int nrNumbersShould, int lengthShould, char[] illegalChars) {
        this.nrUpperShould = nrUpperShould;
        this.nrLowerShould = nrLowerShould;
        this.nrSpecialShould = nrSpecialShould;
        this.nrNumbersShould = nrNumbersShould;
        this.lengthShould = lengthShould;
        this.illegalChars = illegalChars;
    }

    public void checkFormat(String pwd) throws IllegalCharException, NotLongEnough, NotEnoughUpperCase, NotEnoughLowerCase, NotEnoughNumber, NotEnoughSpecial {
        int lengthIs = pwd.length();
        if(lengthIs < lengthShould){
            throw new NotLongEnough(lengthShould, lengthIs);
        }
        int letterUpper = 0;
        int letterLower = 0;
        int specials = 0;
        int numberIs = 0;
        for (int i = 0; i < pwd.length(); i++){
            char ch  = pwd.charAt(i);
            if (matchesIllegalCharacter(illegalChars, ch)){
                throw new IllegalCharException(ch);
            }
            else if (ch>= 'A' && ch <= 'Z'){
                letterUpper++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                letterLower++;
            }
            else if (ch >= '0' && ch <= '9'){
                numberIs++;
            }
            else{
                specials++;
            }
        }
        if (letterUpper < nrUpperShould){
            throw new NotEnoughUpperCase(nrUpperShould, letterUpper);
        }
        if (letterLower < nrLowerShould){
            throw new NotEnoughLowerCase(nrLowerShould, letterLower);
        }
        if (numberIs < nrNumbersShould){
            throw new NotEnoughNumber(nrNumbersShould, numberIs);
        }
        if (specials < nrSpecialShould){
            throw new NotEnoughSpecial(nrSpecialShould, specials);
        }
    }
}
