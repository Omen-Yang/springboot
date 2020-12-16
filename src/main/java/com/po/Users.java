package com.po;

import java.io.Serializable;

public class Users implements Serializable {
    public Users() {
    }
    private String uname;
    private String passwd;

    public Users(String uname, String passwd) {
        this.uname = uname;
        this.passwd = passwd;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public String getPasswd() {
        return passwd;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
