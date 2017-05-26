
package Soap.jaxws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getReceiveReportOnProducts", namespace = "http://Soap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReceiveReportOnProducts", namespace = "http://Soap/", propOrder = {
    "date",
    "salePoint"
})
public class GetReceiveReportOnProducts {

    @XmlElement(name = "date", namespace = "")
    private Date date;
    @XmlElement(name = "salePoint", namespace = "")
    private model.SalePoint salePoint;

    /**
     * 
     * @return
     *     returns Date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * 
     * @param date
     *     the value for the date property
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     returns SalePoint
     */
    public model.SalePoint getSalePoint() {
        return this.salePoint;
    }

    /**
     * 
     * @param salePoint
     *     the value for the salePoint property
     */
    public void setSalePoint(model.SalePoint salePoint) {
        this.salePoint = salePoint;
    }

}
