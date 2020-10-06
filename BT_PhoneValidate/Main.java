package BT_Validate_So_dien_thoai;

public class Main {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhone = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[] {" (a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for(String phone : validPhone) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone is" + phone + "is valid :" + isValid);
        }
        for(String phone : invalidPhone) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone is" + phone + "is valid :" + isValid);
        }
    }
}
