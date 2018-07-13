package com.dh.servicessi.bootstrap;

import com.dh.servicessi.model.Incident;
import com.dh.servicessi.model.IncidentRegistry;
import com.dh.servicessi.repositorios.IncidentRegistryRepository;
import com.dh.servicessi.repositorios.IncidentRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private IncidentRegistryRepository incidentRegistryRepository;
    private IncidentRepository incidentRepository;

    public DevBootstrap(IncidentRegistryRepository incidentRegistryRepository, IncidentRepository incidentRepository) {
        this.incidentRegistryRepository = incidentRegistryRepository;
        this.incidentRepository = incidentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Incident incidente = new Incident();
        incidente.setName("Factura");

        incidentRepository.save(incidente);

        IncidentRegistry grupo = new IncidentRegistry();
        grupo.setDateIncident(new Date(2010,5,6));
        grupo.setDescrption("Falta Facturas");

        incidentRegistryRepository.save(grupo);
    }
}
