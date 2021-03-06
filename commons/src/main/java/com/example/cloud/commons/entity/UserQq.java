package com.example.cloud.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class UserQq {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String nickname;
    private String openId;
}
