package com.starcircle.commerce.core;

import com.starcircle.commerce.common.dto.UserProfileDto;

public interface UserProfileService {
    UserProfileDto getUserProfileDetail(String account);
}
