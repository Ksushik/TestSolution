package TestSolution;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * Created by Олег on 16.02.2016.
 */
public class TestMessageEn {
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

        check("Good morning, World!", HelloWorld.getMessage(8));

        check("Good day, World!", HelloWorld.getMessage(13));

        check("Good evening, World!", HelloWorld.getMessage(21));

        check("Good night, World!", HelloWorld.getMessage(0));
    }

    @Test
    public void test2(){
        Locale.setDefault(new Locale("RU"));

        check("Добрый вечер, Мир!", HelloWorld.getMessage(21));

        check("Доброе утро, Мир!", HelloWorld.getMessage(7));

        check("Добрый день, Мир!", HelloWorld.getMessage(14));

        check("Спокойной ночи, Мир!", HelloWorld.getMessage(1));
    }

    public  void check(String expectedMessage,String receivedMessage){
        assertEquals("Вывод не корректный", expectedMessage, receivedMessage);
    }

}
