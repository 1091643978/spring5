package spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author liubo
 * @date 2020-01-16 10:06
 * @description
 **/
@Repository
public class BookDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
