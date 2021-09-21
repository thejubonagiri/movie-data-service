package test.thejudemo.moviedataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.thejudemo.moviedataservice.entity.MovieDetails;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @RequestMapping("/{movieId}")
    private MovieDetails getMovieInfo (@PathVariable("movieId") String movieId)
    {
//        List<MovieDetails> movieDetails = Arrays.asList(new MovieDetails(1234, "Transformers", "Test Description"),
//                new MovieDetails(3456, "BumbleBee", "Test Bunble"));
        return new MovieDetails(3456, "BumbleBee", "Test Bundle");
    }

}
