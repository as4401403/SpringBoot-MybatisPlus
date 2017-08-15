package org.springboot.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by 付勇 on 14/8/2017.
 */
@Data
@ToString
@NoArgsConstructor
public class OutputBean {
    @ApiModelProperty(value = "描述信息",required = true)
    private String msg;
    @ApiModelProperty(value = "成功与否",required = true)
    private boolean success=true;

    public OutputBean(String msg, boolean success) {
        this.msg = msg;
        this.success = success;
    }
}
