package com.company.model;

public class Store {
    private String name;
    private String url;
    private User[] users;
    private User authorizedUser;

    public Store(String name, String url, User[] users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public Store() {
        //EMPTY
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public User[] getUsers() {
        return users;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }
}
