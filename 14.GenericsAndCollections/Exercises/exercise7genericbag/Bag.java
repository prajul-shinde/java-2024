package Exercises.exercise7genericbag;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> content;

    public Bag() {
        this.content = new ArrayList<>();
    }

    public void addItem(T item) {
        content.add(item);
    }

    public void removeItem(T item) {
        content.remove(item);
    }

    public List<T> getItems() {
        return content;
    }
}
