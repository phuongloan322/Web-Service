
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoiPIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoiPIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mkcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mkmoi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoiPIN", propOrder = {
    "user",
    "mkcu",
    "mkmoi"
})
public class DoiPIN {

    protected String user;
    protected String mkcu;
    protected String mkmoi;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the mkcu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMkcu() {
        return mkcu;
    }

    /**
     * Sets the value of the mkcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMkcu(String value) {
        this.mkcu = value;
    }

    /**
     * Gets the value of the mkmoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMkmoi() {
        return mkmoi;
    }

    /**
     * Sets the value of the mkmoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMkmoi(String value) {
        this.mkmoi = value;
    }

}
