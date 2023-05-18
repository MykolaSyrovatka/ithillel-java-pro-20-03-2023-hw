package ua.ithilell.hw12.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TelephoneDirectory {

    private List <Record> phoneList;

    public TelephoneDirectory() {
        this.phoneList = new ArrayList<>();
    }

    public boolean add(Record record){
        return phoneList.add(record);
    }

    public Record find(String name){
        Record record = null;
        Iterator<Record> iterator = phoneList.iterator();
        while (iterator.hasNext()){
            record = iterator.next();
            if (record.getName().equals(name)){
                break;
            } else {
                record = null;
            }
        }
        return record;
    }

    public List<Record> findAll(String name){
        Record record = null;
        List<Record> recordList = new ArrayList<>();
        Iterator<Record> iterator = phoneList.iterator();
        while (iterator.hasNext()){
            record = iterator.next();
            if (record.getName().equals(name)){
                recordList.add(record);
            }
        }
        return recordList.size()>0?recordList:null;
    }




}
