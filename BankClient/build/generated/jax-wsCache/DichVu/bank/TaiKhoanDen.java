
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaiKhoanDen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaiKhoanDen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stkDen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaiKhoanDen", propOrder = {
    "stkDen"
})
public class TaiKhoanDen {

    protected String stkDen;

    /**
     * Gets the value of the stkDen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStkDen() {
        return stkDen;
    }

    /**
     * Sets the value of the stkDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStkDen(String value) {
        this.stkDen = value;
    }

}
