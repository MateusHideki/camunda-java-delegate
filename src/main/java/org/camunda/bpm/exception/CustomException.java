package org.camunda.bpm.exception;

import java.sql.SQLException;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.impl.errorcode.ExceptionCodeProvider;
import org.camunda.bpm.webapp.impl.engine.EngineRestApplication;

public class CustomException extends ProcessEngineException {

	public CustomException(String message, int code) {
		super(message, code);
	}
	
}
