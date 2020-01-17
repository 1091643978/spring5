package spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author liubo
 * @date 2020-01-17 16:24
 * @description
 **/

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert() {
        String sql = "insert into c3p0TestTable(a) values(?)";
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        System.out.println("c=" + c);
        jdbcTemplate.update(sql, String.valueOf(c));

    }
}
