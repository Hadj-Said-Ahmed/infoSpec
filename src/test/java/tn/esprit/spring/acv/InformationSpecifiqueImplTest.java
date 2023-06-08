package tn.esprit.spring.acv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.acv.commands.services.IInformationSpecifiqueCommandService;
import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;
import tn.esprit.spring.acv.enumeration.Facteur_emission;
import tn.esprit.spring.acv.enumeration.Type_processus;

@SpringBootTest
public class InformationSpecifiqueImplTest {
    @Autowired
    private IInformationSpecifiqueCommandService service;
    @Test
    public void ajouterInformationSpecifique (){
        InformationSpecifiqueDto dto = new InformationSpecifiqueDto();
        dto.setAuteur("ahmed");
        dto.setVisibilite(1);
        dto.setSourceDonnees("Entreprise");
        dto.setTypeProcessus(Type_processus.Brut);
        dto.setFacteurEmission(Facteur_emission.ACV);
        service.ajouterInfo(dto);
    }
}
