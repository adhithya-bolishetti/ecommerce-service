package com.trainingmug.ecommerce.dto.request;

import com.trainingmug.ecommerce.enums.Gender;
import lombok.Data;

@Data
public class SignupRequestDto {
    private String name;
    private String email;
    private String password;
    private String phone;
    private Gender gender;
}
