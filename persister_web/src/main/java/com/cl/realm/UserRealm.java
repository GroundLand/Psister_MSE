package com.cl.realm;

import com.cl.util.StringUtil;
import com.cl.entity.Role;
import com.cl.entity.User;
import com.cl.mapper.RoleMapper;
import com.cl.mapper.UserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by evel on 2017/9/14.
 */
@Component
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    public UserRealm(){
        setName("UserRealm");   //需要相同
        setCredentialsMatcher(new HashedCredentialsMatcher());
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Long userId = (Long)principalCollection.fromRealm(getName()).iterator().next();
        User user = userMapper.findUserByUserId(userId);
        if (user != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            List<Long> idList = StringUtil.splitToList(user.getRoleId(),",");
            List<Role> roleList = roleMapper.getRoleByRoleIds(idList);
            for(Role role:roleList){
                info.addRole(role.getName());
                info.addStringPermission(role.getPermission());
            }
            return info;

        }else {
            return null;
        }

    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = userMapper.findUserByUserName(token.getUsername());
        if( user != null){
            return new SimpleAuthenticationInfo(user.getId(),user.getPassword(),getName());
        }else {
            return null;
        }
    }

}
