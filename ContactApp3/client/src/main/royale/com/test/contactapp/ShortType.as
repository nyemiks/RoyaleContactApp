package com.test.contactapp
{

   //  import org.apache.royale.collections.ArrayList;
    import mx.collections.ArrayCollection;

     [RemoteClass(alias="com.test.server.dto.StringType")]
     [Bindable]
     public class ShortType implements Attribute
    {
       
       private var _name:String;
       private var _value:int;
       private var _values:ArrayCollection;

       
       public function ShortType()
       {
           trace(" --- init short type --- ");
       }

       public function set name(name:String) : void
       {
           this._name = name;
       }

       public function get name():String
       {
           return this._name;
       }


       public function set value(value:int) : void
       {
           this._value = value;
       }

       public function get value():int
       {
           return this._value;
       }
      

      public function set values(values:ArrayCollection) : void
       {
              trace(" --- short values list set --- ");

           this._values = values;
       }

       public function get values():ArrayCollection
       {
           return this._values;
       }

    }

}