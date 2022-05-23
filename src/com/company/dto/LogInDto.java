package com.company.dto;

public class LogInDto {
    UserDto userDto;
    StoreDto storeDto;

    public LogInDto(UserDto userDto, StoreDto storeDto) {
        this.userDto = userDto;
        this.storeDto = storeDto;
    }

    public LogInDto() {
        //EMPTY
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public StoreDto getStoreDto() {
        return storeDto;
    }

    public void setStoreDto(StoreDto storeDto) {
        this.storeDto = storeDto;
    }
}
