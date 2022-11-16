package me.iantapply.scoutingPlatform.data;

import org.springframework.security.core.GrantedAuthority;

public enum UserRoles implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }

}
