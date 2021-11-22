package com.example.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wallet.domain.Account;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019/3/28
 */
public interface AccountRepository extends JpaRepository <Account, Long> {

    Account findByAccountId(String userId);

}
