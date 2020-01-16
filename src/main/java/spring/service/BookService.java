package spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.dao.BookDao;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author liubo
 * @date 2020-01-16 10:06
 * @description
 **/
@Slf4j
@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired
//    @Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;

    public void print(){
        log.info("===> bookDao:{}",bookDao);
    }
}
