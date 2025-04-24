import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmsManagerDefaultTest {

    FilmItem film1 = new FilmItem(1, "Бладшот", "боевик", false);
    FilmItem film2 = new FilmItem(2, "Вперед", "мультик", false);
    FilmItem film3 = new FilmItem(3, "Отель Белград", "комедия", false);
    FilmItem film4 = new FilmItem(4, "Джентльмены", "боевик", false);
    FilmItem film5 = new FilmItem(5, "Человек-невидимка", "ужасы", false);
    FilmItem film6 = new FilmItem(6, "Тролли.Мировой тур", "мультфильм", true);
    FilmItem film7 = new FilmItem(7, "Номер 1", "комедия", true);

    FilmsManager manager = new FilmsManager();

    @BeforeEach
    public void setup() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
    }

    @Test
    public void shouldSaveAll() {

        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastDefaultResultLength() {

        FilmItem[] expected = {film7, film6, film5, film4, film3};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

