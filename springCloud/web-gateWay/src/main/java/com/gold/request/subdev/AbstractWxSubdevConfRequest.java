package com.gold.request.subdev;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.gold.request.AbstractHstypayRequest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName: AbstractWxSubdevConfRequest
 * Function: 微信开发配置
 * date: 2017年10月9日 下午12:00:33
 *
 * @author tangkaifei
 */
@Getter
@Setter
public class AbstractWxSubdevConfRequest extends AbstractHstypayRequest {
	private static final long serialVersionUID = -1748552789922994298L;

	/** 商户号 */
    @NotBlank
    @Length(max=32)
    @JacksonXmlProperty(localName = "mch_id")
    private String mchId;

}

