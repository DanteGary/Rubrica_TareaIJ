package com.dh.servicessi.controller;

import com.dh.servicessi.repositorios.IncidentRegistryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncidentRegistryController {
    private IncidentRegistryRepository incidentRegistryRepository;

    public IncidentRegistryController(IncidentRegistryRepository incidentRegistryRepository) {
        this.incidentRegistryRepository = incidentRegistryRepository;
    }

    @RequestMapping("/incidentRegistries")
    public String getIncidentRegisties(Model model){
        model.addAttribute("incidentRegistries", incidentRegistryRepository.findAll() );
        return "incidentRegistries";
    }
}
