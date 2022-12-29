package org.camunda.bpm;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;
@Service("EmailDelegate")
public class EmailDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("Application");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Send Email OK");
	}

}