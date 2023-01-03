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
    String role;
    String mood;
    String legacy;

    public Sensor() {
        
        this.role = generateRole();
        this.mood = generateMood();
        this.legacy = generateLegacy();
    }

    public Sensor(String role, String mood, String legacy) {
        this.role = role;
        this.mood = mood;
        this.legacy = legacy;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getMood() {
        return mood;
    }

    public String getLEgacy() {
        return legacy;
    }
    
    private String generateRole() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "architect";
            case 2:
                return "developer";
            case 3:
                return "app operator";
            case 4:
                return "platform operator";
            default:
                return "error!!";
        }
    }

    private String generateMood() {

        int rand = ThreadLocalRandom.current().nextInt(1, 4);
        switch(rand) {
            case 1:
                return "happy";
            case 2:
                return "sad";
            case 3:
                return "angry";
            default:
                return "error!!";
        }
    }

    private String generateLegacy() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "none";
            case 2:
                return "social issues";
            case 3:
                return "medical condition";
            case 4:
                return "social issues, medical condition";
            default:
                return "error!!";
        }
    }
}
