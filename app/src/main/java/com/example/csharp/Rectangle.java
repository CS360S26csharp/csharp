package com.example.csharp;

public class Rectangle extends Shape{

    private int x;
    private int y;
    private int area;
    public Rectangle(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.area = area();
    }
    private int area()
    {
        return this.x * this.y;
    }
}
