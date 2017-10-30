package com.ygy.getSqlSession;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class getSqlSession implements getSessionInter{
    static InputStream inputStream;
    static SqlSessionFactory sqlSessionFactory;
    static  SqlSession sqlSession;
    public SqlSession getsession(){
        try {
            inputStream= Resources.getResourceAsStream("dbconf.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
}
