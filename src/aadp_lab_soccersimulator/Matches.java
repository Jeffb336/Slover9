/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.Random;

/**
 *
 * @author yjang
 */
public class Matches {
    Teams team1;
    Teams team2;
    int team1Score;
    int team2Score;

    Matches (Teams team1, Teams team2) {
        this.team1 = team1;
        this.team2 = team2;
        simulateMatches();
    }
    
    private void simulateMatches() {
        Random rand = new Random();
        int totalGoals = 0;

        for (Players players : team1.player) {
            totalGoals += rand.nextInt(6);
        }
        team1Score = totalGoals;

        totalGoals = 0;
        for (Players players : team2.player) {
            totalGoals += rand.nextInt(6);
        }
        team2Score = totalGoals;
    }
       public String toString() {
        String result = "Congratulation ";
        if (team1Score > team2Score) {
            result += team1.name + "! " + team1.name + " scored " + team1Score + " goals and " + team2.name + " scored " + team2Score + " goals.";
        } else if (team1Score < team2Score) {
            result += team2.name + "! " + team1.name + " scored " + team1Score + " goals and " + team2.name + " scored " + team2Score + " goals.";
        } else {
            result += "It was a draw!! " + team1.name + " scored " + team1Score + " goals and " + team2.name + " scored " + team2Score + " goals.";
        }
        return result;
    }
    
}
