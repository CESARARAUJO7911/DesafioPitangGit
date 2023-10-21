package org.desafio.repository;

import org.desafio.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
