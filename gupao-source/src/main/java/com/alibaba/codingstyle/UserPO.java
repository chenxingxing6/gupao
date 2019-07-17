package com.alibaba.codingstyle;

import java.io.Serializable;

/**
 * User: lanxinghua
 * Date: 2019/6/20 10:11
 * Desc:
 */
public class UserPO implements Serializable {

    private boolean isDeleted;


    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
