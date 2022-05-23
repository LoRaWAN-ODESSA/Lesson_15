package com.company.dto;

import com.company.model.User;

public class StoreDto {
    private String name;
    private String url;
    private User[] users;
    private User authorizedUser;

    public StoreDto(String name, String url, User[] users, User authorizedUser) {
        this.name = name;
        this.url = url;
        this.users = users;
        this.authorizedUser = authorizedUser;
    }

    public StoreDto() {
        //EMPTY
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }
}
