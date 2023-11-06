package com.example.recycleviewexercise;

public class Item {
    String name;
    String star;
    int image;

    public Item(String name, String star, int image) {
        this.name = name;
        this.star = star;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
