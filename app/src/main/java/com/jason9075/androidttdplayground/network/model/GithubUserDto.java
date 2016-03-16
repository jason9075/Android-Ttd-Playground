package com.jason9075.androidttdplayground.network.model;

/**
 * Created by jason9075 on 2016/3/15.
 */
public class GithubUserDto {
    private String login;
    private int id;
    private String message;

    public GithubUserDto(String login, int id, String message) {
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
