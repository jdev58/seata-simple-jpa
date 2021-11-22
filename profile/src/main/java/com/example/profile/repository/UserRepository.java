package com.example.profile.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profile.domain.User;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019/3/28
 */

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(String userId);

}
