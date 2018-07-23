package com.gold.request.mch;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tangkaifei
 */
@Data
public class Base64Photo implements Serializable {

    private static final long serialVersionUID = 2224275895305583848L;
    /** 图片类型
     * 仅支持"png", "jpg"类型的图片
     * */
    private String fileType;
    /** base64字符串 */
    private String base64Code;
}
