package basicUse;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class TimeClass {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("EST"));
    }
}
