package com.javatpoint.mypkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashMapTest {
 
    public static void main(String[] args) {
        
        Employee key1= new Employee("Raj", 10);
        Employee key2= new Employee("Arjun", 20);
        Employee key3= new Employee("Sam", 30);
        Employee key4= new Employee("Ram", 30);
        
        
        Map<Employee, String> map= new HashMap<Employee, String>();
        
        map.put(key1, "employee_1");
        map.put(key2, "employee_2");
        map.put(key3, "employee_3");   
        map.put(key4, "employee_4");
      
    
        
        for (Entry<Employee, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey().getName() +"-"+entry.getKey().getid() +
            		"-" + entry.getValue());
        }
        
        key4.setid(40);
        
        System.out.println(map.get(key3));        
        System.out.println(map.get(new Employee("Sam", 30)));
        
        for (Entry<Employee, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey().getName() +"-"+entry.getKey().getid() + "-" + entry.getValue());
        }
        
    }
    
    
}
class Employee{    
 
    String name;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
  /*  @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
  
    
    
}
 