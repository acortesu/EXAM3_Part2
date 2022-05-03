package com.cenfotec.grillitoFeliz.repositories;

import com.cenfotec.grillitoFeliz.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
