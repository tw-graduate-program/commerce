package com.starcircle.commerce.adapter.out;

import com.starcircle.commerce.common.domain.UserAccountDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountDO, String> {
}
