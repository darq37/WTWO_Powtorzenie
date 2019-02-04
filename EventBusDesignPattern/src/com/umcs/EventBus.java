package com.umcs;

import java.util.List;

public interface EventBus {
    void register(Subscribable subscribable);
    void dispatch(Event<?> event);
    List<Subscribable> getSubscribers();
}
