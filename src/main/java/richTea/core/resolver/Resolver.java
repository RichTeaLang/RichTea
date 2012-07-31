package richTea.core.resolver;

public interface Resolver {
	
	public Object getValue(String key);
	
	public Object getValueOrDefault(String key, Object defaultValue);
	
	public String getString(String key);
	
	public String getStringOrDefault(String key, String defaultValue);
	
	public boolean getBoolean(String key);
	
	public boolean getBooleanOrDefault(String key, boolean defaultValue);
	
	public double getNumber(String key);
	
	public double getNumberOrDefault(String key, double defaultValue);
}