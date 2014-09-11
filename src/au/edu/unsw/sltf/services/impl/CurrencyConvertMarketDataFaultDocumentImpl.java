/*
 * An XML document type.
 * Localname: currencyConvertMarketDataFault
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currencyConvertMarketDataFault(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrencyConvertMarketDataFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument
{
    
    public CurrencyConvertMarketDataFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCONVERTMARKETDATAFAULT$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyConvertMarketDataFault");
    
    
    /**
     * Gets the "currencyConvertMarketDataFault" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault getCurrencyConvertMarketDataFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault)get_store().find_element_user(CURRENCYCONVERTMARKETDATAFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currencyConvertMarketDataFault" element
     */
    public void setCurrencyConvertMarketDataFault(au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault currencyConvertMarketDataFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault)get_store().find_element_user(CURRENCYCONVERTMARKETDATAFAULT$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault)get_store().add_element_user(CURRENCYCONVERTMARKETDATAFAULT$0);
            }
            target.set(currencyConvertMarketDataFault);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyConvertMarketDataFault" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault addNewCurrencyConvertMarketDataFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault)get_store().add_element_user(CURRENCYCONVERTMARKETDATAFAULT$0);
            return target;
        }
    }
    /**
     * An XML currencyConvertMarketDataFault(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrencyConvertMarketDataFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault
    {
        
        public CurrencyConvertMarketDataFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INVALIDMARKETDATA$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "InvalidMarketData");
        
        
        /**
         * Gets the "InvalidMarketData" element
         */
        public java.lang.String getInvalidMarketData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InvalidMarketData" element
         */
        public org.apache.xmlbeans.XmlString xgetInvalidMarketData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InvalidMarketData" element
         */
        public void setInvalidMarketData(java.lang.String invalidMarketData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDMARKETDATA$0);
                }
                target.setStringValue(invalidMarketData);
            }
        }
        
        /**
         * Sets (as xml) the "InvalidMarketData" element
         */
        public void xsetInvalidMarketData(org.apache.xmlbeans.XmlString invalidMarketData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDMARKETDATA$0);
                }
                target.set(invalidMarketData);
            }
        }
    }
}
