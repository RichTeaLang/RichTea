package richTea.impl;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import richTea.core.execution.AbstractFunction;

public class RichTeaLogger extends AbstractFunction {
	
	@Override
	protected void run() {
		Logger logger = getLogger();
		Level level = getLevel();
		String message = getMessage();
		
		logger.log(level, message);
	}
	
	protected Logger getLogger() {
		return Logger.getLogger(context.getString("loggerName"));
	}
	
	protected Level getLevel() {
		return Level.toLevel(context.getString("level"));
	}
	
	protected String getMessage() {
		return context.getString("message");
	}
}