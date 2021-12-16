
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSoTaiKhoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSoTaiKhoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSoTaiKhoan", propOrder = {
    "stk"
})
public class GetSoTaiKhoan {

    protected String stk;

    /**
     * Gets the value of the stk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStk() {
        return stk;
    }

    /**
     * Sets the value of the stk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStk(String value) {
        this.stk = value;
    }

}
