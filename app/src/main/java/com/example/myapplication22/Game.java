package com.example.myapplication22;

public class Game {
    private string name;
    private int imageResource;

    public Game(string name){
        this.name = name;
    }
    public Game(String sleepengDogs, int imageResource) {
        this.imageResource = imageResource;
    }
    public CharSequence getName(){
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }
}
