package com.github.rodrigocostagit.flightapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route,Long>  {
    //find user by code
    List<Route> findByCode(String code);
}
