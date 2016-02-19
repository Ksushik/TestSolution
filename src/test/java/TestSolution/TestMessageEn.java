package TestSolution;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * Created by Олег on 16.02.2016.
 */
public class TestMessageEn {

    @BeforeClass
    public static void chengeLocalRU(){
        Locale.setDefault(Locale.ENGLISH);
    }

    @Test
    public void test1(){
        assertEquals("Вывод не корректный", "Good morning, World!", HelloWorld.getMessage(8));
    }

    @Test
    public void test2(){
        assertEquals("Вывод не корректный", "Good day, World!", HelloWorld.getMessage(13));
    }

    @Test
    public void test3(){
        assertEquals("Вывод не корректный", "Good evening, World!", HelloWorld.getMessage(21));
    }

    @Test
    public void test4(){
        assertEquals("Вывод не корректный", "Good night, World!", HelloWorld.getMessage(0));
    }
}
