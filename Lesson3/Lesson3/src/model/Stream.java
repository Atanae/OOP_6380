package model;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Iterator<StudentGroup> {

    private List<StudentGroup> groups;
    private int index = 0;

    public Stream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(index++);
    }

    @Override
    public void remove() {
        if (index > 0)
            groups.remove(--index);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Потоки: " +
                "groups=" + groups;
    }
}
