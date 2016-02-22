package TestSolution;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Locale;

import static TestSolution.HelloWorld.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Олег on 16.02.2016.
 */
public class TestMessage {
    private static Locale localeDefault;

    @BeforeClass
    public static void chengeLocalRU(){
        localeDefault=Locale.getDefault();

    }

    @AfterClass
    public static void returnLocale(){
        Locale.setDefault(localeDefault);
    }

    @Test
    public void test1(){
        Locale.setDefault(Locale.ENGLISH);

        check("Good morning, World!", getMessage(8));

        check("Good day, World!", getMessage(13));

        check("Good evening, World!", getMessage(21));

        check("Good night, World!", getMessage(0));

    }

    @Test
    public void test2(){
        Locale.setDefault(new Locale("RU"));

        check("Добрый вечер, Мир!", getMessage(21));

        check("Доброе утро, Мир!", getMessage(7));

        check("Добрый день, Мир!", getMessage(14));

        check("Спокойной ночи, Мир!", getMessage(1));
    }

    public  void check(String expectedMessage,String receivedMessage){
        assertEquals("Вывод не корректный", expectedMessage, receivedMessage);
    }

}
