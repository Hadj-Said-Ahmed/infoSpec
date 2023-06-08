package tn.esprit.spring.acv.commands.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.acv.commands.services.IInformationSpecifiqueCommandService;
import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;
import tn.esprit.spring.acv.enumeration.Facteur_emission;
import tn.esprit.spring.acv.enumeration.Type_processus;

@RestController
@RequestMapping("/InfoSpec")
@AllArgsConstructor
public class InformationSpecifiqueCommandController {
    private IInformationSpecifiqueCommandService service;

    @PostMapping("/ajouter")
    public InformationSpecifiqueCommand ajouterInfo(){
        InformationSpecifiqueDto dto = new InformationSpecifiqueDto();
        dto.setAuteur("ahmed");
        dto.setVisibilite(1);
        dto.setSourceDonnees("Entreprise");
        dto.setTypeProcessus(Type_processus.Brut);
        dto.setFacteurEmission(Facteur_emission.ACV);
        InformationSpecifiqueCommand c = service.ajouterInfo(dto);
        return c;
    }
}
