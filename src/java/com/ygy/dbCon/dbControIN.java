package com.ygy.dbCon;

import com.ygy.model.User;

public interface dbControIN {
    public void add(User user);
    public User select(User user);
    public void  delete(User user);
    public void update(User user);
}
