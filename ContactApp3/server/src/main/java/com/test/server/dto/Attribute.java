package com.test.server.dto;

//import java.beans.PropertyChangeListener;
import java.util.List;



public interface Attribute<T> {
	
	
     // attributes can now have a name.   20201016
     public String getName();
	
	 public void setName(String name);
   
     public T getValue();
    
	 public List<T> getValues();
	
}
