package com.starcircle.commerce.adapter;

import com.starcircle.commerce.adapter.in.UserProfileController;
import com.starcircle.commerce.common.dto.UserProfileDto;
import com.starcircle.commerce.core.impl.UserProfileServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.starcircle.commerce.common.RandomUtil.randomString;
import static com.starcircle.commerce.common.RandomUtil.randomUserProfileDto;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class UserProfileControllerTest {

    private UserProfileController userProfileController;

    @Mock
    private UserProfileServiceImpl userProfileService;

    @BeforeEach
    void init() {
        userProfileController = new UserProfileController(userProfileService);
    }

    @Test
    void should_acquire_user_profile_info() {
        String account = randomString(20);
        UserProfileDto userProfileExpect = randomUserProfileDto(account);
        when(userProfileService.getUserProfileDetail(account)).thenReturn(userProfileExpect);

        UserProfileDto userProfileActual = userProfileController.getUserProfile(account);

        assertThat(userProfileActual).isEqualTo(userProfileExpect);
        verify(userProfileService).getUserProfileDetail(account);
    }
}