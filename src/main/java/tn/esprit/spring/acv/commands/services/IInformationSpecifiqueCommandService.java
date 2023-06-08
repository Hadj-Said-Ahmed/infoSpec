package tn.esprit.spring.acv.commands.services;

import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;

public interface IInformationSpecifiqueCommandService {
InformationSpecifiqueCommand ajouterInfo(InformationSpecifiqueDto dto);
}
