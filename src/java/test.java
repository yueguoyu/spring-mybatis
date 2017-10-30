import com.ygy.dbCon.dbControIN;
import com.ygy.dbCon.dbController;
import com.ygy.getSqlSession.getSessionInter;
import com.ygy.getSqlSession.getSqlSession;
import com.ygy.model.User;
import com.ygy.service.service;
import com.ygy.service.serviceIm;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class test {
   static InputStream inputStream;
   static SqlSessionFactory sqlSessionFactory;
   static SqlSession sqlSession;
@Test
    public void test(){
        getSessionInter getSqlSession = new getSqlSession();
        sqlSession=getSqlSession.getsession();
        User user=new User();
        user.setId(1);
           user.setName("tf");
           user.setPassword("123");
           user.setPower(1);
   // User user1=sqlSession.selectOne("selectuser",user);
    dbControIN contro=new dbController();
   User user1= contro.select(user);
    System.out.println(user1.getName()+"  "+user1.getPassword());
    }
}
