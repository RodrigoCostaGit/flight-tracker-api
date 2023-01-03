package com.github.rodrigocostagit.flightapi.controller;

import com.github.rodrigocostagit.flightapi.model.Route;
import com.github.rodrigocostagit.flightapi.model.RouteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouteController {
    private final RouteRepository repository;

    public RouteController(RouteRepository repository){
        this.repository = repository;
    }

    @GetMapping("/route")
    List<Route> all(){
        return repository.findAll();
    }

    @PostMapping("/route")
    Route addRoute(@RequestBody Route route){
        return repository.save(addRoute(route));
    }


}
