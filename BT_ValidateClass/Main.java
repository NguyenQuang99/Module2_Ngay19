package BT_Validate_Ten_Lop_Hoc;

public class Main {
    private static ValidateClass validateClass;
    public static final String[] validClass = new String[] {"C0318G"};
    public static final String[] invalidClass = new String[] {" M0318G", "P0323A"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for(String className: validClass) {
            boolean isValid = validateClass.validate(className);
            System.out.println("Class name" + className + "is valid :" + isValid);
        }
        for(String className: invalidClass) {
            boolean isValid = validateClass.validate(className);
            System.out.println("Class name" + className + "is valid :" + isValid);
        }
    }
}
