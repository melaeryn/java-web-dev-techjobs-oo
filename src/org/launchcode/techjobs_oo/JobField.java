package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int fieldId;
    private static int nextFieldId = 1;
    private String value;

    public JobField() {
        fieldId = nextFieldId;
        nextFieldId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return fieldId;
    }

    public String toString(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return fieldId == jobField.fieldId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldId);
    }
}
