package tn.esprit.spring.acv.queries.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;
import tn.esprit.spring.acv.queries.services.IInformationSpecifiqueQueryService;

import java.util.List;

@RestController
@RequestMapping("/InfoSpec")
@AllArgsConstructor
public class InformationSpecifiqueQueryController {
    private IInformationSpecifiqueQueryService service;

    @GetMapping("")
    public List<InformationSpecifiqueQuery> listerInfos(){
        return service.listerInformationsSpec();
    }

}
