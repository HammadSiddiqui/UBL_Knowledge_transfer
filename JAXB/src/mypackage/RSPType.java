
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDTList" type="{}FDTListType"/>
 *         &lt;element name="STAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BatchReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSPType", propOrder = {
    "fdtList",
    "stan",
    "batchReferenceNo"
})
public class RSPType {

    @XmlElement(name = "FDTList", required = true)
    protected FDTListType fdtList;
    @XmlElement(name = "STAN", required = true)
    protected String stan;
    @XmlElement(name = "BatchReferenceNo", required = true)
    protected String batchReferenceNo;

    /**
     * Gets the value of the fdtList property.
     * 
     * @return
     *     possible object is
     *     {@link FDTListType }
     *     
     */
    public FDTListType getFDTList() {
        return fdtList;
    }

    /**
     * Sets the value of the fdtList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDTListType }
     *     
     */
    public void setFDTList(FDTListType value) {
        this.fdtList = value;
    }

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
     * Gets the value of the batchReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchReferenceNo() {
        return batchReferenceNo;
    }

    /**
     * Sets the value of the batchReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchReferenceNo(String value) {
        this.batchReferenceNo = value;
    }


    @Override
    public String toString() {
        return "<RSP>\n" +
                fdtList.toString() +
                "\n</RSP>\n" + "<STAN>" + stan + "</STAN>\n" + "<BatchReferenceNo>" + batchReferenceNo + "</BatchReferenceNo>";
    }

}
