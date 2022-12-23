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
                return "Architect";
            case 2:
                return "Developer";
            case 3:
                return "App Operator";
            case 4:
                return "Platform Operator";
            default:
                return "error!!";
        }
    }

    private String generateMood() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "Happy";
            case 2:
                return "Sad";
            case 3:
                return "Scared";
            case 4:
                return "Angry";
            default:
                return "error!!";
        }
    }

    private String generateLegacy() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "N/A";
            case 2:
                return "Social";
            case 3:
                return "Medical";
            case 4:
                return "Social, Medical";
            default:
                return "error!!";
        }
    }
}
