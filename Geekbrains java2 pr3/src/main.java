import java.util.*;

public class main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("car","cat","dog","car","map","key","tea","car","dog","pie","git","car","cat","key","dog"));
        for (int i=0; i<list.size(); i++){
            System.out.println(i+ " | " + list.get(i));
        }
        System.out.println("================");
        HashMap<String, Integer> repeat = new HashMap<>();
        for (String x : list) {
            repeat.put(x, repeat.getOrDefault(x,0)+1);
        }
        System.out.println(repeat);
        System.out.println("================");
        Set<String> set = new HashSet<>(list);
        List<String> print = new ArrayList<>(set);
        for (int i=0; i<print.size(); i++){
            System.out.println(i+ " | " + print.get(i));
        }

        ///////
        Phonebook book = new Phonebook();
        book.addContact("Artem", "4568978");
        book.addContact("Polina", "870977");
        book.addContact("Kola", "544456");
        book.addContact("Artem", "4532157");
        book.addContact("Sena", "877737");
        book.addContact("Sena", "877733");

        // ищем по имени
        book.findPrint("Artem");
        book.findPrint("Sena");
        book.findPrint("Kola");
    }
}

class Phonebook{
    HashMap<String,HashSet<String>>book;
    public Phonebook(){
        this.book = new HashMap<>();
    }
    public void addContact(String name, String number){
        HashSet<String> add = book.getOrDefault(name, new HashSet<>());
        add.add(number);
        book.put(name, add);
    }
    public void findPrint(String name){
        System.out.println("Contact: " + name+ "|  Phone: "+ book.getOrDefault(name, new HashSet<>()));
    }
}
