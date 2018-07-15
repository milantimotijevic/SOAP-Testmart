package tests;

import business.ProductServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

public class ProductServiceTests {

    private ProductServiceImpl service;

    @Before
    public void setUp() {
        service = new ProductServiceImpl();
    }

    @Test
    public void AddingCategoryIncreasesListSize() {
        Integer initialSize = service.getProductCategories().size();
        service.getProductCategories().add("example1");
        //assertThat(service.getProductCategories().size(), is(initialSize + 1));
        assertTrue(service.getProductCategories().size() > initialSize);
    }

    @Test
    public void AddedCategoryIsInTheList() {
        service.getCategories().add("example");
        assertTrue(service.getCategories().contains("example"));
    }

    @Test
    public void AddingProductIncreasesListSize() {
        Integer initialBooksSize = service.getBookList().size();
        Integer initialMusicSize = service.getMusicList().size();
        Integer initialMoviesSize = service.getMovieList().size();

        service.addProduct("books", service.getBookList().get(0));
        assertTrue(service.getBookList().size() > initialBooksSize);
        
        service.addProduct("music", service.getMusicList().get(0));
        assertTrue(service.getMusicList().size() > initialMusicSize);
        
        service.addProduct("movies", service.getMovieList().get(0));
        assertTrue(service.getMovieList().size() > initialMoviesSize);
    }
    
    @Test
    public void AddedProductIsInTheList(){
        service.addProduct("books", "example");
        assertTrue(service.getBookList().contains("example"));
        
        service.addProduct("music", "example");
        assertTrue(service.getMusicList().contains("example"));
        
        service.addProduct("movies", "example");
        assertTrue(service.getMovieList().contains("example"));
        
    }

    @Test
    public void RemovingProductReducesListSize() {
        Integer initialBooksSize = service.getBookList().size();
        Integer initialMusicSize = service.getMusicList().size();
        Integer initialMoviesSize = service.getMovieList().size();

        service.removeProduct("books", service.getBookList().get(0));
        assertTrue(service.getBookList().size() < initialBooksSize);
        service.removeProduct("music", service.getMusicList().get(0));
        assertTrue(service.getMusicList().size() < initialMusicSize);
        service.removeProduct("movies", service.getMovieList().get(0));
        assertTrue(service.getMovieList().size() < initialMoviesSize);
    }

}
