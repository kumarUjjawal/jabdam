package com.usemalloc.jabdam;

/**
 * Created by ujjawalpathak on 19/10/17.
 */

public class MessageModel {

    private String name;
    private String text;
    private String photoUrl;

    public MessageModel () {}

    public MessageModel(String name, String text, String photoUrl) {
        this.name = name;
        this.text = text;
        this.photoUrl = photoUrl;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String getPhotoUrl() { return photoUrl; }

    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

}
