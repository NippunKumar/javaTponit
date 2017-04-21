package com.javatpoint.pack2;

import java.io.Serializable;

 class TransientVariableTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5293397709654015284L;
	transient static String transientStaticVar = "transientStaticVar";
	transient final String transientFinalVar;
	transient static final String transientStaticFinalVar ;
	
	 static {
		    transientStaticVar = "transientStaticVar";
		    transientStaticFinalVar = "transientStaticFinalVar";
		  }
		  
		  {
		    transientFinalVar = "transientFinalVar";
		  }

	transient String transientVar = "transientVar";

}
