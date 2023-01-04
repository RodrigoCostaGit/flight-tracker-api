package com.github.rodrigocostagit.flightapi.controller;

import com.github.rodrigocostagit.flightapi.model.Route;
import com.github.rodrigocostagit.flightapi.model.RouteRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class RouteController {
    private final RouteRepository repository;

    public RouteController(RouteRepository repository){
        this.repository = repository;
    }

    @GetMapping("/route/{code}")
    public List<Route> all(@PathVariable String code){
        //if not in db yet: error, say to add to db with post
        return repository.findByCode(code);
    }

    @PostMapping("/route/{code}")
    //looks up
//    public Route addRoute(@RequestBody Route route){
//        return repository.save(route);
//    }
    public ResponseEntity<List<Route>> addRoute(@PathVariable String code) throws IOException {
       scrapper scrapper1 = new scrapper(code);
       scrapper1.getInfo(repository);
       return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(all(code));
    }

    @GetMapping("/")
    public @ResponseBody String Greetings(){
        return "flight Route tracker API";
    }




}
