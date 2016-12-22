package by.htp.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventCreateTest {

	@Test
	public void createEventTest() {
		EventLogic logic = new EventLogic();
		assertNotNull(logic.createEvent());
	}

}
