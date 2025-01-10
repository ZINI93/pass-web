package com.fastcampus.pass.passweb.servcie.user;

import com.fastcampus.pass.passweb.repository.user.UserStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String userId;
    private String userName;
    private UserStatus status;

}
