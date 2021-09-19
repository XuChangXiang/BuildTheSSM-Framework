package com.laoxu.pojo;

public class Streets {
    private Integer id;

    private String name;

    private Integer areaid;

    public Streets(Integer id, String name, Integer areaid) {
        this.id = id;
        this.name = name;
        this.areaid = areaid;
    }

    @Override
    public String toString() {
        return "Streets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areaid=" + areaid +
                '}';
    }

    public Streets() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }
}