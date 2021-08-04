/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class fom1 {
    private String user="";
    private String pass;
    private String tbdn;
    public fom1()
    {}
    public fom1(String user, String pass,String tbdn)
    {
        this.user = user;
        this.pass = pass;
        this.tbdn = tbdn;
    }

    public String getTbdn() {
        return tbdn;
    }

    public void setTbdn(String tbdn) {
        this.tbdn = tbdn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
