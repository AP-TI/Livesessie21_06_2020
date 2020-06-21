package be.apti.Livesessie21_06_2020;

import be.apti.Livesessie21_06_2020.deel2.oefening7.NoResultsException;
import be.apti.Livesessie21_06_2020.oefening2.KeyValues;
import be.apti.Livesessie21_06_2020.oefening3.Boek;
import be.apti.Livesessie21_06_2020.oefening3.Schrijver;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static List<String> hoofdrolspelers = new LinkedList<>();

    public static void main(String[] args) {
        // oefening1();
        // oefening2();
        // oefening3();
        // oefening5();
        // oefening6();
        deel2();
    }

    public static void oefening1() {
        IntStream.range(0, 20).forEach(i -> hoofdrolspelers.add("Acteur" + i));
        hoofdrolspelers.forEach(System.out::println);
        hoofdrolspelers.remove(12);
        hoofdrolspelers.forEach(System.out::println);
    }

    public static void oefening2() {
        KeyValues<String, Integer> keyValues = new KeyValues<>();
        keyValues.addPair("key", 3);
        System.out.println(keyValues.getValue("key"));
    }

    public static void oefening3() {
        Boek boek = new Boek("Titel", "Schrijver", 2020, false);
        Boek boek1 = new Boek("atitel1", "Schrijver", 2020, false);
        Schrijver schrijver = new Schrijver("Schrijver");
        schrijver.addBoek(boek);
        schrijver.addBoek(boek1);
        System.out.println(schrijver.boekenToString());
    }

    public static void oefening5() {
        List<String> names = new ArrayList<>();
        List<String> namesToRemove = new LinkedList<>();

        names.add("Abu");
        names.add("Bob");
        names.add("Bea");

        Iterator<String> nameIterator = names.iterator();

        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            if (name.equals("Bob")) {
                namesToRemove.add(name);
            }
        }
        names.removeAll(namesToRemove);

        nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            System.out.println(name);
        }
    }

    public static void oefening6() {
        Set<String> set = new HashSet();
        set.add("test");
        set.add("test");
        set.add("test2");
        set.add("test1");
        set.add("test");
        set.add("test");
        set.add("test2");
        set.add("test1");
        set.add("test");
        set.add("test");
        set.add("test2");
        set.add("test1");
        set.forEach(System.out::println);
    }

    public static void dia22Deel2() {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test2");
        list.add("test1");
        list.add("test");
        list.add("test");
        list.add("test2");
        list.add("test1");
        list.add("test");
        list.add("test");
        list.add("test2");
        list.add("test1");

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }

    public static void deel2() {
        // dia22Deel2();
        // oefening1Deel2();
        oefening7Deel2();
    }

    public static void oefening1Deel2() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }

    public static void oefening7Deel2() {
        try {
            FileInputStream fileInputStream = new FileInputStream("four-letter-words.txt");
            Scanner scanner = new Scanner(fileInputStream);
            List<String> words = new ArrayList<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            if (words.size() == 0) throw new NoResultsException();
            FileWriter fileWriter = new FileWriter("four-letter-words-filtered.txt");
            words.stream()
                    // .filter(word -> word.toLowerCase().contains("a"))
                    .filter(word -> isPalindroom(word))
                    .forEach(str -> {
                try {
                    fileWriter.write(str + "\n");
                    System.out.println(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.close();
            // words.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            System.out.println("Bestand niet gevonden! " + ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoResultsException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPalindroom(String word){
        char[] letters = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(letters[i] != letters[word.length() - 1 - i]) return false;
        }
        return true;
    }
}
