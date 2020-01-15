package spring.regist;

import org.springframework.beans.factory.FactoryBean;
import spring.bean.Color;

/**
 * @author liubo
 * @date 2020-01-14 17:19
 * @description
 **/
public class MyFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
