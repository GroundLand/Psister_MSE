package com.cl.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by evel on 2017/8/22.
 */
@Data
@Alias("User")
public class User {
    private Long id;
    private String name;
    private String password;
    private String permission;
    private int isDelete;
    private String roleId;
    private String email;
}
