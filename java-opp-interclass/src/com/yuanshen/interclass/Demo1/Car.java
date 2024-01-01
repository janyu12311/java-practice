package com.yuanshen.interclass.Demo1;

public class Car {
    private String name;
    private int carAge;
    private String carColor;

    public Car() {
    }

    public Car(String name, int carAge, String carColor) {
        this.name = name;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public void show(){
        System.out.println(this.name);
        Engine e=new Engine();
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(name);
        }
    }

}
