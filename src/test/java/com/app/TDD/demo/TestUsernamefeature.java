package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsernamefeature {

	@Test
	public void UsernameTest()
	{
		UserNameCode obj = new UserNameCode();
		
		String username = "adminuser";
		String username1 = "admin/user"; 
		String username2 = "admin#user"; 
		String username3 = "admin123";
		
		Assert.assertTrue(obj.isvalidUsername(username));
		Assert.assertFalse(obj.isvalidUsername(username1),"This is not valid user");
		Assert.assertFalse(obj.isvalidUsername(username2),"This is not valid user");
		Assert.assertTrue(obj.isvalidUsername(username3));
		
		
	}
}
