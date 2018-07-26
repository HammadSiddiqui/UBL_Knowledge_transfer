
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FDTRspType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FDTRspType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSP" type="{}RSPType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDTRspType", propOrder = {
    "rsp"
})
public class FDTRspType {

    @XmlElement(name = "RSP", required = true)
    protected RSPType rsp;

    /**
     * Gets the value of the rsp property.
     * 
     * @return
     *     possible object is
     *     {@link RSPType }
     *     
     */
    public RSPType getRSP() {
        return rsp;
    }

    /**
     * Sets the value of the rsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSPType }
     *     
     */
    public void setRSP(RSPType value) {
        this.rsp = value;
    }

    @Override
    public String toString() {
        return "<FDTRsp>\n" +
                rsp.toString() +
                "\n</FDTRsp>";
    }
}
