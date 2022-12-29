package org.camunda.bpm;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("UpdateAccountDelegate")
public class UpdateAccountDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("Application");

	public void execute(DelegateExecution execution) throws Exception {

		boolean result = (boolean)execution.getVariable("isCompleted");
		if(result==true) {
			LOGGER.info("Process OK");	
		}else {
			LOGGER.warning("Process NOK");
		}
		
	}
	
}