package com.lagou.test;

import com.lagou.dao.IUserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class IPersistenceTest {

    @Test
    public void test() throws Exception {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用
        User user = new User();
        user.setId(6);
        user.setUsername("迪丽热巴666");
        user.setPassword("66668888");


//        List<User> all = sqlSession.selectList("com.lagou.dao.IUserDao.findAll");

       /* IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> all = userDao.findAll();

        for (User user1 : all) {
            System.out.println(user1);
        }*/


//        int row = sqlSession.insert("com.lagou.dao.IUserDao.addUser", user);
        int row = sqlSession.update("com.lagou.dao.IUserDao.updateUser", user);

        System.out.println("成功"+row);



    }



}
