package fop.w10pass;

public class NotEnoughLengthException extends NotEnoughException{

    public NotEnoughLengthException(int should, int is) {
        super(should, is);
    }

    @Override
    public String toString(){
        return "NotEnoughLengthException: insufficient length!\n" + super.toString();
    }
}
