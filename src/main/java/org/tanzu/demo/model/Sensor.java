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
    String team;
    String mood;

    public Sensor() {
        
        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        if (rand == 1) {
            this.team = "architects";
        } else if (rand == 2) {
            this.team = "developers";
        } else if (rand == 3) {
            this.team = "app-operations";
        } else if (rand == 4) {
            this.team = "platform-operations";
        } 

        
        rand = ThreadLocalRandom.current().nextInt(1, 6);
        if (rand == 1) {
            this.mood = "happy";
        } else if (rand == 2) {
            this.mood = "sad";
        } else if (rand == 3) {
            this.mood = "scared";
        } else if (rand == 4) { 
            this.mood = "angry";
        } else if (rand == 5) { 
            this.mood = "legacy-mood";
        }
    }

    public Sensor(String planet, String mood) {
        this.team = planet;
        this.mood = mood;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getMood() {
        return mood;
    }
    
}
