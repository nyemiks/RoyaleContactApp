package com.test.contactapp
{

     import org.apache.royale.collections.ArrayList;

     [Bindable]
     [RemoteClass(alias="com.test.server.dto.ShortType")]
     public class ShortType implements Attribute
    {
       
       private var _name:String;
       private var _value:int;
       private var _values:ArrayList;

       
       public function ShortType()
       {
           trace(" --- init short type --- ");
       }

       public function set name(name:String) : void
       {
           _name = name;
       }

       public function get name():String
       {
           return _name;
       }


       public function set value(value:int) : void
       {
           _value = value;
       }

       public function get value():int
       {
           return _value;
       }
      

      public function set values(values:ArrayList) : void
       {
              trace(" --- short values list set --- ");
           _values = values;
       }

       public function get values():ArrayList
       {
           return _values;
       }

    }

}