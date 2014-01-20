package fr.bomberman.server;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserTest {
	@Rule
    public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void before() {
		User.getList().clear();
	}
	
	@Test
	public void testRegister() throws Exception {
		User.createUser("Test");
	}
	
	@Test
	public void testMultipleRegister() throws Exception {
		User.createUser("MonTest");
		User.createUser("MonTest3");
	}
	
	@Test
	public void testMultipleRegisterFail() throws Exception {
		exception.expect(Exception.class);
		User.createUser("MonTest");
		User.createUser("MonTest");
	}
}
