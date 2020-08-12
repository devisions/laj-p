package com.lightbend.training.coffeehouse;

import akka.actor.AbstractLoggingActor;
import akka.japi.pf.ReceiveBuilder;

public class CoffeeHouse extends AbstractLoggingActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().matchAny(msg -> log().info("Coffee Brewing")).build();
    }

}
