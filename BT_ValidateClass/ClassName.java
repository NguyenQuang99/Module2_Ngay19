package BT_Validate_Ten_Lop_Hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAME_REGEX = "^([ACP]\\w*)\\d{4}[GHIKLM]$";
    public ValidateClass() {
        pattern = Pattern.compile(CLASSNAME_REGEX);

    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
