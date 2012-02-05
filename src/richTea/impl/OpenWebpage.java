package richTea.impl;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import richTea.core.execution.AbstractFunction;

public class OpenWebpage extends AbstractFunction {

	@Override
	protected void run() throws IOException, URISyntaxException {
		Desktop.getDesktop().browse(new URI(getURL()));
	}
	
	protected String getURL() {
		return context.getString("url");
	}

}
