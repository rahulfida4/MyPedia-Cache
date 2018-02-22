package com.pedia.qa.util;

import com.pedia.qa.base.TestBase;

public class TsetUtil extends TestBase  {
	
	public 	static long  PAGE_LOAD_TIMEOUT=20;
	public	static long IMPLICIT_WAIT_TIMEOUT=10;

	public void switchToFrame(){
		
		driver.switchTo().frame("mainpanel");
	}


	}



