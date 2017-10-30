package com.ygy.dbCon;

import com.ygy.getSqlSession.getSessionInter;
import com.ygy.getSqlSession.getSqlSession;
import com.ygy.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class dbController implements dbControIN{
   static getSessionInter getSqlSession = new getSqlSession();
    static SqlSession  sqlSession=getSqlSession.getsession();
    //添加
    public void add(User user) {
        sqlSession.insert("insert",user);
        sqlSession.commit();
        sqlSession.close();
    }
   //查询
    public User select(User user) {         //要进行异常处理 当没有时返回空
        try{
        User user1=sqlSession.selectOne("selectuser",user);
        sqlSession.close();
        return user1;
        }
        catch(Exception e){
        return null;
        }
    }
    //删除
    public void delete(User user) {
         sqlSession.delete("deleteuser",user);
         sqlSession.close();
    }
    //更改
    public void update(User user) {   //user为更改的数据    通过id进行更改
        sqlSession.update("updateByPrimaryKey", user);
        sqlSession.commit();
        sqlSession.close();
    }
}
