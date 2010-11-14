package richTea.impl;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import richTea.core.execution.AbstractFunction;

public class CopyToClipboard extends AbstractFunction {

	@Override
	protected void run() {
		StringSelection text = new StringSelection(getText());
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(text, text);
	}
	
	protected String getText() {
		return getString("text");
	}
}