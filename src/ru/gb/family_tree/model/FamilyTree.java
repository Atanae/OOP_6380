package ru.gb.family_tree.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class FamilyTree<E extends FamilyTreeElement> implements Serializable, Iterable<E> {
    private long idElement;
    private final List<E> elementList;

    public FamilyTree(List<E> elementList) {
        this.elementList = elementList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(E element) {
        if (element == null) return false;
        if (!elementList.contains(element)) {
            elementList.add(element);
            element.setId((idElement++));

            addToParents(element);
            addToChildren(element);

            return true;
        }
        return false;
    }

    private void addToChildren(E element) {
        for (FamilyTreeElement child : element.getChildren()) {
            child.addParents(element);
        }
    }

    private void addToParents(E element) {
        for (FamilyTreeElement parent : element.getParents()) {
            parent.addChild(element);
        }
    }

    public List<E> findByName(String name) {
        List<E> res = new ArrayList<>();
        for (E element : elementList) {
            if (element.getName().equals(name)) {
                res.add(element);
            }
        }
        return res;
    }

    public List<E> findByLastName(String lastName) {
        List<E> res = new ArrayList<>();
        for (E element : elementList) {
            if (element.getLastName().equals(lastName)) {
                res.add(element);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    private String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В нашей семье ");
        sb.append(idElement);
        sb.append(" членов: \n");
        for (E element : elementList) {
            sb.append(element);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return elementList.iterator();
    }

    public void sortByName() {
        Collections.sort(elementList, (h1, h2) -> h1.getName().compareTo(h2.getName()));
    }

    public void sortByBirthDate() {
        Collections.sort(elementList, (h1, h2) -> h1.getDob().compareTo(h2.getDob()));
    }
}

