package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      double x2 = other.x;
      double y2 = other.y;
      double fin = (x2-x)*(x2-x);
      double l = (y2-y)*(y2-y);
      fin+=l;
      return Math.sqrt(fin);
    }
  
    public int getX() {return x;} 
    public int getY() {return y;}

    public void setX(int x) {this.x=x;}
    public void setY(int y) {this.y=y;}
    
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      String str = "(" + x + ", " + y + ")";
      return str;
    }
  }
  