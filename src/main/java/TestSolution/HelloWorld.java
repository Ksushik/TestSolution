package TestSolution;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Олег on 16.02.2016.
 */
public class HelloWorld {

    private static Logger logger=Logger.getLogger(HelloWorld.class);

    public static String getMessage(){
        return getMessage(getHours(new Date()));
    }

    public static String getMessage(int hours){
        return getMessage(hours,Locale.getDefault());
    }

    public static String getMessage(int hours, Locale locale){
        return getMessage(hours,  ResourceBundle.getBundle("Message", locale));
    }

    private static String getMessage(int hours, ResourceBundle resourceBundle){
        return formatUTF(resourceBundle.getString(getTimeOfDay(hours)));
    }

    private static int getHours(Date date){
        return Integer.parseInt(new SimpleDateFormat("HH").format(date));
    }

    private static String getTimeOfDay(int hours){
        if (hours>=6&&hours<9) return "message1";
        if (hours>=9&&hours<19) return "message2";
        if (hours>=19&&hours<23) return "message3";
        return "message4";
    }

    private static String formatUTF(String str){
        String newStr=null;
        try {
            newStr= new String(str.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error(e);
        }
        return newStr;
    }
}
