/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.model;

/**
 *
 * @author ADIKA
 */
public class User {
    private int ID;
    private String Username;
    private String Password;
    private String Nama;
    private String newNama;
    private String newUsername;
    private String newPassword;
    
    public User() {
    }

    public User(int ID, String Username, String Password, String Nama, String newNama, String newUsername, String newPassword) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Nama = Nama;
        this.newNama = newNama;
        this.newUsername = newUsername;
        this.newPassword = newPassword;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getNama() {
        return Nama;
    }

    public String getNewNama() {
        return newNama;
    }

    public void setNewNama(String newNama) {
        this.newNama = newNama;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    
}
