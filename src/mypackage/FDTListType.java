
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FDTListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FDTListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDTStatus" type="{}FDTStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDTListType", propOrder = {
    "fdtStatus"
})
public class FDTListType {

    @XmlElement(name = "FDTStatus", required = true)
    protected FDTStatusType fdtStatus;

    /**
     * Gets the value of the fdtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FDTStatusType }
     *     
     */
    public FDTStatusType getFDTStatus() {
        return fdtStatus;
    }

    /**
     * Sets the value of the fdtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDTStatusType }
     *     
     */
    public void setFDTStatus(FDTStatusType value) {
        this.fdtStatus = value;
    }
    @Override
    public String toString() {
        return "<FDTList>\n" +
                fdtStatus.toString() +
                "\n</FDTList>";
    }

}
