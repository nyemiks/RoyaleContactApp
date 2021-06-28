package com.test.contactapp
{

     import org.apache.royale.collections.ArrayList;

   
   [Bindable]
    public class ContactDTO
    {
        private var fullName:String;

        private var emailAddress:String;

        private var _accountCategory:ArrayList;

        private var _title:ArrayList;


     public function set email(email : String) : void
     {
        this.emailAddress = email;
     }

     public function get email():String
     {
        return emailAddress;
     }
   

      public function set name(name:String) : void
     {
        this.fullName = name;                
     }

     public function get name():String
     {
        return fullName;
     }

      public function set accountCategory(accountCategory:ArrayList) : void
     {
        this._accountCategory = accountCategory;                
     }

     public function get accountCategory():ArrayList
     {
        return this._accountCategory;
     }


      public function set title(title:ArrayList) : void
     {
        this._title = title;                
     }

     public function get title():ArrayList
     {
        return this._title;
     }

    }
}