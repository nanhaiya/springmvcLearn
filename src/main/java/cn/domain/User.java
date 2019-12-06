package cn.domain;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String uname;
    private Integer age;

    private Date birDate;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", birDate=" + birDate +
                '}';
    }
}
