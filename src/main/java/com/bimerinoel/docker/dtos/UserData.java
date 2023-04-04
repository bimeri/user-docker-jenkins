package com.bimerinoel.docker.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Bimeri Noel
 * @date 4/4/2023
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
  private String fName;
  private String lName;
  private String email;
  private Date dates = new Date();
}
