public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
        // write the succes rate
        double successrate = 0.0;
            
        if (speed >= 0 && speed <= 4 ){
           successrate = 1.0;
        }
        else if ( speed >= 5 && speed <= 8){
            successrate = 0.9;
        }

        else if ( speed == 9 ){
           successrate = 0.8;
                
        }
        else {
            successrate = 0.77;
        }

        double sonuc =speed * successrate * 221;
        return sonuc;
            
    }

    public int workingItemsPerMinute(int speed) {

        return (int) (productionRatePerHour(speed)/ 60);
    }
}
