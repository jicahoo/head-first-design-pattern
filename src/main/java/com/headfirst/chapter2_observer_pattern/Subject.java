package com.headfirst.chapter2_observer_pattern;

/**
 * When there is state change of Subject, Subject have to notify the registered
 * Observers. So Subject have to know all Observers. Subject has to maintain a collection
 * of Observers: add/remove Observer.  In addition, the main responsibility is
 * to notify the Observer, so it needs a notifyObservers methods. In a word,
 * all things are for interaction with Observer. So Subject has below responsibilities:
 *
 *  1. notifyObservers
 *  2. registerObserver
 *  3. removeObserver
 *
 * So you will see all methods in Subject/Observer are mandatory for the interactions between them.
 * Any of them can not be removed. And no need more other methods to support the interaction between them.
 * Exact relationship defined by these abstract methods/interfaces.
 *
 * When you design OO program, key point is to design the relationship/interaction between TWO objects.
 * Created by zhangj52 on 1/21/2017.
 */
public interface Subject {
    void notifyObservers();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
