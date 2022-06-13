package com.example.housephoto.api.dto;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.HashMap;
@Data
public class ResultDTO<T> extends HashMap<Object,Object> {

    /** 状态码 */
    public static final String CODE = "code";

    /** 返回内容 */
    public static final String MSG = "msg";

    /** 数据对象 */
    public static final String DATA = "data";

    /**
     * 初始化一个新创建的 ResultDTO 对象，使其表示一个空消息。
     */
    public ResultDTO() {}

    /**
     * 初始化一个新创建的 ResultDTO 对象
     * @param code 状态码
     * @param msg 返回内容
     */
    public ResultDTO(Integer code, String msg)
    {
        super.put(CODE, code);
        super.put(MSG, msg);
    }

    /**
     * 初始化一个新创建的 ResultDTO 对象
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public ResultDTO(Integer code, String msg, Object data)
    {
        super.put(CODE, code);
        super.put(MSG, msg);
        if (!StringUtils.isEmpty(data))
        {
            super.put(DATA, data);
        }
    }


    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> success(String msg, Object data)
    {
        return new com.example.housephoto.api.dto.ResultDTO(200, msg, data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> success(String msg)
    {
        return com.example.housephoto.api.dto.ResultDTO.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> success()
    {
        return com.example.housephoto.api.dto.ResultDTO.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> success(Object data) {
        return com.example.housephoto.api.dto.ResultDTO.success("操作成功", data);
    }

    /*==============================================================================*/
    /*==============================================================================*/
    /*==============================================================================*/

    /**
     * 返回错误消息
     *
     * @return
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> error()
    {
        return com.example.housephoto.api.dto.ResultDTO.error("操作失败");
    }


    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> error(String msg)
    {
        return com.example.housephoto.api.dto.ResultDTO.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> error(Integer code, String msg)
    {
        return new com.example.housephoto.api.dto.ResultDTO(code, msg, null);
    }


    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> com.example.housephoto.api.dto.ResultDTO<T> error(String msg, Object data)
    {
        return new com.example.housephoto.api.dto.ResultDTO(500, msg, data);
    }
}
