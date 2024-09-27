package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public int wheelsAngle = 0;
    public boolean reverse = false;

    public Car(String brand, String model, String fuel) {
            this.brand = brand;
            this.model = model;
            this.fuel = fuel;
    }
    public boolean isTachometerGreaterThanZero(){
        if (tachometer > 0){
            return true;
        }else return false;
    }
    public boolean isTachometerEqualToZero(){
        if (tachometer == 0){
            return true;
        }else return false;
    }

    public Car() {

    }

    public void stop(){
        if(this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }
    public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }
    public void accelerate(){
        if(tachometer>= 0 && speedometer<MAX_SPEED){
            speedometer =speedometer +10;
        }

    }
    public void brake(){
        if(tachometer>= 0 ){
            speedometer =0;
        }
    }
    public void turnAngleOfWheels(int angle){
            if(angle<-45){
                wheelsAngle = -45;
            }else if(angle > 45){
                wheelsAngle = 45;
            }else{
                wheelsAngle = 20;
            }
    }
    public String showSteeringWheelDetail(){

                return "El angulo es: "+wheelsAngle;

    }
    public boolean isReverse(){
        gear = "R";
        return true;
    }
    public void setReverse(boolean reverse){
        if(speedometer == 0 && reverse){
            this.reverse = reverse;
            gear = "R";
        }else {
            gear = "N";
        }
    }

    public void showDetails(){}


}
