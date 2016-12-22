package by.htp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestEventLogic {
	
	public static final String TEST_TRUE = "Test true";
	public static final String TEST_FALSE = "Test false";
	
	private static EventLogic logic;
	public String value;
	
	@Parameters
	public static List<String> data() {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("Test true");
		list.add("Test false");
		return list;
	}
	
//	public TestEventLogic(String value) {
//		
//		this.value = value;


//	}
	
	@BeforeClass
	public static void initEventLogic() {
		logic = new EventLogic();
	}
	
	@Test
	public void testdoSmthTrue() {
		assertEquals("Test true", logic.doSmth(value));
				
	}
	@Ignore
	@Test
	public void testdoSmthFalse() {
		assertEquals("Test true", logic.doSmth(TEST_FALSE));
		
	}

}
