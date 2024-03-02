package com.ashokIt;

public class StringUtils {
	
	public Integer StringToInt(String str) {
		if (str == null  || str.trim().length() == 0) {
			throw new IllegalArgumentException("Input is Null or Empty");
		}
		return Integer.parseInt(str);
		
	}

}
