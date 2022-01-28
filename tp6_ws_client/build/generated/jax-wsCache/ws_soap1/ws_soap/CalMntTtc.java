
package ws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cal_mnt_ttc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cal_mnt_ttc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="tva" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cal_mnt_ttc", propOrder = {
    "montant",
    "tva"
})
public class CalMntTtc {

    protected float montant;
    protected float tva;

    /**
     * Gets the value of the montant property.
     * 
     */
    public float getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(float value) {
        this.montant = value;
    }

    /**
     * Gets the value of the tva property.
     * 
     */
    public float getTva() {
        return tva;
    }

    /**
     * Sets the value of the tva property.
     * 
     */
    public void setTva(float value) {
        this.tva = value;
    }

}
