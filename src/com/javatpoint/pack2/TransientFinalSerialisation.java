package com.javatpoint.pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientFinalSerialisation {
	

	public static void main(String[] args) {
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("logInfo.out"));
			TransientVariableTest a = new TransientVariableTest();
			System.out.println("Before Serialization ...");
			System.out.println("transientStaticVar = " + TransientVariableTest.transientStaticVar);
			System.out.println("transientFinalVar = " + a.transientFinalVar);
			System.out.println("transientStaticFinalVar = " + TransientVariableTest.transientStaticFinalVar);
			System.out.println("transientVar = " + a.transientVar);
			o.writeObject(a);
			o.close();
			TransientVariableTest.transientStaticVar = "newTransientStaticVar";
		} catch (Exception e) {
			// deal with exception
		}

		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("logInfo.out"));
			TransientVariableTest x = (TransientVariableTest) in.readObject();
			System.out.println("After Serialization ...");
			System.out.println("transientStaticVar = " + TransientVariableTest.transientStaticVar);
			System.out.println("transientFinalVar = " + x.transientFinalVar);
			System.out.println("transientStaticFinalVar = " + TransientVariableTest.transientStaticFinalVar);
			System.out.println("transientVar = " + x.transientVar);
		} catch (Exception e) {
			// deal with exception
		}

	}

}
