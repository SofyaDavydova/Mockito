public class FilmItem {
    private int id;
    private String filmName;
    private String genre;
    private boolean premierTomorrow;

    public FilmItem (int id, String filmName, String genre, boolean premierTomorrow){
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
        this.premierTomorrow = premierTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getPremierTomorrow() {
        return premierTomorrow;
    }

    public void setPremierTomorrow(boolean premierTomorrow) {
        this.premierTomorrow = premierTomorrow;
    }
}
