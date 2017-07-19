package com.websystique.springmvc.domain;

/**
 * Created by Qiushi on 7/18/2017.
 */
public class Message {
    private String name, text;

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
