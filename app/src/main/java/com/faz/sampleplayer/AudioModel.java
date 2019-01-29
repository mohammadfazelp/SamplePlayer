package com.faz.sampleplayer;

/**
 * Created by PIRI on 1/29/2019.
 */
public class AudioModel {

    private String title;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AudioModel(String title, String url) {
        this.title = title;
        this.url = url;
    }
}
