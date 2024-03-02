package com.ashokIt;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringUtilTest {
	
	@Test
	public void StringToIntTest() {
		StringUtils stu = new StringUtils();
		
		assertThrows(IllegalArgumentException.class, () -> stu.StringToInt(null) );
		
	}

}
