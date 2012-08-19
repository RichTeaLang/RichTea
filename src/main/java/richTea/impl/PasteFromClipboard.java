package richTea.impl;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;

import richTea.core.execution.AbstractFunction;

public class PasteFromClipboard extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Object value = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

		context.setLastReturnValue(value);
	}
}