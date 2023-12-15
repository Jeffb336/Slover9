/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author yjang
 */
public class Simulator {
     public static void main(String[] args) {
        // Initialize teams, players, and matches
        Teams team1 = new Teams("Team 1", new Players[] { /* player instances */ });
        Teams team2 = new Teams("Team 2", new Players[] { /* player instances */ });

        Matches match = new Matches(team1, team2);
        System.out.println(match);
    }
}
