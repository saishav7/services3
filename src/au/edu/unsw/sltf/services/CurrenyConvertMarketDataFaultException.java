
/**
 * CurrenyConvertMarketDataFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package au.edu.unsw.sltf.services;

public class CurrenyConvertMarketDataFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1410539612060L;
    
    private au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument faultMessage;

    
        public CurrenyConvertMarketDataFaultException() {
            super("CurrenyConvertMarketDataFaultException");
        }

        public CurrenyConvertMarketDataFaultException(java.lang.String s) {
           super(s);
        }

        public CurrenyConvertMarketDataFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CurrenyConvertMarketDataFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument msg){
       faultMessage = msg;
    }
    
    public au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument getFaultMessage(){
       return faultMessage;
    }
}
    