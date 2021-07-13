package com.test.contactapp
{

    import org.apache.royale.collections.ArrayList;
    
    [Bindable]
    [RemoteClass(alias="com.test.server.dto.StringType")]
    public class StringType implements Attribute
    {
       public function StringType()
       {
           trace(" --- init StringType --- ");
       }
       
       private var _name:String;
       private var _value:String;
       private var _values:ArrayList;

       public function set name(name:String) : void
       {
           _name = name;
       }

       public function get name():String
       {
           return _name;
       }


       public function set value(value:String) : void
       {
           _value = value;
       }

       public function get value():String
       {
           return _value;
       }
      

      public function set values(values:ArrayList) : void
       {
           _values = values;
       }

       public function get values():ArrayList
       {
           return _values;
       }

    }

}