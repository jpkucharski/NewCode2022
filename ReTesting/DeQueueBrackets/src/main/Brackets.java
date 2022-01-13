package main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Brackets {

    public boolean isClosed(String string) {
        if (string == null) {
            throw new IllegalArgumentException("try to put something inside");
        }
        if (string.length() > 1 && string.length() % 2 == 0) {
            List<Character> list = string.chars().mapToObj(ch -> (char) ch).toList();
            Deque<Character> dequeue = new LinkedList<>(list);
            int halfOfDeque = dequeue.size() / 2;
            for (int i = 0; i <= halfOfDeque; i++) {
                if (dequeue.peekLast() != null) {
                    if (dequeue.pollFirst() == '(') {
                        if (dequeue.peekLast() != null) {
                            if (dequeue.pollLast() != ')') {
                                return false;
                            }
                        }
                    }
                }
                if (dequeue.size() == 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}