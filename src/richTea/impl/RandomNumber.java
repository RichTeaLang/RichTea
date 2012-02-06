package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class RandomNumber extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		double minimum = getMinimum();
		double maximum = getMaximum();
		
		if(minimum < maximum) {
			double randomNumberInRange = minimum + (int) (Math.random() * ((maximum - minimum) + 1));

			context.returnValue(randomNumberInRange);
		} else {
			throw new IllegalArgumentException("Minimum value must be smaller than the maximum");
		}
		
	}
	
	protected double getMinimum() {
		return context.getNumberOrDefault("minimum", 0);
	}
	
	protected double getMaximum() {
		return context.getNumberOrDefault("maximum", 1);
	}
}
