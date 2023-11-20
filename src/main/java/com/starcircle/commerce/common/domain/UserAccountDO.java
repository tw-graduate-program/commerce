package com.starcircle.commerce.common.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity(name = "user_account")
public class UserAccountDO {

    @Id
    @Column(length = 50)
    private String id;

    @Column(name = "username")
    private String userName;

    private String password;

    private String email;

    private String privilegeId;

}
