package com.starcircle.commerce.adapter;

import com.starcircle.commerce.common.UserProfileDto;
import com.starcircle.commerce.core.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user-profile")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @GetMapping("/{account}")
    public UserProfileDto getUserProfile(@PathVariable String account) {
        return userProfileService.getUserProfileDetail(account);
    }
}
