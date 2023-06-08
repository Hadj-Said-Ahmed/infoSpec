package tn.esprit.spring.acv.queries.handler;

import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;

public interface IInformationSpecifiqueHandler {
    InformationSpecifiqueQuery ajouterInfo(InformationSpecifiqueDto dto);
}
