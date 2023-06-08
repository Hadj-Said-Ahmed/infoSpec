package tn.esprit.spring.acv.queries.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tn.esprit.spring.acv.dto.InformationSpecifiqueDto;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;
import tn.esprit.spring.acv.queries.mapper.InformationSpecifiqueQueryMapper;
import tn.esprit.spring.acv.queries.repositories.InformationSpecifiqueQueryRepository;

@Service
@AllArgsConstructor
public class InformationSpecifiqueHandlerImpl implements IInformationSpecifiqueHandler{
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private InformationSpecifiqueQueryRepository repository;
    @Override
    public InformationSpecifiqueQuery ajouterInfo(InformationSpecifiqueDto dto) {
        return repository.save(InformationSpecifiqueQueryMapper.dtoToModel(dto));
    }

    @KafkaListener(topics = "info_specific_event_add", groupId = "Info_specific_consumer")
    public void consumer_add_info_specific(String result){
        try {
            InformationSpecifiqueDto informationSpecifiqueDto = OBJECT_MAPPER.readValue(result, InformationSpecifiqueDto.class);
            this.ajouterInfo(informationSpecifiqueDto);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
