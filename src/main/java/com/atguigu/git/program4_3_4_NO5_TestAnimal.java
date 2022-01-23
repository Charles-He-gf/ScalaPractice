package com.atguigu.git;

abstract class Animal{
    String name;
    int age;
    int weight;


    public void showInfo(){
        System.out.println(name+" "+age+" "+weight);
    }

    abstract public void move();
    abstract public void eat();
}

class Bird extends Animal{

    public Bird(String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void showInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
    public void move(){
        System.out.println("fly");
    }
    public void eat(){
        System.out.println("fish");
    }
}


public class program4_3_4_NO5_TestAnimal {
    public static void main(String[] args){
        Animal a=new Bird("tom",1,11);
        a.showInfo();
        a.move();
        a.eat();
    }
}
