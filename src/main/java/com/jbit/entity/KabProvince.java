package com.jbit.entity;

public class KabProvince {
    private Integer id;

    private String provincename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }
}