package com.java.admin.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.java.admin.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 科室表(Department)表实体类
 *
 * @author WangJun
 * @since 2022-02-06 13:52:05
 */

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("科室表实体")
public class Department extends BaseEntity {
    @ApiModelProperty("主键")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("科室名称")
    private String departmentName;

    @ApiModelProperty("科室类型(数据字典)")
    private String departmentType;

    @ApiModelProperty("数据字典")
    private String campus;

    @ApiModelProperty("科室位置")
    private String location;

    @ApiModelProperty("科室状态 0:关闭 1:开启")
    private String status;

    @ApiModelProperty("父级科室id,根级别0")
    private Integer parentId;
}

