package org.example.authentiation.repositories;


import org.example.authentiation.entities.contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface contratRepo extends JpaRepository<contrat,Long> {


    void deleteContratBynumcontrat(Long numcontart);

    Optional<contrat> findContratBynumcontrat(Long numcontart);




}

