package com.company.dto;

public class UserDto {
    private String login;
    private String password;

    public UserDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserDto() {
        //EMPTY
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
