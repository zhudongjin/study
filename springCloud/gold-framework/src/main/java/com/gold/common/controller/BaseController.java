package com.gold.common.controller;

import com.gold.common.exception.BusinessException;
import com.gold.common.exception.CommonErrorCodes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：Controller父类
 */
@Slf4j
public abstract class BaseController {

	// 字符集
	public static final String CHARSET = "UTF-8";

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected HttpServletResponse response;

    protected void redirectToUrl(String url) {
        try {
            response.sendRedirect(url);
        } catch (IOException e) {
            throw new BusinessException(CommonErrorCodes.INVALID_REDIRECT_URL.toErrorCode(), e);
        }
    }
    
    /**
	 * 校验上传的文件
	 * @param accessory
	 * @return true 校验通过  false 校验失败
	 */
	protected boolean validUploadedImg(MultipartFile accessory, int maxSize) {
		List<String> validContentTypes = Arrays.asList(new String[]{"png", "jpg", "jpeg", "gif", "bmp"});
		
		String contentType = accessory.getContentType();
		String validType = "";
		long size = accessory.getSize();
		
		for (String type : validContentTypes) {
			if (contentType.indexOf(type) >= 0) {
				validType = type;
				break;
			}
		}
		if (validType.equals("") || size > maxSize) {
			return false;
		}
		return true;
	}


}
