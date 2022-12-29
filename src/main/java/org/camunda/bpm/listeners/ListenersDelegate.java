package org.camunda.bpm.listeners;

import org.camunda.bpm.Application;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class ListenersDelegate implements ExecutionListener {

	@Override
	public void notify(DelegateExecution execution) throws Exception {
//		Application.getMeter().counterBuilder("ValorIncremental").build().add(1);
	}
}
