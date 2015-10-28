package com.hn6833.basic.model;


import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataModel {
    public String getData() {
        return UUID.randomUUID().toString();
    }
}
