package org.example.authentiation.repositories;

import org.example.authentiation.entities.demande_intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface demandeRepo extends JpaRepository<demande_intervention,Long> {
    Optional<demande_intervention> findDemandeBynumDem(Long numDem);


    void deleteDemandeBynumDem(Long id);
}