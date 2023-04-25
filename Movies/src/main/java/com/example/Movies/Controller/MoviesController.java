package com.example.Movies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.Movies;
import com.example.Movies.Service.MoviesService;

@RestController
public class MoviesController {

	@Autowired
	MoviesService movieService;
	
	@GetMapping(value="fetchMovies")
	public List<Movies> getAllMovies()
	{
		List<Movies> movieList=movieService.getAllMovies();
		return movieList;
	}
	
	@PostMapping(value="/saveMovies")
	public Movies saveMovies(@RequestBody Movies m)
	{
		return movieService.saveMovies(m);
	}
	
	@PutMapping(value="/updateMovies")
	public Movies updateMovies(@RequestBody Movies m)
	{
		return movieService.saveMovies(m);
		
	}
	
	@DeleteMapping(value="/deleteMovies/{nme}")
	public void  deleteMovies(@PathVariable("nme") String name)
	{
		movieService.deleteMovies(name);
	}
	
	@GetMapping(value="/getMovies/{nme}")
	public Movies getMovies(@PathVariable("nme") String name)
	{
		return movieService.getMovies(name);
	}
}
