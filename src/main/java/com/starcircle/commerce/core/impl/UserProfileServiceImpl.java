package com.starcircle.commerce.core.impl;

import com.starcircle.commerce.common.UserProfileDto;
import com.starcircle.commerce.core.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfileDto getUserProfileDetail(String account) {
        return UserProfileDto.builder()
                .userName("userName")
                .email("email")
                .build();
    }
}
