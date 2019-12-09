package ru.renue.fns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.renue.fns.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
