package net.bridge.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.bridge.spring.model.Fatorial;

@Repository
public interface FatorialRepository extends JpaRepository<Fatorial, Long> {
	

}
