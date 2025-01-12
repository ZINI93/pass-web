package com.fastcampus.pass.passweb.servcie.user;

import com.fastcampus.pass.passweb.repository.user.UserEntity;
import com.fastcampus.pass.passweb.repository.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(final String userId) {
        UserEntity userEntity = userRepository.findByUserId(userId);
        return UserModelMapper.INSTANCE.toUser(userEntity);

    }
}