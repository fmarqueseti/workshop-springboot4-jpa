package br.eti.fmarques.course.repositories;

import br.eti.fmarques.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
