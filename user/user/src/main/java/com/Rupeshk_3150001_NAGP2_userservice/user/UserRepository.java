package com.Rupeshk_3150001_NAGP2_userservice.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
 //User FindByid(Integer id);
}
