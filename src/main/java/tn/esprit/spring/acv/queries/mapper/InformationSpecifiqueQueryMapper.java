package tn.esprit.spring.acv.queries.mapper;

import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;

public class InformationSpecifiqueQueryMapper {
    public static InformationSpecifiqueQuery dtoToModel(InformationSpecifiqueDto dto){
        InformationSpecifiqueQuery info = null;
        try {
            info = InformationSpecifiqueQuery.builder()
                    .id(dto.getId())
                    .visibilite(dto.getVisibilite())
                    .sourceDonnees(dto.getSourceDonnees())
                    .auteur(dto.getAuteur())
                    .date_creation(dto.getDate_creation())
                    .date_modification(dto.getDate_modification())
                    .facteurEmission(dto.getFacteurEmission())
                    .typeProcessus(dto.getTypeProcessus())
                    .build();
        }catch (Exception e) {
            e.getMessage();
        }
        return info;
    }
}
