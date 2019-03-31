package repository;

import entity.HeavenlyBody;
import entity.Planets;

public class HeavenlyBodyRepository {
    private HeavenlyBody[] heavenlyBodies;

    public HeavenlyBodyRepository(HeavenlyBody[] heavenlyBodies) {
        this.heavenlyBodies = heavenlyBodies;
    }

    public HeavenlyBody findByType() {
        for (HeavenlyBody heavenlyBody : heavenlyBodies) {
            int counter = 0;
            if (heavenlyBody instanceof Planets == true) counter++;
            return heavenlyBody;
        }
        return null;
    }
}
