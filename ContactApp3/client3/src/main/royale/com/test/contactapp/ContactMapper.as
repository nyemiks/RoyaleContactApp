package com.test.contactapp
{
  
    import com.test.contactapp.ContactDTO;
    import org.apache.royale.collections.ArrayList;
  
    import com.test.contactapp.Record;
    import com.test.contactapp.StringType;
    import com.test.contactapp.ShortType;
    

   public class ContactMapper
   {
       



     public function recordToDTO(records:ArrayList): ArrayList
     {

         trace(" -- recordToDTO -- ");

         var contacts: ArrayList = new ArrayList();

       
         for each(var record:Record in records)
         {
             //trace(value);
               
               var contact:ContactDTO = new ContactDTO();

                trace(" name:" + record.name);
                 
                    trace(" attributes:" + record.attributes);
                     
                     var attributes:Object = record.attributes;

                     var nameField: String = attributes.name.value;
                      var emailField: String = attributes.email.value;

                      contact.name = attributes.name.value;
                      contact.email = attributes.email.value;

                       trace(" attribute name field:" + contact.name);
                       trace(" attribute email field:" + contact.email);

                       /* 
                       var titleStringType:StringType = attributes.title;

                      trace(" attribute title field name:" + titleStringType.name);

                       trace(" title string type values: " + titleStringType.values);

                   
                      var accountShortType:ShortType = attributes.accountCategory;      

                     trace(" attribute account type field name:" + accountShortType.name);
                                                    
                     trace(" account short type values: " + accountShortType.values);

                       var accountCategoryColl:ArrayList = accountShortType.values;
                       var titleListColl:ArrayList = titleStringType.values;

                       var accountCategoryList:ArrayList = new ArrayList();
                       var titleList:ArrayList = new ArrayList();

                    
                      
                        for (var index:String in accountCategoryColl) 
                       {
                           trace(" index: " + index + ":" + accountCategoryColl[index]);
                           accountCategoryList.addItem(accountCategoryColl[index]);
                           
                         

                           trace(" added !");
                       }


                     
                   
                       for (var index1:String in titleListColl)
                       {                          
                           trace(" index: " + index1 + ": " + titleListColl[index1]);
                             titleList.addItem(titleListColl[index1]);
                         
                          

                           trace(" added !");
                       }
  

                      contact.title = titleList;

                      contact.accountCategory = accountCategoryList; */


             contacts.addItem(contact);
         }
           

          return contacts;
     }


     public function DtoToRecord(contacts:ArrayList):ArrayList
     {

         trace("  -- dto to record -- ");

         var records: ArrayList = new ArrayList();
           

         for each (var contact:ContactDTO in contacts)
         {
             var record:Record = new Record();

             var attributes:Object= new Object();

             attributes.name = contact.name;
             attributes.email = contact.email;

             record.attributes = attributes;

             records.addItem(record);
         }

        return records;
     }


     public function DtoToRecord2(contact:ContactDTO):Record
     {

           trace(" -- dto to record 2 -- ");

           var record:Record = new Record();

           var attributes:Object = new Object();


           var nameType: StringType = new StringType();
           var emailType: StringType = new StringType();

            nameType.value = contact.name;
            emailType.value = contact.email;

            attributes.name = nameType;
            attributes.email = emailType;


            record.attributes = attributes;
           
        return record;
     }

   }

}