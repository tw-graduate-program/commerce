package com.starcircle.commerce.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfileDto {

    private String userName;

    private String email;
}
