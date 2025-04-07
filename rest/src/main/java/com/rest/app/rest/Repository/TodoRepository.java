package com.rest.app.rest.Repository;

import com.rest.app.rest.Model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Tareas, Long> {
}
