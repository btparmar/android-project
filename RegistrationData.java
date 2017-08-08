package com.example.poorveshvyas.login;

/**
 * Created by Poorvesh Vyas on 2/14/2017.
 */

public class RegistrationData {
    private String name;
    private  String userid;
    private  String pwd;

    public String getName(){
        return  name;
    }
    public String getUserid(){
        return userid;
    }public String getPwd(){
        return pwd;
    }
       public void setName(String name) {
        this.name = name;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


