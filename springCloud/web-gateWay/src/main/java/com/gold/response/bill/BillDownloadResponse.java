package com.gold.response.bill;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gold.response.AbstractHstypayResponse;
import lombok.Data;


@JacksonXmlRootElement(localName = "xml")
@Data
public class BillDownloadResponse extends AbstractHstypayResponse {

    private String data;
}
