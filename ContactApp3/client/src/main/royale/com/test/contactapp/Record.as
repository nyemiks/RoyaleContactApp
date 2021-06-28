package com.test.contactapp
{
    [RemoteClass(alias="com.spacio.mdx.generic.dto.Record")]
    [Bindable]
    public class Record
    {
         private var _name:String;

         private var _attributes:Object;

       //  private var _row:Row;

         public function set name(name:String) : void
       {
           this._name = name;
       }

       public function get name():String
       {
           return this._name;
       }


        public function set attributes(attributes:Object) : void
       {
           this._attributes = attributes;
       }

       public function get attributes():Object
       {
           return this._attributes;
       }

/* 
        public function set row(row:Row) : void
       {
           this._row = row;
       }

       public function get row():Row
       {
           return this._row;
       } */

    }

    
}