package com.test.server.dto;

import java.util.List;

public class ShortType extends AbstractType<Short> 
{
    
    public ShortType()
	{
		super();
	}
	
	
	public ShortType(Short value)
	{
		super(value);
		
	}
	
	
	public ShortType(List<Short> values)
	{
		super(values);		
	}

}
