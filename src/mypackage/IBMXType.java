
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for IBMXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBMXType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDTRsp" type="{}FDTRspType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "IBMX")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBMXType", propOrder = {
    "fdtRsp"
})
public class IBMXType {

    @XmlElement(name = "FDTRsp", required = true)
    protected FDTRspType fdtRsp;

    /**
     * Gets the value of the fdtRsp property.
     * 
     * @return
     *     possible object is
     *     {@link FDTRspType }
     *     
     */
    public FDTRspType getFDTRsp() {
        return fdtRsp;
    }

    /**
     * Sets the value of the fdtRsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDTRspType }
     *     
     */
    public void setFDTRsp(FDTRspType value) {
        this.fdtRsp = value;
    }

    @Override
    public String toString() {
        return "<IBMX>\n" +
                    fdtRsp.toString() +
                "\n</IBMX>";
    }

}
