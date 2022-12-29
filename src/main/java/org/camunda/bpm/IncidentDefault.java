package org.camunda.bpm;

import org.camunda.bpm.engine.impl.incident.IncidentContext;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.engine.impl.persistence.entity.IncidentEntity;
import org.camunda.bpm.engine.runtime.Incident;

public class IncidentDefault implements IncidentHandler {

	@Override
	public String getIncidentHandlerType() {
		// TODO Auto-generated method stub
		return "Teste incident";
	}

	@Override
	public Incident handleIncident(IncidentContext context, String message) {
		// TODO Auto-generated method stub
		return IncidentEntity.createAndInsertIncident("tipo do incidente", context, message);
	}

	@Override
	public void resolveIncident(IncidentContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteIncident(IncidentContext context) {
		// TODO Auto-generated method stub
	}

}
