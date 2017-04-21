package com.javatpoint.pack2;

import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Sub extends Super {
	  private static final long serialVersionUID = 1L;
	    private String name;
	    
	    public Sub(String id) {
	           this.name = id;
	    }
	 
	    @Override
	    public String toString() {
	           return "Employee [id=" + name + "]";
	    }
	    
	    private void writeObject(ObjectOutputStream os) throws NotSerializableException {
	           throw new NotSerializableException("This class cannot be Serialized");
	    } 
	    
}
