package com.test.server.dto;



//import java.beans.PropertyChangeListener;
//import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


//import com.spacio.mdx.generic.dto.Attribute;
//import com.spacio.mdx.generic.dto.ValidationException;


/*
 * @author nyemi
 *
 * @param <T>
 */
public abstract class AbstractType<T> implements Serializable, Attribute 
{
	
		
		/**
	 * 
	 */
	private static final long serialVersionUID = -8172862490790744361L;

	
		protected String name;   
		
		
		// PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
		 
	
		    		    
	    protected T value = null;   // single value
			    
		protected List<T> values;  // multiple values
	
		
		
		public AbstractType()
		{
	     	//this.setRegexp(regExp);
		//	this.t = t;
		
		values = new ArrayList<T>();
		}
		
		public AbstractType(T value)
		{
	     	//this.setRegexp(regExp);
			this.value = value;
		}
		
	
		public AbstractType(List<T> values)
		{
			this.values = values;
		}
		
		
		 public String getName()
		 {
			 return name;
		 }
			

		@Override
		public T getValue() 
		{
		    return value;
		}
		
		
		
		public void setValue(T value) 
		{
			
			if (this.value != null && this.name != null)  
			{				
				//changeSupport.firePropertyChange(name, this.value, value);  // 20201016 fire field update event here

				// TODO Auto-generated method stub		     	
			}	 
			
			
			this.value = value;	
				
		}
		
		
			@Override
			public void setName(String name) 
			{
				// TODO Auto-generated method stub
				
				this.name  = name;
			}

		
			 @Override
			public List<T> getValues()
			{
				
				return values;
			}
			
			
		//	@Override
			public void setValues(List<T> values)
			{
				
				if (this.values != null && this.name != null)  
				{//	   changeSupport.firePropertyChange(name, this.values, values);

				}
                
				this.values = values;
			}

}
