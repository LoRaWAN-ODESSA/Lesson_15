package com.company.controller;

import com.company.dto.LogInDto;
import com.company.model.Store;
import com.company.service.LogInService;

public class AuthorizationController {
    public void execute(Store store) {
        LogInService logInService = new LogInService();
        LogInDto logInDto = logInService.build(store);
        logInService.tryLogIn(logInDto);
    }
}
