package com.github.rodrigocostagit.flightapi.model;

import jakarta.persistence.*;

    @Entity
    public class Route {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
        private Long id;

        @Basic
        @Column(name = "code")
        private String code;

        @Basic
        @Column(name = "origin")
        private String origin;

        @Basic
        @Column(name = "destination")
        private String destination;

        @Basic
        @Column(name = "date")
        private String date;

        @Basic
        @Column(name = "aircraft")
        private String aircraft;

        @Basic
        @Column(name = "departure")
        private String departure;

        @Basic
        @Column(name = "arrival")
        private String arrival;

        @Basic
        @Column(name = "duration")
        private String duration;


        public Route() {

        }

        public Route( String code, String origin, String destination, String date, String aircraft, String departure, String arrival, String duration) {
            this.id = id;
            this.code = code;
            this.origin = origin;
            this.destination = destination;
            this.date = date;
            this.aircraft = aircraft;
            this.departure = departure;
            this.arrival = arrival;
            this.duration = duration;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAircraft() {
            return aircraft;
        }

        public void setAircraft(String aircraft) {
            this.aircraft = aircraft;
        }

        public String getDeparture() {
            return departure;
        }

        public void setDeparture(String departure) {
            this.departure = departure;
        }

        public String getArrival() {
            return arrival;
        }

        public void setArrival(String arrival) {
            this.arrival = arrival;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }
    }
