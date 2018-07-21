import java.util.*;

class Directory {
    private HashMap<String, ArrayList<String>> data = new HashMap<>();

    Directory add(String name, String number) {
        if (data.containsKey(name)) {
            data.get(name).add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);

            data.put(name, numbers);
        }

        return this;
    }

    ArrayList<String> get(String name) {
        return data.get(name);
    }

    void getPrintln(String name) {
        for (String data : data.get(name)) {
            System.out.println(data);
        }
    }
}
