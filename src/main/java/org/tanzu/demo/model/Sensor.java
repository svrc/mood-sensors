package org.tanzu.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.concurrent.ThreadLocalRandom;


@Entity
public class Sensor {

    @Id
    @GeneratedValue
    int id;
    String planet;
    String mood;

    public Sensor() {
        
        int rand = ThreadLocalRandom.current().nextInt(1, 6);
        if (rand == 1) {
            this.planet = "Mars";
        } else if (rand == 2) {
            this.planet = "Venus";
        } else if (rand == 3) {
            this.planet = "Jupiter";
        } else if (rand == 4) {
            this.planet = "Neptune";
        } else if (rand == 5) {
            this.planet = "Saturn";
        }

        
        rand = ThreadLocalRandom.current().nextInt(1, 7);
        if (rand == 1) {
            this.mood = "Happy";
        } else if (rand == 2) {
            this.mood = "Sad";
        } else if (rand == 3) {
            this.mood = "Bored";
        } else if (rand == 4) {
            this.mood = "Scared";
        } else if (rand == 5) { 
            this.mood = "Clinically Depressed";
        } else if (rand == 5) { 
            this.mood = "Socially Angry";
        }
    }

    public Sensor(String planet, String mood) {
        this.planet = planet;
        this.mood = mood;
    }

    public int getId() {
        return id*10;
    }

    public String getPlanet() {
        return planet;
    }

    public String getMood() {
        return mood;
    }
    
}
