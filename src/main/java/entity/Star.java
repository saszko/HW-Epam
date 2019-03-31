package entity;

public class Star extends HeavenlyBody {

    private final Integer temperature;

    public Star(String name, String type, Long weight, Integer speed, Integer diameter, Integer temperature) {
        super(name, type, weight, speed, diameter);
        this.temperature = temperature;
    }


    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Star{" +
                "temperature=" + temperature +
                '}';
    }
}
