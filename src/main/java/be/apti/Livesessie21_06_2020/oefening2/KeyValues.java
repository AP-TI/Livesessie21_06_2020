package be.apti.Livesessie21_06_2020.oefening2;

import java.util.LinkedList;
import java.util.List;

public class KeyValues<K, V> {
    private List<K> keys;
    private List<V> values;
    public KeyValues() {
        this.keys = new LinkedList<>();
        this.values = new LinkedList<>();
    }

    public void addPair(K key, V value){
        keys.add(key);
        values.add(value);
    }

    public V getValue(K key){
        int index = keys.indexOf(key);
        return values.get(index);
    }

/*    @Override
    public String toString() {

    }*/
}
