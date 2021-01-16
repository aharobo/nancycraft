package com.nancy;

public class ZhengFangXing extends SiBian implements ISiBian{
    public ZhengFangXing(Double width) {
        super(width);
    }

    @Override
    public Double getArea() {
        Double area=this.width*this.width;
        return area;
    }
}
