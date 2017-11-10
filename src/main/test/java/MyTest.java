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

/**
 * @author wsf
 * @since 2017/11/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Test
    public void insertTest(){
        try {
            this.userMapper.begin();

            User user = new User();
            user.setName("小五4");
            user.setSex("女");
            user.setAge(25);
            for (int i = 0; i < 5; i++) {
                this.userMapper.insert(user);
            }


            UserOrder userOrder = new UserOrder();
            userOrder.setUserId(928906953642610688L);
            userOrder.setOrderNo("aaa");
            this.userOrderMapper.insert(userOrder);

            userOrder = new UserOrder();
            userOrder.setUserId(928906954368225280L);
            userOrder.setOrderNo("bbb");
            this.userOrderMapper.insert(userOrder);

            userOrder = new UserOrder();
            userOrder.setUserId(928906954410168320L);
            userOrder.setOrderNo("ccc");
            this.userOrderMapper.insert(userOrder);

            int j = 1/0;
            this.userMapper.commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.userMapper.rollback();
        }
    }
}
