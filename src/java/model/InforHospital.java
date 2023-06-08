/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HUNTER
 */
public class InforHospital {
    private String name;
    private String address;
    private String email;
    private String hotline;

    public InforHospital() {
    }

    public InforHospital(String name, String address, String email, String hotline) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.hotline = hotline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    @Override
    public String toString() {
        return "HospitalDAO{" + "name=" + name + ", address=" + address + ", email=" + email + ", hotline=" + hotline + '}';
    }
    
    
}
