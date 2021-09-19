package test;

import com.laoxu.dao.AreasMapper;
import com.laoxu.dao.RentMapper;
import com.laoxu.dao.StreetsMapper;
import com.laoxu.dao.UsersMapper;
import com.laoxu.pojo.Rent;
import com.laoxu.pojo.RentExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//值是String数组，可以写多个xml配置文件
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class DaoTest {

    @Autowired
    RentMapper rentMapper;

    @Test
    public void run1(){
        RentExample rentExample = new RentExample();

        RentExample.Criteria criteria = rentExample.createCriteria();

        criteria.andIdBetween(1,2);

        List<Rent> rents = rentMapper.selectByExample(rentExample);

        System.out.println(rents.size());
    }
}
