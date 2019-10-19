package com.jqs.exceptions.configs;

import com.jqs.exceptions.jq_exceptions.BusRuntimeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * controller的统一异常
 *
 * @author WuJinquan 2019年08月21日01:19
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object globalErrorHandler(HttpServletRequest request, Exception e) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 111);
        result.put("eMsg", e.getMessage());
        result.put("url", request.getRequestURL().toString());
        result.put("msg", "请求处理失败");
        return result;
    }

    @ExceptionHandler(value = BusRuntimeException.class)
    @ResponseBody
    public Object globalBusRuntimeErrorHandler(HttpServletRequest request, BusRuntimeException e) {
        HashMap<String, Object> result = new HashMap<>();
        System.out.println(e);
        result.put("code", 111);
        result.put("eMsg", e.getExcCode() + " / " + e.getDescription());
        result.put("url", request.getRequestURL().toString());
        result.put("msg", "业务处理失败");
        return result;
    }
}
