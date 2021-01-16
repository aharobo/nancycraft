package com.nancy;

public class JuXing extends SiBian implements ISiBian{

    public JuXing(Double width, Double height) {
        super(width, height);
    }

    @Override
    public Double getArea() {
        Double area=width*height;
        return area;
    }
}
