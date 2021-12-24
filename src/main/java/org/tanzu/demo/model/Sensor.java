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
        
        int teamCode = ThreadLocalRandom.current().nextInt(1, 4);
        if (teamCode == 1) {
            this.team = "Devs";
        } else if (teamCode == 2) {
            this.team = "AppOps";
        } else if (teamCode == 3) {
            this.team = "ITOps";
        }
        
        int moodCode = ThreadLocalRandom.current().nextInt(1, 6);
        if (moodCode == 1) {
            this.mood = "Happy";
        } else if (moodCode == 2) {
            this.mood = "Sad";
        } else if (moodCode == 3) {
            this.mood = "Angry";
        } else if (moodCode == 4) {
            this.mood = "Scared";
        } else if (moodCode == 5) { 
            this.mood = "Depressed";
        }
    }

    public Sensor(String team, String mood) {
        this.team = team;
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
