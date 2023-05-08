package main.temperature;

public abstract class Temp {
    double temp;
    public Temp(Temp temp){
        this.temp = temp.getTemp();
    }

    public Temp(double temp){
        this.temp = temp;
    }
    public double getTemp(){
        return temp;
    }
}
