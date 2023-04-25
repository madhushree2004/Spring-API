package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Movies;
import com.example.Movies.Repository.MoviesRepository;

@Service
public class MoviesService {

	@Autowired
	MoviesRepository movieRepository; 
	
	public List<Movies> getAllMovies()
	{
		List<Movies> movieList=movieRepository.findAll();
		return movieList;
	}
	
	public Movies saveMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public Movies updateMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	
	public void deleteMovies(String name)
	{
	    movieRepository.deleteById(name);
	}
	
	public Movies getMovies(String name)
	{
	    Movies m=movieRepository.findById(name).get();
	    return m;
	}
}
