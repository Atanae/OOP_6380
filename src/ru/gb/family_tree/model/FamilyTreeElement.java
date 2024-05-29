package ru.gb.family_tree.model;

import java.time.LocalDate;
import java.util.List;

public interface FamilyTreeElement {

    String getName();
    String getLastName();
    LocalDate getDob();


    void setId(long l);

    List<? extends FamilyTreeElement> getChildren();
    List<? extends FamilyTreeElement> getParents();

    void addChild(FamilyTreeElement child);
    void addParents(FamilyTreeElement parent);
}
