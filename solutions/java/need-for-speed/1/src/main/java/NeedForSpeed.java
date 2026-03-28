class NeedForSpeed {

    private int speed = 0;
    public int carBattery = 100;
    public int batteryDrain = 0;
    private int distance = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (carBattery >= 0 && carBattery >= batteryDrain ) {
            return false;
        }
        else{
            return true;
        }
    }

    public int distanceDriven() {
        
        return distance;
    }

    public void drive() {
        if ( !batteryDrained() && carBattery >= batteryDrain) {
            distance += speed;
            carBattery -= batteryDrain;
    }
    }

    public static NeedForSpeed nitro() {

        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distanceinput;
    private int distance;
    RaceTrack(int distance) {
       this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        
        while(!car.batteryDrained() && car.carBattery >= car.batteryDrain){
            car.drive();
            distanceinput = car.distanceDriven();
        }

        if (distanceinput >= distance ){
            return true;
        }
        else
            return false;
    }
}
