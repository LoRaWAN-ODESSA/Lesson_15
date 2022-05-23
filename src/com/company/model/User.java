package com.company.model;

public class User {
    private String login;
    private String password;
    private String name;
    private Role role = Role.ANONYMOUS;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public User() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + name + '\'' +
                ", Rights=" + role + '\'' +
                ", Login='" + login + '\'' +
                ", Password='" + password +
                '}';
    }
}
