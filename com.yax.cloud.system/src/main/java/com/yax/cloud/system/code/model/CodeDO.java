package com.yax.cloud.system.code.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @className: CodeDO
 * @description:
 * @author: yangxin
 * @date 2020-08-31
 */
@Data
@TableName("t_base_code")
public class CodeDO implements Serializable {
    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: TODO
     */
    private static final long serialVersionUID = -7683151604265277866L;
    @TableId("ID")
    private String id;
    @TableField("KD_CODE_ID")
    private String kdCodeId;
    @TableField("CODE_KEY")
    private String codeKey;
    @TableField("CODE_VAL")
    private String codeVal;
    @TableField("IS_AVAILABLE")
    private String available;
    @TableField("SORT_NUM")
    private Integer sortNum;
    @TableField("REMARK")
    private String remark;

}
