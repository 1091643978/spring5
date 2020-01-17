package spring.profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;
import spring.bean.Yellow;

import javax.sql.DataSource;

import java.beans.PropertyVetoException;

/**
 * @author liubo
 * @date 2020-01-16 15:03
 * @description
 **/
//@Profile("test")
@PropertySource("classpath:/db.properties")
@Slf4j
@Configuration
public class ProfileConfig implements EmbeddedValueResolverAware {

    private  StringValueResolver resolver;

    @Value("${db.user}")
    private String user;

//    @Value("${db.password}")
//    private String password;

    @Value("${db.url}")
    private String url;

    @Value("${db.driverClass}")
    private String driverClass;

    @Profile("test")
//    @Profile("default")
    @Bean("testDB")
    public DataSource dataSourceTest(@Value("${db.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Profile("dev")
    @Bean("devDB")
    public DataSource dataSourceDev() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("hqzc_test");
        dataSource.setPassword("hqzc_test@com!");
        dataSource.setJdbcUrl("jdbc:mysql://10.6.202.101:3306/rentcar?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&connectTimeout=1000&socketTimeout=15000");
        dataSource.setDriverClass(resolver.resolveStringValue("${db.driverClass}"));
        return dataSource;
    }

    @Profile("prod")
    @Bean("prodDB")
    public DataSource dataSourceProd() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("hqzc_test");
        dataSource.setPassword("hqzc_test@com!");
        dataSource.setJdbcUrl("jdbc:mysql://10.6.202.101:3306/rentcar?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&connectTimeout=1000&socketTimeout=15000");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
    }


//    @Profile("test")
    @Bean
    public Yellow yellow(){
        return new Yellow();
    }
}
