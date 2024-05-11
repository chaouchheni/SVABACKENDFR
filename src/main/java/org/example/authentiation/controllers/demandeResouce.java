package org.example.authentiation.controllers;



import org.example.authentiation.services.demandeService;
import org.example.authentiation.entities.demande_intervention;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@CrossOrigin("*")

@RestController
@RequestMapping("Demandes")
public class demandeResouce {
    private final demandeService demandeService;

    public demandeResouce(demandeService demandeService) {
        this.demandeService = demandeService;
    }
    @GetMapping("all")
    public ResponseEntity<List<demande_intervention>> getAllDemandes(){
        List<demande_intervention> demandes = demandeService.findAllDemandes();
        return new ResponseEntity<>(demandes, HttpStatus.OK);
    }
    @GetMapping("/find/{numDem}")
    public ResponseEntity<demande_intervention> getDemandeBynumDem(@PathVariable("numDem")Long numDem){
        demande_intervention demandeIntervention = demandeService.findDemandeBynumDem(numDem);
        return new ResponseEntity<>(demandeIntervention, HttpStatus.OK);
    }
    @PostMapping("/add")
    public  ResponseEntity<demande_intervention> addDemande(@RequestBody demande_intervention demandeIntervention ){
        demande_intervention newDemande = demandeService.addDemande(demandeIntervention) ;
        return new ResponseEntity<>(newDemande, HttpStatus.CREATED);}
    @PutMapping("/update/{numDem}")
    public ResponseEntity<demande_intervention> updateDemande(@RequestBody demande_intervention demandeIntervention,@PathVariable Long numDem,@RequestParam String statut,@RequestParam String titre,@RequestParam String priorite,@RequestParam String dateDeb,@RequestParam String dateFin,@RequestParam String description) {
        demande_intervention updateDemande = demandeService.updateDemande(demandeIntervention,numDem,statut,titre,priorite,dateFin,dateDeb,description);
        return new ResponseEntity<>(updateDemande, HttpStatus.OK);
    }



    @DeleteMapping("/delete/{numDem}")
    public  ResponseEntity<?> deleteDemande(@PathVariable("numDem")Long numDem){
        demandeService.deleteDemande(numDem); ;
        return new ResponseEntity<>(HttpStatus.OK);

    }





}
