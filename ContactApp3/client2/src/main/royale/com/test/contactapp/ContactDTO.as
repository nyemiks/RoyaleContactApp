package com.test.contactapp
{

   import org.apache.royale.collections.ArrayList;

   
   [Bindable]
   //[RemoteClass(alias="com.test.server.dto.ContactDTO")]
   public class ContactDTO
    {
       public function ContactDTO(){}

        private var fullName:String;

        private var emailAddress:String;

        private var _accountCategory:ArrayList;

        private var _title:ArrayList;


     public function set email(email : String) : void
     {
        emailAddress = email;
     }

     public function get email():String
     {
        return emailAddress;
     }
   

      public function set name(name:String) : void
     {
        fullName = name;                
     }

     public function get name():String
     {
        return fullName;
     }

      public function set accountCategory(accountCategory:ArrayList) : void
     {
        _accountCategory = accountCategory;                
     }

     public function get accountCategory():ArrayList
     {
        return _accountCategory;
     }


      public function set title(title:ArrayList) : void
     {
        _title = title;                
     }

     public function get title():ArrayList
     {
        return _title;
     }

    }
}