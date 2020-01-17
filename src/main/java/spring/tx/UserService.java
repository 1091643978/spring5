package spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liubo
 * @date 2020-01-17 16:24
 * @description
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    @Transactional
    public void insertUser() {

        userDao.insert();
        System.out.println("手稿完成");
        int i = 10 / 0;
    }
}
