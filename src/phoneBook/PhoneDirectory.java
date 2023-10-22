package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Record> records;

    public void TelephoneDirectory() {
        this.records = new ArrayList<>();
    }

    public void add(Record record) {
        this.records.add(record);
    }

    public Record find(String name) {
        for (Record record : this.records) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> results = new ArrayList<>();
        for (Record record : this.records) {
            if (record.getName().equalsIgnoreCase(name)) {
                results.add(record);
            }
        }
        return results;
    }
}
