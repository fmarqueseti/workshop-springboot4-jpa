package br.eti.fmarques.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eti.fmarques.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
