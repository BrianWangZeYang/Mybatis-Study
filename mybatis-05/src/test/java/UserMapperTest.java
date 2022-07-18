import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/16 23:49
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }

//        User userByID = mapper.getUserByID(1);
//        System.out.println(userByID);

//        mapper.addUser(new User(9, "CRUD", "888"));

//        mapper.updateUser(new User(8,"CRUD2","999"));

        mapper.deleteUser(9);
        sqlSession.close();
    }
}
