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
    }

    public Sensor(String team, String mood) {
        this.team = team;
        this.mood = mod;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        //return temperature;
        switch(doRandom()) {
            case 1: return "Devs";
            case 2: return "AppOps";
            case 3: return "ITOps";
            case 4: return "Security";
            case 5: return "DBAs";
        }
    }

    public String getMood() {
        //return pressure;
        switch(doRandom()) {
            case 1: return "Happy";
            case 2: return "Sad";
            case 3: return "Angry";
            case 4: return "Scared";
            case 5: return "Depressed";
        }
    }
    
    private int doRandom() {
        return ThreadLocalRandom.current().nextInt(1, 5);
    }
}
