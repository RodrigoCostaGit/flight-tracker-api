package com.github.rodrigocostagit.flightapi.controller;

import com.github.rodrigocostagit.flightapi.model.Route;
import com.github.rodrigocostagit.flightapi.model.RouteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {
    private final RouteRepository repository;

    public RouteController(RouteRepository repository){
        this.repository = repository;
    }

    @GetMapping("/route")
    public List<Route> all(){
        return repository.findAll();
    }

    @PostMapping("/route")
    public Route addRoute(@RequestBody Route route){
        return repository.save(addRoute(route));
    }

    @GetMapping("/")
    public @ResponseBody String Greetings(){
        return "flight Route tracker API";
    }



}
