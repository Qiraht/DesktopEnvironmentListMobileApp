package com.dicoding.qiraht.recyclerview;

public class Item {
    private String name;
    private String detail;

    private String link;

    private int photo;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link;  }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
