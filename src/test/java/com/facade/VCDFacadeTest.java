package com.facade;

import org.junit.Test;

public class VCDFacadeTest {



    @Test
    public void test(){

        VCDFacade vcdFacade = new VCDFacade();

        vcdFacade.watchMovie("杨千嬅专辑光碟");

        vcdFacade.suspend();

        vcdFacade.quit();
    }
}