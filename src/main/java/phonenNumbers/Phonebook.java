package phonenNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {



        String[] phonebook = {
                "Тиханович 2592210",
                "Половцев 3623662",
                "Рагунова 1288388",
                "Кузькин 23923338",
                "Васечкин 23232467",
                "Тиханович 23444747",
                "Иванов 394834934",
                "Кузькин 23435535",
                "Кропоткин 2318231238",
                "Рагунова 2324224255",
                "Криворучка 3242325235",
                "Иванов 232232323"

        };
        processPhone(phonebook);
    }
    static void processPhone(String[] phonebook) {
        HashMap<Integer, ArrayList<Book>> notebook = new HashMap<>();
        for (String s : phonebook) {
            String[] parts = s.split(" ");
            int a = Integer.parseInt(parts[1]);


            if (notebook.containsKey(a)) {
                notebook.get(a).add( new Book(parts[0],a));


            } else {
                ArrayList<Book> bbk = new ArrayList<>();
                bbk.add(new Book(parts[0],a));
                notebook.put(a,bbk);
            }


            }
        TreeMap<Integer,ArrayList<Book>> sortedPhonebook = new TreeMap<>(notebook);
        System.out.println(" Телефонный спарвочник");
        for (Map.Entry<Integer,ArrayList<Book>> item :sortedPhonebook.entrySet()) {
            System.out.println();
            

        for ( Book book: item.getValue() ) {
            System.out.printf("%s %s", book.getNumber(),book.getSurname());
        }
            
        }
        }
    }



class Book {
    String surname;
    int number;

    public Book(String surname, int number) {
        this.surname = surname;
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

