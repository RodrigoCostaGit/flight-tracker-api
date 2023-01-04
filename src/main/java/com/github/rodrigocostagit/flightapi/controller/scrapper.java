package com.github.rodrigocostagit.flightapi.controller;


import com.github.rodrigocostagit.flightapi.model.Route;
import com.github.rodrigocostagit.flightapi.model.RouteRepository;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


//public class scrapper {
//    public static void main(String[] args) throws IOException {
//        // make an HTTP GET request to the FlightAware website
//        Document doc = Jsoup.connect("https://flightaware.com/live/flight/TAP757/history").get();
//
//        // select the table containing the flight data
//        Element table = doc.select("table.prettyTable").first();
//
//        // select all rows in the table
//        Elements rows = table.select("tr");
//
//        // iterate over the rows and extract the data
//        for (Element row : rows) {
//            Elements cells = row.select("td");
//            if (cells.size() == 7) {
//                String date = cells.get(0).text();
//                String aircraft = cells.get(1).text();
//                String origin = cells.get(2).text();
//                String destination = cells.get(3).text();
//                String departure = cells.get(4).text();
//                String arrival = cells.get(5).text();
//                String duration = cells.get(6).text();
//
////                System.out.println("Date: " + date);
////                System.out.println("Aircraft: " + aircraft);
////                System.out.println("Origin: " + origin);
////                System.out.println("Destination: " + destination);
////                System.out.println("Departure: " + departure);
////                System.out.println("Arrival: " + arrival);
////                System.out.println("Duration: " + duration);
//
//            }
//
//        }
//
//    }}

public  class scrapper {
    private String name;

    public scrapper(String name) {
        this.name = name;
    }

    public scrapper() {
    }

    public void setName(String name) {
        this.name = name;
    }


    public void getInfo( RouteRepository repository) throws IOException {
    // make an HTTP GET request to the FlightAware website
    Document doc = Jsoup.connect("https://flightaware.com/live/flight/"+name+"/history").get();

    // select the table containing the flight data
    Element table = doc.select("table.prettyTable").first();

    // select all rows in the table
    Elements rows = table.select("tr");

    // iterate over the rows and extract the data
    for (Element row : rows) {
        Elements cells = row.select("td");
        if (cells.size() == 7) {
            String date = cells.get(0).text();
            String aircraft = cells.get(1).text();
            String origin = cells.get(2).text();
            String destination = cells.get(3).text();
            String departure = cells.get(4).text();
            String arrival = cells.get(5).text();
            String duration = cells.get(6).text();


            repository.save(new Route(this.name,origin,destination,date,aircraft,departure,arrival,duration));

        }

    }



}}
