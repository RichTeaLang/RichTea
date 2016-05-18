package richTea.resolver;

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
		
		return value != null ? String.valueOf(value) : null;
	}

	@Override
	public String getStringOrDefault(String key, String defaultValue) {
		return String.valueOf(getValueOrDefault(key, defaultValue));
	}

	@Override
	public boolean getBoolean(String key) {
		return Boolean.valueOf(getString(key));
	}

	@Override
	public boolean getBooleanOrDefault(String key, boolean defaultValue) {
		String value = getString(key);
		
		return value != null ? Boolean.valueOf(value) : defaultValue;
	}

	@Override
	public double getNumber(String key) {
		return Double.valueOf(getString(key));
	}

	@Override
	public double getNumberOrDefault(String key, double defaultValue) {
		String value = getString(key);
		
		return value != null ? Double.valueOf(value) : defaultValue;
	}
}
