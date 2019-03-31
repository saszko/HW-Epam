package entity;

public class HeavenlyBody {

        public String name;
        public String type;
        public Long weight;
        public Integer speed;
        public Integer diameter;

        public HeavenlyBody(String name, String type, Long weight, Integer speed, Integer diameter) {
            this.name = name;
            this.type = type;
            this.weight = weight;
            this.speed = speed;
            this.diameter = diameter;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public Long getWeight() {
            return weight;
        }

        public Integer getSpeed() {
            return speed;
        }

        public Integer getDiameter() {
            return diameter;
        }

        @Override
        public String toString() {
            return "HeavenlyBody{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", weight=" + weight +
                    ", speed=" + speed +
                    ", diameter=" + diameter +
                    '}';
        }
    }

