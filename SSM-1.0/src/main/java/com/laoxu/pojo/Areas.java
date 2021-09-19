package com.laoxu.pojo;

public class Areas {
    private Integer id;

    private String name;

    public Areas(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Areas() {
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
}