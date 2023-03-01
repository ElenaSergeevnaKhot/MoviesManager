import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {

    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");


        String[] expected = { "Film I" , "Film II" , "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");


        String[] expected = { "Film I" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager();


        String[] expected = new String[0];
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");


        String[] expected = { "Film I" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    
}
