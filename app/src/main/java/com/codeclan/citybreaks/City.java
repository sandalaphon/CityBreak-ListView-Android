package com.codeclan.citybreaks;

public class City {
    private Destination destination;
    private String topSight;
    private Integer position;
    private String bestRestaurant;
    private Season season;

    public City(Integer position, Destination destination, Season season,
                String topSight, String bestRestaurant){
        this.position = position;
        this.destination = destination;
        this.season = season;
        this.topSight = topSight;
        this.bestRestaurant = bestRestaurant;
    }

    public Integer getPosition(){
        return this.position;
    }

    public Destination getDestination(){
        return this.destination;
    }

    public Season getSeason(){
        return this.season;
    }
    public String getTopSight(){
        return this.topSight;
    }
    public String getBestRestaurant(){
        return this.bestRestaurant;
    }
}
