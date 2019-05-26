package com.example.demo.genre;

public class Genre {

    public Genre(String type, int popularity){
        this.popularity=popularity;
        this.type=type;
    }
    public Genre(){

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    private String type;
    private int popularity;


}
