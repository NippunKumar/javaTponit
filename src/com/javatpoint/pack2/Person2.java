package com.javatpoint.pack2;

import java.io.Serializable;

public class Person2 implements Serializable {


	private static final long serialVersionUID = -5995437396498885480L;
	private int id;
    public Person2(int id) {
        this.id = id;
 }
    @Override
    public String toString() {
           return "Person2 [id=" + id + "]";
    }
}
