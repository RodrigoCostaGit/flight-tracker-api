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



        public Route(String code, String origin, String destination) {
            this.code = code;
            this.origin = origin;
            this.destination = destination;
        }

        public Route() {

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        // other fields, methods, etc.
    }


