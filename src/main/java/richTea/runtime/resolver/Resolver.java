package richTea.runtime.resolver;

public interface Resolver {
	
	public Object getValue(String key);
	public Object getValueOrDefault(String key, Object defaultValue);
	
	public String getString(String key);
	public String getStringOrDefault(String key, String defaultValue);
	
	public Boolean getBoolean(String key);
	public Boolean getBooleanOrDefault(String key, Boolean defaultValue);
	
	public Number getNumber(String key);
	public Number getNumberOrDefault(String key, Number defaultValue);
}