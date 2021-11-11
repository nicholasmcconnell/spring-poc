package com.nickmcconnell.springpoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("snapDragon") //Specifies which class implementing the interface we want
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa cor, 4gb Ram, 12mp Camera");
        cpu.process();
    }
}
