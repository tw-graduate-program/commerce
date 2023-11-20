package com.starcircle.commerce.core.impl;

import com.starcircle.commerce.adapter.out.UserAccountRepository;
import com.starcircle.commerce.common.UserProfileDto;
import com.starcircle.commerce.common.domain.UserAccountDO;
import com.starcircle.commerce.core.UserProfileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.starcircle.commerce.common.RandomUtil.randomString;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserProfileServiceImplTest {

    private UserProfileService userProfileService;

    @Mock
    private UserAccountRepository userAccountRepository;

    @BeforeEach
    void init() {
        userProfileService = new UserProfileServiceImpl(userAccountRepository);
    }

    @Test
    void should_return_user_profile_detail_by_account() {
        String account = randomString(10);
        UserAccountDO userAccountDO = UserAccountDO.builder()
                .userName(randomString(10))
                .email(randomString(20))
                .build();
        when(userAccountRepository.findById(account)).thenReturn(Optional.ofNullable(userAccountDO));

        UserProfileDto userProfileDto = userProfileService.getUserProfileDetail(account);

        assertThat(userProfileDto.getUserName()).isEqualTo(userAccountDO.getUserName());
        assertThat(userProfileDto.getEmail()).isEqualTo(userAccountDO.getEmail());
        verify(userAccountRepository, times(1)).findById(account);
    }
}