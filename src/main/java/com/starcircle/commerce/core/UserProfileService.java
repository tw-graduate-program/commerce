package com.starcircle.commerce.core;

import com.starcircle.commerce.common.UserProfileDto;

public interface UserProfileService {
    UserProfileDto getUserProfileDetail(String account);
}
