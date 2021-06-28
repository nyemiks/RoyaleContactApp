package com.test.contactapp
{

     //import org.apache.royale.collections.ArrayList;
    import mx.collections.ArrayCollection;


     [RemoteClass(alias="com.test.server.dto.StringType")]
     [Bindable]
    public class StringType implements Attribute
    {
       
       private var _name:String;
       private var _value:String;
       private var _values:ArrayCollection;


       public function set name(name:String) : void
       {
           this._name = name;
       }

       public function get name():String
       {
           return this._name;
       }


       public function set value(value:String) : void
       {
           this._value = value;
       }

       public function get value():String
       {
           return this._value;
       }
      

      public function set values(values:ArrayCollection) : void
       {
           this._values = values;
       }

       public function get values():ArrayCollection
       {
           return this._values;
       }

    }

}