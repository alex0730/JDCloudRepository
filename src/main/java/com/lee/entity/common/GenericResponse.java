package com.lee.entity.common;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse implements Serializable {

    /**
     * 程序定义状态码
     */
    private int code;
    /**
     * 必要的提示信息
     */
    private String message;
    /**
     * 业务数据
     */
    private Object datas;

    /**
     * 对业务数据单独处理
     */
    @Override
    public String toString() {
        if (Objects.isNull(this.datas)) {
            this.setDatas(new Object());
        }
        return JSON.toJSONString(this);
    }

}
