package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String,String> data;
    private int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<>();
        dataCount = 0;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (!isContactPresent(name)) {
            PhoneEntry newEntry = new PhoneEntry(name, number);
            data.put(newEntry.getName(), newEntry.getNumber());
            dataCount++;
            System.out.println(name + " is added to your phone directory!");
        } else {
            System.out.println(name + " is already on phone directory");
        }
    }

    private boolean isContactPresent(String name) {
        return data.containsKey(name);
    }

    public void getNumber(String name) {
        if (data.containsKey(name)) {
            System.out.println("Phone number of " + name + " = " + data.get(name));
        } else {
            System.out.println("Name of this contact does not exist!");
        }
    }

    @Override
    public String toString() {
        return "contacts: " + data + "\n" +
                "total contacts: " + dataCount;
    }
}
