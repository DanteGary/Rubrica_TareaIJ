package com.dh.servicessi.controller;

import com.dh.servicessi.repositorios.IncidentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncidentController {
    private IncidentRepository incidentRepository;

    public IncidentController(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @RequestMapping("/incidents")
    public String getIncidents(Model model){
        model.addAttribute("incidents",incidentRepository.findAll());
        return "incidents";
    }
}
