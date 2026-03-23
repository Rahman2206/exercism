public class JedliksToyCar {

    private int battery = 100;
    private int driven = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", driven);
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if (battery == 0) {
            return; // In a 'void' method, you return nothing.
        }

        battery = battery - 1;
        driven = driven + 20;  
    }
}