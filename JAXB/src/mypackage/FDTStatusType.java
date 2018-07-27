
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FDTStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FDTStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDTStatusType", propOrder = {
    "stan",
    "txnReference",
    "postingDate",
    "hostStatusCode",
    "hostStatusDesc",
    "statusCode",
    "statusDesc"
})
public class FDTStatusType {

    @XmlElement(name = "STAN", required = true)
    protected String stan;
    @XmlElement(name = "TxnReference", required = true)
    protected String txnReference;
    @XmlElement(name = "PostingDate", required = true)
    protected String postingDate;
    @XmlElement(name = "HostStatusCode", required = true)
    protected String hostStatusCode;
    @XmlElement(name = "HostStatusDesc", required = true)
    protected String hostStatusDesc;
    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusDesc", required = true)
    protected String statusDesc;

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAN() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAN(String value) {
        this.stan = value;
    }

    /**
     * Gets the value of the txnReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnReference() {
        return txnReference;
    }

    /**
     * Sets the value of the txnReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnReference(String value) {
        this.txnReference = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the hostStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostStatusCode() {
        return hostStatusCode;
    }

    /**
     * Sets the value of the hostStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostStatusCode(String value) {
        this.hostStatusCode = value;
    }

    /**
     * Gets the value of the hostStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostStatusDesc() {
        return hostStatusDesc;
    }

    /**
     * Sets the value of the hostStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostStatusDesc(String value) {
        this.hostStatusDesc = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    @Override
    public String toString() {
        return "<STAN>" + stan + "</STAN>\n"
                + "    <TxnReference>" + txnReference + "</TxnReference>\n"
                + "    <PostingDate>" + postingDate + "</PostingDate>\n"
                + "    <HostStatusCode>" + hostStatusCode + "</HostStatusCode>\n"
                + "    <HostStatusDesc>" + hostStatusDesc + "</HostStatusDesc>\n"
                + "    <StatusCode>" + statusCode + "</StatusCode>\n"
                + "    <StatusDesc>" + statusDesc + "</StatusDesc>";
    }


}
