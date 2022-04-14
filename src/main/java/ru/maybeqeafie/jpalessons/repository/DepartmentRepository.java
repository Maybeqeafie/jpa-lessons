package ru.maybeqeafie.jpalessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maybeqeafie.jpalessons.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
