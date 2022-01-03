package com.evo.testcases;

import org.testng.annotations.Test;

import com.evo.commonUtils.*;
import com.evo.pages.Login_Page;

public class Login_test {
	
	Login_Page login = new Login_Page();
	
	@Test
	public void TC001_Login() throws Exception {
		String UsrName = DataFile.CellData(1, 0);
		String Psword = DataFile.CellData(1, 1);
		login.setUsername(UsrName);
		login.setPassword(Psword);
		login.clickLogin();
	}

}
