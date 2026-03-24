
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
      
        int[] birds = {0, 2, 5, 3, 7, 8, 4} ;
        return birds;
    }

    public int getToday() {
        int today = birdsPerDay[birdsPerDay.length -1];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1 ;
    }

    public boolean hasDayWithoutBirds() {
        for (int days : birdsPerDay){
            if (days == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for (int i = 0; i <= limit - 1; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busy = 0;
        for (int days : birdsPerDay){
            if (days >= 5){
            busy += 1;
            }
        }
        return busy;
    }
}
