package com.bimerinoel.docker.controller.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bimeri Noel
 * @date 4/14/2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserDto {
 private String fullName;
 private String profileUrl;
}
