package com.dh.servicessi.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Incident extends ModelBase{
    private String name;
    /*@OneToOne(optional = false)*/
    private IncidentRegistry incidentRegistry;

    public String getName() {+++++
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public IncidentRegistry getIncidentRegistry() {
        return incidentRegistry;
    }

    public void setIncidentRegistry(IncidentRegistry incidentRegistry) {
        this.incidentRegistry = incidentRegistry;
    }
}
