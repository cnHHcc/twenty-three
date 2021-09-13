package com.cc.twentythree.start.memento;

import com.cc.twentythree.start.mediator.smarthouse.Mediator;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/13 14:00
 */
@Data
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add (Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento (int index){
        return mementoList.get(index);
    }
}
