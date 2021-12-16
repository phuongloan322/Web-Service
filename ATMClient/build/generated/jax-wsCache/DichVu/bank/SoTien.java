
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoTien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoTien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stkTu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoTien", propOrder = {
    "stkTu"
})
public class SoTien {

    protected String stkTu;

    /**
     * Gets the value of the stkTu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStkTu() {
        return stkTu;
    }

    /**
     * Sets the value of the stkTu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStkTu(String value) {
        this.stkTu = value;
    }

}
