package com.ygy.service;

import com.ygy.dbCon.dbControIN;
import com.ygy.dbCon.dbController;
import com.ygy.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class serviceIm implements service{
   static SqlSession sqlSession;
   static String ym;              //页面名字
   public String select(User user) {   //进行判断
       dbControIN con=new dbController();
       //先进行查询判断是否有
     User user1;
     user1=con.select(user);         //从数据库获得的数据
       if(user1!=null) {
           if (user.getPassword().equals(user1.getPassword())) {
               ym= "success";
           }
           else {
               ym= "test";                  //返回登录页面
           }
       }else {
                 ym="zhuce";                       //注册页面
       }
       return ym;
   }
}
