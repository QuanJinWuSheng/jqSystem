package com.jqs.exceptions.jq_exceptions;

import lombok.Data;

/**
 * com.jq.bs.jq_common.jq_exceptions
 *
 * @author WuJinquan 2019年08月21日01:34
 * @version 1.0
 */
@Data
public class BusRuntimeException extends RuntimeException {

    /**
     * 异常对应的返回码
     */
    private String excCode;
    /**
     * 异常对应的描述信息
     */
    private String description;
}
