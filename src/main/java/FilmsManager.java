public class FilmsManager {
    private FilmItem[] films = new FilmItem[0];
    private int resultLength = 5;

    public FilmsManager(){
    }


    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItem[] findAll() {
        return films;
    }

    public FilmsManager(int newResultLength){
       this.resultLength = newResultLength;
    }

    public FilmItem[] findLast() {

        FilmItem[] all = findAll();
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }
}
