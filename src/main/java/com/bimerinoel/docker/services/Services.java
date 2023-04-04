package com.bimerinoel.docker.services;

import com.bimerinoel.docker.dtos.UserData;

import java.util.List;

/**
 * @author Bimeri Noel
 * @date 4/4/2023
 */

public interface Services {

 List<UserData> getAllUsers(String active);
}
