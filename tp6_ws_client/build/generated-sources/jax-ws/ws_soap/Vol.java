
package ws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heure_arr" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="heure_dep" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vol", propOrder = {
    "code",
    "heureArr",
    "heureDep"
})
public class Vol {

    protected String code;
    @XmlElement(name = "heure_arr")
    protected float heureArr;
    @XmlElement(name = "heure_dep")
    protected float heureDep;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the heureArr property.
     * 
     */
    public float getHeureArr() {
        return heureArr;
    }

    /**
     * Sets the value of the heureArr property.
     * 
     */
    public void setHeureArr(float value) {
        this.heureArr = value;
    }

    /**
     * Gets the value of the heureDep property.
     * 
     */
    public float getHeureDep() {
        return heureDep;
    }

    /**
     * Sets the value of the heureDep property.
     * 
     */
    public void setHeureDep(float value) {
        this.heureDep = value;
    }

}
