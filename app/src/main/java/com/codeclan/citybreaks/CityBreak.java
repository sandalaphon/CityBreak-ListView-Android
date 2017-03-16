package com.codeclan.citybreaks;

import android.util.Log;

import java.util.ArrayList;

public class CityBreak {
    private ArrayList<City> topCityBreaks;

    public CityBreak(){
    topCityBreaks = new ArrayList<City>();
        topCityBreaks.add(new City(1, Destination.BARCELONA,
                Season.AUTUMN, "Gothic Quarter", "Hisop"));
        topCityBreaks.add(new City(2, Destination.PARIS,
                Season.SPRING, "Louvre", "Hisop"));
        topCityBreaks.add(new City(3, Destination.ROME,
                Season.SPRING, "Trevi Fountain", "Butteri"));
        topCityBreaks.add(new City(4, Destination.BERLIN,
                Season.SUMMER, "Brandenburg Gate", "Beer Hall"));
        topCityBreaks.add(new City(5, Destination.COPENHAGEN,
                Season.SUMMER, "Nyhavn", "Nyhavn Restaurant"));
        topCityBreaks.add(new City(6, Destination.STOCKHOLM,
                Season.SUMMER, "Boat Museum", "Sushi"));
        topCityBreaks.add(new City(7, Destination.DUBLIN,
                Season.SUMMER, "Dublin Castle", "Guiness pub"));
        topCityBreaks.add(new City(8, Destination.PRAGUE,
                Season.AUTUMN, "Astronomical Clock", "Absinthe"));
        topCityBreaks.add(new City(9, Destination.MUNICH,
                Season.AUTUMN, "Neuschwanstein Castle", "Octoberfest"));
        topCityBreaks.add(new City(10, Destination.VENICE,
                Season.SPRING, "Doge's Palace", "Osteria alle Testiere"));
        topCityBreaks.add(new City(11, Destination.JERUSALEM,
                Season.WINTER, "Dome of the Rock", "market"));
        topCityBreaks.add(new City(12, Destination.FLORENCE,
                Season.AUTUMN, "Uffizi Gallery", "Panini Toscani"));
    }

    public ArrayList<City> getList(){
        return new ArrayList<City>(topCityBreaks);
    }

    public City findCityByCityString(String cityToFind){
        for(City city: topCityBreaks){
            if (city.getDestination().name()==cityToFind){
            Log.d(cityToFind, "need a string here");return city;}
        }
        City florence =new City(12, Destination.FLORENCE,
                Season.AUTUMN, "Uffizi Gallery", "Panini Toscani");
        return florence;
    }

}
