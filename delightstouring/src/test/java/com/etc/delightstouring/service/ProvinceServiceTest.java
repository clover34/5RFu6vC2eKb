package com.etc.delightstouring.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ProvinceService
 * @Description TODO
 * @Author Administrator
 * @Date 20/10/26 19:14
 * @Version 1.0
 **/
public class ProvinceServiceTest {
    @Test
    public void testfindAll(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProvinceService provinceService = context.getBean("provinceServiceImpl", ProvinceService.class);
        System.out.println("provinceService.findAllProvince() = " + provinceService.findAllProvince());
    }
}
