
package bank_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiKhoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiKhoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hoTen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matKhau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTaiKhoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTien" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiKhoan", propOrder = {
    "hoTen",
    "matKhau",
    "soTaiKhoan",
    "soTien"
})
public class TaiKhoan {

    protected String hoTen;
    protected String matKhau;
    protected String soTaiKhoan;
    protected long soTien;

    /**
     * Gets the value of the hoTen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * Sets the value of the hoTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoTen(String value) {
        this.hoTen = value;
    }

    /**
     * Gets the value of the matKhau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * Sets the value of the matKhau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatKhau(String value) {
        this.matKhau = value;
    }

    /**
     * Gets the value of the soTaiKhoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    /**
     * Sets the value of the soTaiKhoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoTaiKhoan(String value) {
        this.soTaiKhoan = value;
    }

    /**
     * Gets the value of the soTien property.
     * 
     */
    public long getSoTien() {
        return soTien;
    }

    /**
     * Sets the value of the soTien property.
     * 
     */
    public void setSoTien(long value) {
        this.soTien = value;
    }

}
