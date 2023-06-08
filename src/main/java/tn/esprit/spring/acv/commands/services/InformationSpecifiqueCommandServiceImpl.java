package tn.esprit.spring.acv.commands.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tn.esprit.spring.acv.commands.mapper.InformationSpecifiqueCommandMapper;
import tn.esprit.spring.acv.commands.repositories.InformationSpecifiqueCommandRepository;
import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesCommands.InformationSpecifiqueCommand;

@Service
@AllArgsConstructor
public class InformationSpecifiqueCommandServiceImpl implements IInformationSpecifiqueCommandService{
    private KafkaTemplate<Long, String> kafkaTemplate;
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private InformationSpecifiqueCommandRepository repository;
    @Override
    public InformationSpecifiqueCommand ajouterInfo(InformationSpecifiqueDto dto) {
        InformationSpecifiqueCommand info = repository.save(InformationSpecifiqueCommandMapper.dtoToModel(dto));
        try{
            this.eventQuerryUnite(info, "info_specific_event_add");

    }catch (Exception e){
        e.getMessage();
    }
        return info;
    }

    private void eventQuerryUnite(Object object, String topic){
        try {
            String value = OBJECT_MAPPER.writeValueAsString(object);
            this.kafkaTemplate.send(topic, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
