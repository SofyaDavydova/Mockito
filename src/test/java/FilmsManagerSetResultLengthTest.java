import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerSetResultLengthTest {

    FilmItem film1 = new FilmItem(1, "Бладшот", "боевик", false);
    FilmItem film2 = new FilmItem(2, "Вперед", "мультик", false);
    FilmItem film3 = new FilmItem(3, "Отель Белград", "комедия", false);
    FilmItem film4 = new FilmItem(4, "Джентльмены", "боевик", false);
    FilmItem film5 = new FilmItem(5, "Человек-невидимка", "ужасы", false);
    FilmItem film6 = new FilmItem(6, "Тролли.Мировой тур", "мультфильм", true);
    FilmItem film7 = new FilmItem(7, "Номер 1", "комедия", true);


    @Test
    public void shouldFindLastResultLengthBetweenLimits() {
        FilmsManager manager = new FilmsManager(3);

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);


        FilmItem[] expected = {film7, film6, film5};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastResultLengthUpLimit() {
        FilmsManager manager = new FilmsManager(7);

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);


        FilmItem[] expected = {film7, film6, film5, film4, film3, film2, film1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastResultLengthLowLimit() {
        FilmsManager manager = new FilmsManager(0);

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);


        FilmItem[] expected = {};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
