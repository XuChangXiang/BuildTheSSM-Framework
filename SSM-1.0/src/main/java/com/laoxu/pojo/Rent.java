package com.laoxu.pojo;

import java.util.Date;

public class Rent {
    private Integer id;

    private Integer userid;

    private String title;

    private String linkman;

    private String tel;

    private String type;

    private Integer apartment1;

    private Integer apartment2;

    private Double price;

    private String addr1;

    private String addr2;

    private Date creation;

    private String description;

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", userid=" + userid +
                ", title='" + title + '\'' +
                ", linkman='" + linkman + '\'' +
                ", tel='" + tel + '\'' +
                ", type='" + type + '\'' +
                ", apartment1=" + apartment1 +
                ", apartment2=" + apartment2 +
                ", price=" + price +
                ", addr1='" + addr1 + '\'' +
                ", addr2='" + addr2 + '\'' +
                ", creation=" + creation +
                ", description='" + description + '\'' +
                '}';
    }

    public Rent(Integer id, Integer userid, String title, String linkman, String tel, String type, Integer apartment1, Integer apartment2, Double price, String addr1, String addr2, Date creation, String description) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.linkman = linkman;
        this.tel = tel;
        this.type = type;
        this.apartment1 = apartment1;
        this.apartment2 = apartment2;
        this.price = price;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.creation = creation;
        this.description = description;
    }

    public Rent() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getApartment1() {
        return apartment1;
    }

    public void setApartment1(Integer apartment1) {
        this.apartment1 = apartment1;
    }

    public Integer getApartment2() {
        return apartment2;
    }

    public void setApartment2(Integer apartment2) {
        this.apartment2 = apartment2;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1 == null ? null : addr1.trim();
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2 == null ? null : addr2.trim();
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}