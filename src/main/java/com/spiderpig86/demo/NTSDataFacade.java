package com.spiderpig86.demo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class NTSDataFacade {

    private int counter;

    public int increment() {
        return ++this.counter;
    }
}

