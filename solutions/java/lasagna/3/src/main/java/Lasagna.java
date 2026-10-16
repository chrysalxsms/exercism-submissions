public class Lasagna {
    public int expectedMinutesInOven() {
        int EXPECTED = 40;
        return EXPECTED;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        int REMAINING = expectedMinutesInOven() - minutesInOven;
        return REMAINING;
    }

    public int preparationTimeInMinutes(int layers) {
        int PREP_TIME = 2*layers;
        return PREP_TIME;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        int TOTAL_TIME = preparationTimeInMinutes(layers) + minutesInOven;
        return TOTAL_TIME;
    }
}
