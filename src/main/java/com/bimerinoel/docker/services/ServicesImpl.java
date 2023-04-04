package com.bimerinoel.docker.services;

import com.bimerinoel.docker.dtos.UserData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Bimeri Noel
 * @date 4/4/2023
 */

@Service
public class ServicesImpl implements Services{
    @Override
    public List<UserData> getAllUsers(String active) {
        List<UserData> userData = new ArrayList<>();
        userData.add(UserData.builder()
                .dates(new Date())
                .email("bimeri@email.com")
                .fName("bimeri")
                .lName("magaza")
                .lName("Noel")
                .build());
        userData.add(UserData.builder()
                .dates(new Date())
                .email("bimeri@email.com")
                .fName("bimeri")
                .lName("magaza")
                .lName("Noel")
                .build());
        userData.add(UserData.builder()
                .dates(new Date())
                .email("bimeri@email.com")
                .fName("bimeri")
                .lName("magaza")
                .lName("Noel")
                .build());
        return userData;
    }
}
