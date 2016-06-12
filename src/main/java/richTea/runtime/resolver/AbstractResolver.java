package richTea.runtime.resolver;

import java.math.BigDecimal;

public abstract class AbstractResolver implements Resolver {
	
	public abstract Object getValue(String key);

	@Override
	public Object getValueOrDefault(String key, Object defaultValue) {
		Object value = getValue(key);
		
		return value != null ? value : defaultValue;
	}

	@Override
	public String getString(String key) {
		Object value = getValue(key);
		
		return value != null ? value.toString() : null;
	}

	@Override
	public String getStringOrDefault(String key, String defaultValue) {
		String value = getString(key);
		
		return value != null ? value : defaultValue;
	}

	public Boolean getBoolean(String key) {
		Object value = getValue(key);
		Boolean bool = null;
		
		if (value != null) {
			bool = value instanceof Boolean ? (Boolean) value : Boolean.valueOf(value.toString()); 
		}
		
		return bool;
	}

	@Override
	public Boolean getBooleanOrDefault(String key, Boolean defaultValue) {
		Boolean value = getBoolean(key);
		
		return value != null ? value : defaultValue;
	}

	@Override
	public Number getNumber(String key) {
		Object value = getValue(key);
		Number number = null;
		
		if (value != null) {
			number = value instanceof Number ? (Number) value : new BigDecimal(value.toString());
		}
		
		return number;
	}

	@Override
	public Number getNumberOrDefault(String key, Number defaultValue) {
		Number value = getNumber(key);
		
		return value != null ? value : defaultValue;
	}
}
