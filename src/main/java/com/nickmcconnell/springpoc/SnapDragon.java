package com.nickmcconnell.springpoc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("World Best CPU");
    }
}
