package com.company.view;

import com.company.dto.UserDto;

import java.util.Scanner;

public class LogIn {

    public UserDto getLogInData() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner2.nextLine();
        return new UserDto(login, password);
    }


}
