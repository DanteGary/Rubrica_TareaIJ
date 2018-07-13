package com.dh.servicessi.repositorios;

import com.dh.servicessi.model.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, Long> {
}
