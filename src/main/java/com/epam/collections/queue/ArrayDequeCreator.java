package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> commonQueue = new ArrayDeque<>();
        for (int i = 0; i < 2; i++) {
            commonQueue.add(firstQueue.poll());
        }
        for (int j = 0; j < 2; j++) {
            commonQueue.add(secondQueue.poll());
        }
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(commonQueue.poll());
            for (int i = 0; i < 2; i++) {
                if (!firstQueue.isEmpty()) {
                    commonQueue.add(firstQueue.poll());
                }
            }
            secondQueue.add(commonQueue.poll());
            for (int j = 0; j < 2; j++) {
                if (!secondQueue.isEmpty()) {
                    commonQueue.add(secondQueue.poll());
                }
            }
        }
        return commonQueue;
    }
}