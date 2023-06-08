/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HUNTER
 */
public class HistoryVaccine {
   private String userName;
   private String gender;
   private String Hospital;
   private String date;
   private String vaccine;
   private double price;

    public HistoryVaccine() {
    }

    public HistoryVaccine(String userName, String gender, String Hospital, String date, String vaccine, double price) {
        this.userName = userName;
        this.gender = gender;
        this.Hospital = Hospital;
        this.date = date;
        this.vaccine = vaccine;
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HistoryVaccine{" + "userName=" + userName + ", gender=" + gender + ", Hospital=" + Hospital + ", date=" + date + ", vaccine=" + vaccine + ", price=" + price + '}';
    }
    

}