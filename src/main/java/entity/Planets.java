package entity;

public class Planets extends HeavenlyBody {

    private final Integer satellite;

    public Planets(String name, String type, Long weight, Integer speed, Integer diameter, Integer satellite) {
        super(name, type, weight, speed, diameter);
        this.satellite = satellite;
    }

    public Integer getSatellite() {
        return satellite;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "satellite=" + satellite +
                '}';
    }
}
