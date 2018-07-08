package com.lh.manager.error;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 自定义错误处理controller
 */
public class MyErrorController extends BasicErrorController {

    public MyErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorProperties, errorViewResolvers);
    }

    /**
     * {
     *     "timestamp": "2018-07-08 16:13:27",
     *     "status": 500,
     *     "error": "Internal Server Error",
     *     "exception": "java.lang.IllegalArgumentException",
     *     "message": "编号不可为空",
     *     "path": "/manager/products"
     * }
     */
    @Override
    protected Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        Map<String, Object> attributes =  super.getErrorAttributes(request, includeStackTrace);
        attributes.remove("timestamp");
        attributes.remove("status");
        attributes.remove("error");
        attributes.remove("exception");
        attributes.remove("path");
        String errorCode = (String) attributes.get("message");
        ErrorEnum errorEnum = ErrorEnum.getByCode(errorCode);
        attributes.put("message",errorEnum.getMessage());
        attributes.put("code",errorEnum.getCode());
        attributes.put("canRetry",errorEnum.isCanRetry());
        return attributes;
    }
}
