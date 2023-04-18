package com.bimerinoel.docker.controller;

import com.bimerinoel.docker.dtos.UserData;
import com.bimerinoel.docker.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bimeri Noel
 * @date 4/4/2023
 */

@RestController
public class UserController {
 private Services services;

 @Autowired
 public UserController(Services services) {
  this.services = services;
 }

  @GetMapping(path = "/all")
  public ResponseEntity<List<UserData>> getAllUser(String active){
    return ResponseEntity.ok(services.getAllUsers(active));
  }
  @GetMapping(path = "/add")
  public ResponseEntity<List<UserData>> addUser(String active){
    return ResponseEntity.ok(services.getAllUsers(active));
  }

  @GetMapping(path = "/remove")
  public ResponseEntity<String> deleteUser(){
    return ResponseEntity.ok("User deleted");
  }

 public static List<Integer> gradingStudents(List<Integer> grades) {
  // Write your code here
  return grades.stream().map(UserController::gradeRule).collect(Collectors.toList());
 }

 public static int gradeRule(int grade) {
  int rem = grade%5;
  if(grade%5 < 3) {
   return grade + rem;
  }
  return grade;
 }

}
