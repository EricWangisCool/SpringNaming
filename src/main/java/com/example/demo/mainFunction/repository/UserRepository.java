package com.example.demo.mainFunction.repository;

import com.example.demo.mainFunction.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Integer> {
    UserBean findOneByUserId(int userId);

    @Query(value = """
        SELECT user_name 
          FROM t_user 
         WHERE user_id = ?1
        """
        , nativeQuery = true)
    String findUserNameByUserId(int userId);

}
