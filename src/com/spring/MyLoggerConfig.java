package com.spring;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyLoggerConfig {
	
	private String rootLoggingLevel;
	private String printedLoggingLevel;
	
	public void setRootLoggingLevel(String rootLoggingLevel) {
		this.rootLoggingLevel = rootLoggingLevel;
	}
	public void setPrintedLoggingLevel(String printedLoggingLevel) {
		this.printedLoggingLevel = printedLoggingLevel;
	}
	
	public void initLogger() {
		
		Level rootLevel = Level.parse(rootLoggingLevel);
		Level printLevel = Level.parse(printedLoggingLevel);
		
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
		Logger loggerParent = applicationContextLogger.getParent();
		
		loggerParent.setLevel(rootLevel);
		
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		loggerParent.addHandler(consoleHandler);
		
		
	}

}
