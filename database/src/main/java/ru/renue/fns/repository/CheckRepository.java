package ru.renue.fns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.renue.fns.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Check.CompositeId> {
}
