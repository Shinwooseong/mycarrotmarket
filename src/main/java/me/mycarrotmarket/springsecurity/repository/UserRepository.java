package me.mycarrotmarket.springsecurity.repository;

import java.util.Optional;
import me.mycarrotmarket.springsecurity.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
  Optional<UserInfo> findByEmail(String email);
}
