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
        
        switch(doRandom()) {
            case 1: this.team = "Devs";
            case 2: this.team = "AppOps";
            case 3: this.team = "ITOps";
            case 4: this.team = "Security";
            case 5: this.team = "DBAs";
        }
        
        switch(doRandom()) {
            case 1: this.mood = "Happy";
            case 2: this.mood = "Sad";
            case 3: this.mood = "Angry";
            case 4: this.mood = "Scared";
            case 5: this.mood = "Depressed";
        }
    }

    public Sensor(String team, String mood) {
        this.team = team;
        this.mood = mod;
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
    
    private int doRandom() {
        return ThreadLocalRandom.current().nextInt(1, 5);
    }
}
