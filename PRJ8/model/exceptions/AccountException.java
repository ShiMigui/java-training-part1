package model.exceptions;

public class AccountException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public AccountException(String message) {
        super("from Account: " + message);
    }

    public static boolean isNullLessThanZero(Number amount) {
        return (amount == null || amount.doubleValue() < 0);
    }
    
    public static boolean isNullLessThanOrEqualZero(Number amount) {
        return (amount == null || amount.doubleValue() <= 0);
    }
    
    public static boolean isNullOrEmpty(String text){
        return (text == null || text.trim().isEmpty());
    }
}
