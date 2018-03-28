package com.lulu.cloud.repository;

import com.lulu.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: Milo.Ding
 * @Date: 2018/3/27 17:34
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}
