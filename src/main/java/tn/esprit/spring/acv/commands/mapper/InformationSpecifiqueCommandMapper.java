package tn.esprit.spring.acv.commands.mapper;

import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;

public class InformationSpecifiqueCommandMapper {
    public static InformationSpecifiqueCommand dtoToModel(InformationSpecifiqueDto dto){
        InformationSpecifiqueCommand info = null;
        try {
            info = InformationSpecifiqueCommand.builder()
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
