package com.test.server.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import com.test.server.dto.ContactDTO;
import com.test.server.dto.Record;
import com.test.server.dto.ShortType;
import com.test.server.dto.StringType;
import com.test.server.dto.Attribute;




@Service("contactService")
@RemotingDestination
public class ContactService {
	
	private static final Logger logger = Logger.getLogger(ContactService.class.getName());
	
	private List<ContactDTO> contacts;
	
	private List<Record> records;
	
	
	public ContactService()
	{
		logger.info("  -- Contact Service -- ");
		
		contacts = new ArrayList<ContactDTO>();
		
	  // loadContacts();

	   records = new ArrayList<Record>();
	   
	   loadContacts2();	
		
	}
	
	
	
	private void loadContacts()
	{
		
		logger.info(" -- load Contacts -- ");
		
	    	contacts.add(new ContactDTO("Gary", "gary@acme.org"));
		    contacts.add(new ContactDTO("Charles", "cyoung@acme.org"));
		    contacts.add(new ContactDTO("Karl", "kheint@acme.org"));
		    contacts.add(new ContactDTO("Jeff", "jeff@acme.org"));
		    contacts.add(new ContactDTO("Yvonne", "yvonne_yvonne@acme.org"));
		    contacts.add(new ContactDTO("Sung", "superstar001@acme.org"));
		    contacts.add(new ContactDTO("Shailyn", "spatellina@acme.org"));
		    contacts.add(new ContactDTO("John", "jjb@acme.org"));
		    contacts.add(new ContactDTO("Ricky", "rmartz@acme.org"));
		    contacts.add(new ContactDTO("Shaoling", "shaoling@acme.org"));
		    contacts.add(new ContactDTO("Olga", "olga077@acme.org"));
		    contacts.add(new ContactDTO("Ron", "regert@acme.org"));
		    contacts.add(new ContactDTO("Juan", "jperen@acme.org"));
		    contacts.add(new ContactDTO("Uday", "udaykum@acme.org"));
		    contacts.add(new ContactDTO("Amin", "amin@acme.org"));
		    contacts.add(new ContactDTO("Sati", "sparek@acme.org"));
		    contacts.add(new ContactDTO("Kal", "kalyane.kushnane@acme.org"));
		    contacts.add(new ContactDTO("Prakash", "prakash01@acme.org"));
		    
		    
		    logger.info(" contacts loaded !");
		    
		    logger.info(" contact list size: " + contacts.size());
		
	}
	

	private void loadContacts2()
	{
		
		logger.info(" -- load generic contacts ---- ");
	  
		Record record = new Record();
		record.setName("ContactDTO");
		
		StringType name = new StringType();
		name.setName("name");  
		name.setValue("Nyemike");
		
		StringType email = new StringType();
		email.setName("email");  
		email.setValue("nyemike2000@gmail.com");


		ShortType accountCategories = new ShortType();  // Other - default category
		accountCategories.setName("accountCategory");
		//accountCategories.setMultiValued(true);
		
		List<Short> values = new ArrayList<Short>();
		values.add(new Short("14"));
		values.add(new Short("100"));
		values.add(new Short("102"));
		accountCategories.setValues(values);

		StringType title = new StringType();
		title.setName("title");
		List<String> titles = new ArrayList<String>();
		titles.add("Mr");
		titles.add("Mrs");
		title.setValues(titles);

		
		
		record.put("name", name);
		record.put("email", email);
		record.put("accountCategory", accountCategories);
		record.put("title", title);
		


			
		/*  Row<String, Attribute> row = new Row<String, Attribute>();

		 row.putAll(record.getAttributes());

		 record.setRow(row);

		 logger.info(" row has been set !"); */

		 records.add(record);
		
		 logger.info(" records loaded ! ");
			
		 logger.info(" record list size: " + records.size());

		 for (Record record1: records)
		 {
			logger.info(" record attributes: " + record1.getAttributes());

		 }

		
	}
	
	 /**
	   * The contact list.
	   *
	   * @return The contact list.
	   */
	public List<ContactDTO> getContacts()
	  {
		  
		  logger.info(" -- getContacts oh -- ");
		  
		  logger.info(" contact size: " + contacts.size());
		  
	    return contacts;
	  }

	  /**
	   * The contact list.
	   *
	   * @param contacts The contact list.
	   */
	  public void setContacts(List<ContactDTO> contacts) 
	  {
		  
		  logger.info(" -- setContacts -- ");
		  
	    this.contacts = contacts;
	  }
	

	  public List<Record> getContacts2()
	{		
		
		 logger.info(" -- getContacts2() -- ");
		  		 
		 logger.info(" records size: " + records.size());

		  
		  
	    return records;
	}


    /**
	 * 
	 */
	public void newContact(Record record)
	{
       
		logger.info(" -- new contact -- ");

		logger.info(" record attributes size: " + record.getAttributes().size());

		logger.info(" attributes: " + record.getAttributes());

		logger.info(" retrieve map and anaylze it ");    

         Map<String, Attribute> attributes = record.getAttributes();


		   // using for-each loop for iteration over Map.entrySet()

		   for (Map.Entry<String, Attribute> entry : attributes.entrySet())
		   {   

			    logger.info(" Key = " + entry.getKey());

				logger.info(" typecast to type .. ");

               StringType stringType = (StringType)entry.getValue();

			   logger.info(" value = " + stringType.getValue());
	       }
       
	}


}
