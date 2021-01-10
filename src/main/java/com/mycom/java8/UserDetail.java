package com.mycom.java8;

public class UserDetail extends User{
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UserDetail(Integer id, String name, String desc) {
        super(id, name);
        this.desc = desc;
    }

    public UserDetail(Integer id, String name) {
        super(id,name);
    }
}
