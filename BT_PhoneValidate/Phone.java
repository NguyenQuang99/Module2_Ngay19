package BT_Validate_So_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String NUMBER_REGEX = "^\\((84)\\)-\\([0-9]{9,}\\)$";
    public PhoneNumber() {

    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
