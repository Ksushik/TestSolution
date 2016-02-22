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
        Locale.setDefault(Locale.ENGLISH);


    }

    @AfterClass
    public static void returnLocale(){
        Locale.setDefault(localeDefault);
    }

    @Test
    public void test1(){
        assertEquals("Вывод не корректный", "Good morning, World!", HelloWorld.getMessage(8));

        assertEquals("Вывод не корректный", "Good day, World!", HelloWorld.getMessage(13));

        assertEquals("Вывод не корректный", "Good evening, World!", HelloWorld.getMessage(21));

        assertEquals("Вывод не корректный", "Good night, World!", HelloWorld.getMessage(0));
    }
}
