package org.camunda.bpm.listeners;

import org.camunda.bpm.Application;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class ListenersGetVariableDelegate implements ExecutionListener {

	@Override
	public void notify(DelegateExecution execution) throws Exception {
//		Integer montante = (Integer) execution.getVariable("amount");
//		Application.getMeter().gaugeBuilder("montante")
//			.setDescription("Montante total")
//			.setUnit("Decimal")
//				.buildWithCallback(result -> result.record(montante));
	}
}
