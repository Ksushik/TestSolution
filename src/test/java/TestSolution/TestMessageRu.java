package TestSolution;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * Created by Олег on 16.02.2016.
 */
public class TestMessageRu {

    private Locale localeDefault;
    @BeforeClass
    public void chengeLocalRU(){
        localeDefault=Locale.getDefault();
        Locale.setDefault(new Locale("RU"));
    }


    @Test
    public void test1(){
        assertEquals("Вывод не корректный","Добрый вечер, Мир!", HelloWorld.getMessage(21));

        assertEquals("Вывод не корректный","Доброе утро, Мир!", HelloWorld.getMessage(7));

        assertEquals("Вывод не корректный","Добрый день, Мир!", HelloWorld.getMessage(14));

        assertEquals("Вывод не корректный", "Спокойной ночи, Мир!", HelloWorld.getMessage(1));
    }

    @AfterClass
    public void returnLocale(){
        Locale.setDefault(localeDefault);
    }
}
