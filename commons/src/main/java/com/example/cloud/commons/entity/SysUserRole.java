package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysUserRole {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer uid;
    private Integer rid;
}
