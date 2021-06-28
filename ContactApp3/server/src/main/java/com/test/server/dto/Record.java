package com.test.server.dto;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

public class Record implements Serializable {

    private String name = null;
    
    private Map<String, Attribute> attributes;   // single and multi valued fields are stored here
   
    

    public Record()
    {
       //  setKey(new PrimaryKey()); 
        
        // setUpdatedFields(new HashSet<String>());
        
         setAttributes(new HashMap<String, Attribute>());
        
       // getAttributes().setUpdatedFields(updatedFields);	
        
    }



   public String getName() {
       return name;
   }



   public void setName(String name) {
       this.name = name;
   }



   /** places an attribute at the specified key
	 * 
	 * @param key
	 * @param attribute
	 * @return
	 */
		public Attribute put(String key, Attribute attribute)
		{
			
			
		  return attributes.put(key, attribute);
		}
		
		
		
		/** returns the attribute at the specified key.		 *  
		 * @param key
		 * @return
		 */
		public Attribute get(String key)
		{
			// TODO Auto-generated method stub
						
		  return attributes.get(key);
		}
	

	public Map<String, Attribute> getAttributes() 
	{
		return attributes;
	}



	public void setAttributes(Map<String, Attribute> attributes)
	{
		this.attributes = attributes;
	}
	 

}
