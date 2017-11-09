import com.wsf.mycat.Application;
import com.wsf.mycat.entity.model.User;
import com.wsf.mycat.entity.model.UserOrder;
import com.wsf.mycat.mapper.UserMapper;
import com.wsf.mycat.mapper.UserOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wsf
 * @since 2017/11/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@Transactional
public class MyTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Test
    public void insertTest(){
//        User user = new User();
//        user.setName("小五");
//        user.setSex("女");
//        user.setAge(25);
//        int i = this.userMapper.insert(user);

        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(928072310500495360L);
        userOrder.setOrderNo("123456333");
        int i = this.userOrderMapper.insert(userOrder);

        userOrder = new UserOrder();
        userOrder.setUserId(928072310500495360L);
        userOrder.setOrderNo("abcdefccc");
        i = this.userOrderMapper.insert(userOrder);

        int j = 1/0;
    }
}
