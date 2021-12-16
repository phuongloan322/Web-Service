
package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuuNhanTien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LuuNhanTien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stkTu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stkDen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTienChuyen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="noidung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuuNhanTien", propOrder = {
    "stkTu",
    "stkDen",
    "soTienChuyen",
    "noidung"
})
public class LuuNhanTien {

    protected String stkTu;
    protected String stkDen;
    protected long soTienChuyen;
    protected String noidung;

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

    /**
     * Gets the value of the soTienChuyen property.
     * 
     */
    public long getSoTienChuyen() {
        return soTienChuyen;
    }

    /**
     * Sets the value of the soTienChuyen property.
     * 
     */
    public void setSoTienChuyen(long value) {
        this.soTienChuyen = value;
    }

    /**
     * Gets the value of the noidung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoidung() {
        return noidung;
    }

    /**
     * Sets the value of the noidung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoidung(String value) {
        this.noidung = value;
    }

}
