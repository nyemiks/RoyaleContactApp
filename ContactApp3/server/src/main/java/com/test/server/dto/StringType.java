package com.test.server.dto;

import java.util.List;

public class StringType extends AbstractType<String>
 {
    
    public StringType()
	{
	     // this(null);
		super();
	}
	
	
	
	public StringType(String value) 
	{
		super(value);		
	}
	
	
	public StringType(List<String> values) 
	{
		super(values);		
	}
	
		

}
