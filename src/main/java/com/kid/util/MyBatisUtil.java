package com.kid.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis 的工具类，可以用于获取和释放 SqlSession 对象
 */
public class MyBatisUtil {

    String resource = "mybatis-config.xml";
    InputStream inputStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过 SqlSessionFactory 类可以获取 SqlSession 的对象
     * @return SqlSession 的对象
     */
    public SqlSession getSqlSession() {
        return sqlSession = sqlSessionFactory.openSession(true);
    }

    /**
     * 关闭 SqlSession 对象
     */
    public void closeSession() {
        sqlSession.close();
    }

}