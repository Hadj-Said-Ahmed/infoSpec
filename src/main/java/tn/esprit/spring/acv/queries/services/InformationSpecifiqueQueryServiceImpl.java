package tn.esprit.spring.acv.queries.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;
import tn.esprit.spring.acv.queries.repositories.InformationSpecifiqueQueryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InformationSpecifiqueQueryServiceImpl implements IInformationSpecifiqueQueryService{
    private InformationSpecifiqueQueryRepository repository;
    @Override
    public List<InformationSpecifiqueQuery> listerInformationsSpec() {
        return repository.findAll();
    }
}
