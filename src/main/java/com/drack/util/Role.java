package com.drack.util;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER(Arrays.asList(Permission.READ_ALL_USER)),
    ADMINISTRATOR(Arrays.asList(Permission.READ_ALL_USER));

    private List<Permission> permissions;

    Role(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
