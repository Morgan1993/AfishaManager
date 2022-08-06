import org.example.AfishaManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    @Test
    public void shouldAddNewFilm() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.addFilm("Последний герой");

        String[] expected = {"Последний герой"};
        String[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilms() {
        AfishaManager afishaManager = new AfishaManager(2);
        afishaManager.addFilm("Последний герой");
        afishaManager.addFilm("День независимости");

        String[] expected = {"День независимости", "Последний герой"};
        String[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
