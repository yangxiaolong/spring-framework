package org.springframework.test.recycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.recycle.calc.Calculate;
import org.springframework.test.recycle.calc.DoCalculate;
import org.springframework.test.recycle.config.AopConfig;

/**
 * Created by yangxiaolong
 */
public class RecycleTest {

    @org.junit.Test
    public void calc() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);
        Calculate beanA = ac.getBean(Calculate.class);
        DoCalculate beanB = ac.getBean(DoCalculate.class);
        int divA = beanA.div(3, 1);
        int divB = beanB.doDiv(4, 2);
        System.out.println(divA);
        System.out.println(divB);
    }

}
