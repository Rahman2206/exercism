import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomIndex = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomIndex];
    }

    String randomShipRegistryNumber() {
        int randomIndex = 1000 + random.nextInt(9000);

        return String.format("NCC-%d", randomIndex);
    }

    double randomStardate() {
        double doubles = 41000.0 + 1000.0 * random.nextDouble();
        return doubles;
    }

    
}
