/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author yjang
 */
public class Players {
       String name;
    int number;
    String birth;
    String position;
    int goalsScored;

    Players(String name, int number, String birth, String position, int goalsScored) {
        this.name = name;
        this.number = number;
        this.birth = birth;
        this.position = position;
        this.goalsScored = goalsScored;
    }
}
