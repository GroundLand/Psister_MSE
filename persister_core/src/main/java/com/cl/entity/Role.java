package com.cl.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by evel on 2017/9/15.
 */
@Data
@Alias("Role")
public class Role {
    private long id;
    private String name;
    private String description;
    private String permission;
}
