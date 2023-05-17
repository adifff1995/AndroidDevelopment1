package com.app.androiddevelopment1;

public class CountryModel {
    private String name;
    private String intro;
    private int flag;

    public CountryModel(String name, String intro, int flag) {
        this.name = name;
        this.intro = intro;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
