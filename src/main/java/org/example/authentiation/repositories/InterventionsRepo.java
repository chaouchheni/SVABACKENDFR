package org.example.authentiation.repositories;


import org.example.authentiation.entities.Interventions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InterventionsRepo extends JpaRepository<Interventions, Long> {

    void deleteInterventionById(Long id);

    Optional<Interventions> findInterventionById(Long id);
    Optional<Interventions> findInterventionsByUserId(Long userId);

}
