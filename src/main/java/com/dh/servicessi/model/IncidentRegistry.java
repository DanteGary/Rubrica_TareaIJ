package com.dh.servicessi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class IncidentRegistry extends ModelBase {
    private Date dateIncident;
    private String descrption;
   /* @OneToMany(mappedBy = "incidentRegistry", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})*/
    private List<Incident> incidents = new ArrayList<>();

    public Date getDateIncident() {
        return dateIncident;
    }

    public void setDateIncident(Date dateIncident) {
        this.dateIncident = dateIncident;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }
}
