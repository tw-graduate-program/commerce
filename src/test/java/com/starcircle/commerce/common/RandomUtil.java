package com.starcircle.commerce.common;

import java.util.Random;

public class RandomUtil {

    /**
     * numeral '0'
     */
    private static final Integer LEFT_LIMIT = 48;

    /**
     * letter 'z'
     */
    private static final Integer RIGHT_LLIMIT = 122;

    public static String randomString(int length) {
        return new Random().ints(LEFT_LIMIT, RIGHT_LLIMIT + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static UserProfileDto randomUserProfileDto(String account) {
        return UserProfileDto.builder()
                .userName(account)
                .email(randomString(10))
                .build();
    }
}
