package org.camunda.bpm;

import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.exception.CustomException;

public class DocumentDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("Application");

	public void execute(DelegateExecution execution) throws Exception {
		Integer value = (Integer) execution.getVariable("amount");
//		execution.setVariable("Teste123", value);
		if(value == 10000) {
//			throw new BpmnError("100");
			execution.createIncident("someType", "someConfiguration", "someMessage");
		}
	}

}