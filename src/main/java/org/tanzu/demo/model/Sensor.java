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

    public Sensor() {
        
        this.role = generateRole();
        this.mood = generateMood();
    }

    public Sensor(String role, String mood) {
        this.role = role;
        this.mood = mood;
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
                return "Happy " + checkLegacyMood();
            case 2:
                return "Sad " + checkLegacyMood();
            case 3:
                return "Scared " + checkLegacyMood();
            case 4:
                return "Angry " + checkLegacyMood();
            default:
                return "error!!";
        }
    }

    private String checkLegacyMood() {

        int rand = ThreadLocalRandom.current().nextInt(1, 5);
        switch(rand) {
            case 1:
                return "  |  Pre-existing conditions: None  ";
            case 2:
                return "  |  Pre-existing conditions: <font color='#B87333'>Medical</font>";
            case 3:
                return "  |  Pre-existing conditions: <font color='#B87333'>Social</font>";
            case 4:
                return "  |  Pre-existing conditions: <font color='#B87333'>Medical, Social</font>";
            default:
                return "error!!";
        }
    }

}
