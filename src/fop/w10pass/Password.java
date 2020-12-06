package fop.w10pass;

public class Password {
    private final int nrUpperShould, nrLowerShould, nrSpecialShould,
            nrNumbersShould, lengthShould;
    private final char[] illegalChars;

    private static boolean matchesIllegalCharacter(char[] illegalChars,
            char c) {
        for (int i = 0; i < illegalChars.length; i++)
            if (c == illegalChars[i])
                return true;
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

    public void checkFormat(String pwd) {
    }
}
