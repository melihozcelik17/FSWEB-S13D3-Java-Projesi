package com.workintech.model;

public class Wall {
    double width;
    double height;

    public double checkValue(double value){
        if (value < 0) {
            return 0;
        } else {
            return value;
        }
    }

    public Wall(double width, double height) {
        this.width = checkValue(width);
        this.height = checkValue(height);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = checkValue(width);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = checkValue(height);
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
