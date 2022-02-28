/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HP
 */
public class Players {

    private String name, position;
    private int year;
    private String nation;
    private int number;

    public Players() {
    }

    public Players(String name, String position, int year, String nation, int number) {
        this.name = name;
        this.position = position;
        this.year = year;
        this.nation = nation;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Players{" + "name=" + name + ", position=" + position + ", year=" + year + ", nation=" + nation + ", number=" + number + '}';
    }

}
