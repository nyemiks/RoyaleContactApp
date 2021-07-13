package com.test.contactapp
{
    [Bindable]
    [RemoteClass(alias="com.test.server.dto.Record")]
    public class Record
    {
        /*
        For the class to be mapped, both the Record.java and Record.as classes must expose the same properties and methods.
        As Brian told you, you could use the java2as generator.        
        */

        private var _name:String;
        private var _attributes:Object;

       //  private var _row:Row;

         public function set name(name:String) : void
       {
           _name = name;
       }

       public function get name():String
       {
           return _name;
       }


        public function set attributes(attributes:Object) : void
       {
           _attributes = attributes;
       }

       public function get attributes():Object
       {
           return _attributes;
       }

/* 
        public function set row(row:Row) : void
       {
           _row = row;
       }

       public function get row():Row
       {
           return _row;
       } */

    }

    
}