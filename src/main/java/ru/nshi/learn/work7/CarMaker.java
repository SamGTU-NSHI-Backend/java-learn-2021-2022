package ru.nshi.learn.work7;

public class CarMaker {
    private String car_maker;
    private Car car;

    public CarMaker(String car_maker, Car car){
        this.car_maker = car_maker;
        this.car = car;
    }

    public String getCar_maker(){

        return car_maker;
    }

    public void setCar_maker(String car_maker) {

        this.car_maker = car_maker;
    }

    public Car getCar(){

        return car;
    }

    public void setCar(Car car){

        this.car = car;
    }

}
