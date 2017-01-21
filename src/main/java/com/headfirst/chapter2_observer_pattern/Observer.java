package com.headfirst.chapter2_observer_pattern;

/**
 * Observer is oriented for Subject. So it only has to provide the interface
 * which is need by Subject. Subject only need a way to update/notify the Observer.
 * So in Observer, there is only method for update the Observer state.
 * Created by zhangj52 on 1/21/2017.
 */
public interface Observer {
    /**
     * Not view it as a method. View it a message that will send to me.
     * (SmallTalk)
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
