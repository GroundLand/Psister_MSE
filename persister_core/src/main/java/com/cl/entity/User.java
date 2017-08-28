package com.cl.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by evel on 2017/8/22.
 */
@Data
@Alias("User")
public class User {
    private Long userId;
    private String name;
    private String password;
    private String permission;
}
