
package com.connectme.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetGroupResponse", namespace = "http://webservice.connectme.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGroupResponse", namespace = "http://webservice.connectme.com/")
public class GetGroupResponse {

    @XmlElement(name = "return", namespace = "")
    private com.connectme.webservice.GroupPojo _return;

    /**
     * 
     * @return
     *     returns GroupPojo
     */
    public com.connectme.webservice.GroupPojo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.connectme.webservice.GroupPojo _return) {
        this._return = _return;
    }

}
