package com.company.view;

import com.company.dto.LogInDto;

public class LogInReport {

    public void printLogOutInfo(LogInDto logInDto) {
        System.out.println("User: " + logInDto.getStoreDto().getAuthorizedUser().getLogin() + " has logged out...");
    }
    public void printCurrentUserRights(LogInDto logInDto) {
        System.out.println("Congratulations! You have just logged in!");
        System.out.println(logInDto.getStoreDto().getAuthorizedUser().toString());
        switch (logInDto.getStoreDto().getAuthorizedUser().getRole()) {
            case DIRECTOR -> System.out.println("Store director, can manage personnel and prices.");
            case ADMINISTRATOR -> System.out.println("Store administrator, can add products and edit their descriptions.");
            case MANAGER -> System.out.println("Store manager, can communicate with clients.");
            case CLIENT -> System.out.println("Store client, can buy products and get discount.");
            case ANONYMOUS -> System.out.println("Anonymous user, can buy products and/or log in.");
        }
    }

    public void printWrongMsg() {
        System.out.println("Sorry. You have entered wrong login or/and password");
    }

}
