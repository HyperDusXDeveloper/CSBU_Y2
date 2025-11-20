/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jtableguidemo;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class UserData implements Serializable {
    protected String FName ;
    protected String LName ;
    protected String PhoneNo ;
    protected String Email ;

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the PhoneNo
     */
    public String getPhoneNo() {
        return PhoneNo;
    }

    /**
     * @param PhoneNo the PhoneNo to set
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
