package com.facade;

/**
 * @ClassName VCDFacade
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/11 22:04
 **/
public class VCDFacade {

    App app;

    public VCDFacade() {
        this.app = new VCDApp();
    }

    public void watchMovie(String type){
        app.on();
        app.init();
        app.set(type);
        app.run();
    }

    public void suspend(){
        app.suspend();
    }

    public void quit(){
        app.quit();
        app.off();
    }

}
