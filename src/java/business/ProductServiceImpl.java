package business;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductServiceImpl {

    private List<String> categories = new ArrayList<>();

    private List<String> bookList = new ArrayList<>();
    private List<String> musicList = new ArrayList<>();
    private List<String> movieList = new ArrayList<>();

    public ProductServiceImpl() {
        categories.add("books");
        categories.add("music");
        categories.add("movies");

        bookList.add("The Skull Throne");
        bookList.add("The Lady of the Lake");
        bookList.add("The Daylight War");

        musicList.add("Make It Stop");
        musicList.add("Breaking the Habit");
        musicList.add("The Dragonborn");

        movieList.add("Warcraft");
        movieList.add("Eragon");
        movieList.add("Mission Impossible");
    }

    public List<String> getProductCategories() {
        return getCategories();
    }

    public List<String> getProducts(String category) {
        switch (category.toLowerCase()) {
            case "books":
                return getBookList();
            case "music":
                return getMusicList();
            case "movies":
                return getMovieList();
        }
        return null;
    }

    public List<Product> getProductsv2(String category) {
            List<Product> list = new ArrayList<>();
            list.add(new Product("The Demon Cycle", "rt292", 22.21));
            list.add(new Product("Conspiracy: Thunderbreaker", "zh235", 25.25));
            list.add(new Product("YO MAMA FAT", "g3tr3kt", 1337));
            return list;
    }

    public boolean addProduct(String category, String product) {
        switch (category.toLowerCase()) {
            case "books":
                getBookList().add(product);
                break;
            case "music":
                getMusicList().add(product);
                break;
            case "movies":
                getMovieList().add(product);
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean removeProduct(String category, String product) {
        switch (category.toLowerCase()) {
            case "books":
                getBookList().remove(product);
                break;
            case "music":
                getMusicList().remove(product);
                break;
            case "movies":
                getMovieList().remove(product);
                break;
            default:
                return false;
        }
        return true;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public List<String> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<String> musicList) {
        this.musicList = musicList;
    }

    public List<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<String> movieList) {
        this.movieList = movieList;
    }
}
