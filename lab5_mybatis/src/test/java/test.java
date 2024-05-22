import com.bupt.enity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class test {
    private static final Logger logger = LoggerFactory.getLogger(test.class);

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testInsert() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
       sqlSession.insert("test.addUser", user);
        sqlSession.close();
    }
//    @Test
//    public void testDelete() {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        int userId = 1;
//        sqlSession.delete("test.deleteUser", userId);
//        sqlSession.close();
//    }
//    @Test
//    public void testUpdate() {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User userUpdate = new User();
//        userUpdate.setId(2);
//        userUpdate.setName("lisi");
//        userUpdate.setPassword("654321");
//        sqlSession.update("test.updateUser", userUpdate);
//        sqlSession.close();
//    }
//    @Test
//    public void testSelect() {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        int userId = 2;
//        User user = sqlSession.selectOne("test.getUserById", userId);
//        System.out.println(user);
//        sqlSession.close();
//    }

}