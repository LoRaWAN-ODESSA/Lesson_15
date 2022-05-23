package com.company.service;

import com.company.dto.LogInDto;
import com.company.dto.StoreDto;
import com.company.dto.UserDto;
import com.company.model.Store;
import com.company.view.LogIn;
import com.company.view.LogInReport;

public class LogInService {

    public LogInDto build(Store store) {
        StoreDto storeDto = buildStoreDto(store);
        LogIn logIn = new LogIn();
        UserDto userDto = logIn.getLogInData();
        return new LogInDto(userDto, storeDto);
    }

    public StoreDto buildStoreDto(Store store) {
        StoreDto storeDto = new StoreDto(store.getName(), store.getUrl(), store.getUsers(), store.getAuthorizedUser());
        return storeDto;
    }

    public void tryLogIn(LogInDto logInDto) {
        LogInReport logInReport = new LogInReport();
        if(login(logInDto)) {
            logInReport.printCurrentUserRights(logInDto);
            logInReport.printLogOutInfo(logInDto);
            logOut(logInDto);
        } else {
            logInReport.printWrongMsg();
        }
    }

    public boolean login(LogInDto logInDto) {
        for (int i = 0; i < logInDto.getStoreDto().getUsers().length; i++) {
            if (logInDto.getStoreDto().getUsers()[i].getLogin().equals(logInDto.getUserDto().getLogin()) &&
                    logInDto.getStoreDto().getUsers()[i].getPassword().equals(logInDto.getUserDto().getPassword())) {
                logInDto.getStoreDto().setAuthorizedUser(logInDto.getStoreDto().getUsers()[i]);
                return true;
            }
        }
        return false;
    }

    public void logOut(LogInDto logInDto) {
        logInDto.getStoreDto().setAuthorizedUser(null);
    }
}
