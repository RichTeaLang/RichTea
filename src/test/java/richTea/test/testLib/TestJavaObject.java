package richTea.test.testLib;

public class TestJavaObject {
	public String someMethod(int x) {
		return "method1";
	}
	
	public String someMethod(Object x, Object y) {
		return "method2";
	}
	
	public String someMethod(Object x, Object y, boolean z) {
		return "method3";
	}
}
