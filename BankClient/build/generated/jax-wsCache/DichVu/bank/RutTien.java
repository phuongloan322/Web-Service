
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RutTien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RutTien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTienRut" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RutTien", propOrder = {
    "stk",
    "soTienRut"
})
public class RutTien {

    protected String stk;
    protected long soTienRut;

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

    /**
     * Gets the value of the soTienRut property.
     * 
     */
    public long getSoTienRut() {
        return soTienRut;
    }

    /**
     * Sets the value of the soTienRut property.
     * 
     */
    public void setSoTienRut(long value) {
        this.soTienRut = value;
    }

}
