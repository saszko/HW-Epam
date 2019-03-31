import entity.Planets;
import entity.Sattelites;
import entity.Star;

public class ConsoleApp {
    public static void main(String[] args) {
        Planets [] planet = new Planets[8];
        planet[0] = new Planets("Mercury", "Planet", 33000000L, 47, 2439, 0);
        planet[1] = new Planets("Venus", "Planet", 48000000L, 35, 6051, 0);
        planet[2] = new Planets("Earth", "Planet", 59000000L, 29, 6371, 1);
        planet[3] = new Planets("Mars", "Planet", 64000000L, 24, 3396, 2);
        planet[4] = new Planets("Jupiter", "Planet", 48000000L, 47, 2439, 4);
        planet[5] = new Planets("Saturn", "Planet", 48000000L, 47, 2439, 0);

        Star[] stars = new Star[1];
        stars [0] = new Star("Sun", "Star", 8237462300L, 985723, 9285702,23233233);

        Sattelites [] sattelites = new Sattelites[4];
        sattelites[0] = new Sattelites("Moon", "Satelite", 29420,2424,23424);
        sattelites[0] = new Sattelites("Fobos", "Satelite", 29420,2424,23424);
        sattelites[0] = new Sattelites("Deimos", "Satelite", 29420,2424,23424);
        sattelites[0] = new Sattelites("Europe", "Satelite", 29420,2424,23424);
    }


}
