package com.atguigu.git;

class Circle{
    double radius;

    public Circle(){
        radius=0;
    }

    public Circle(double r){
        this.radius= r;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter(){
        return 2*3.14*this.getRadius();
    }

    public double getArea(){
        return 3.14*this.getRadius()*this.getRadius();
    }

    public void disp(){
        System.out.println("半径是"+this.getRadius());
        System.out.println("周长是"+this.getPerimeter());
        System.out.println("面积是"+this.getArea());
    }
}

class Cylinder extends Circle{
     double height;

    public Cylinder(double r, double h){
        super(r);
        this.height=h;
    }

    public double getHeight(){
        return this.height;
    }

    public double getCylinderArea(){

        return super.getArea();
    }

    public double getVol(){
        return this.getHeight()*this.getCylinderArea();
    }

    public void dispVol(){
        System.out.println("圆柱体积是"+this.getVol());
    }
}


public class program4_3_4_NO1_Circle {
    public static void main(String[] args){
    Cylinder cy= new Cylinder(1,1);
    cy.disp();
    cy.dispVol();
    }
}
