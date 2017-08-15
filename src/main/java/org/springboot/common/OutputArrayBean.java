package org.springboot.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by 付勇 on 14/8/2017.
 */
@Data
@ToString
public class OutputArrayBean<T> extends OutputBean {
    @ApiModelProperty(value = "返回数组数据", required = true)
    private List<T> date;

    public OutputArrayBean(List<T> date) {
        this.date = date;
    }
}
