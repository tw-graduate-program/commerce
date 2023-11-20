package com.starcircle.commerce.core.impl;

import com.starcircle.commerce.adapter.out.UserAccountRepository;
import com.starcircle.commerce.common.dto.UserProfileDto;
import com.starcircle.commerce.core.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

    private final UserAccountRepository userAccountRepository;

    @Override
    public UserProfileDto getUserProfileDetail(String account) {
        return userAccountRepository.findById(account)
                .stream().map(it -> UserProfileDto.builder().userName(it.getUserName()).email(it.getEmail()).build())
                .findFirst()
                .get();
    }
}
