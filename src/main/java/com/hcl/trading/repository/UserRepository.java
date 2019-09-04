package com.hcl.trading.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.trading.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUserNameAndPassword(String userName, String password);

}
