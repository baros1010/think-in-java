package unit17;

import java.util.LinkedHashMap;

import unit15.Generator;

public class MapData<K, V> extends LinkedHashMap<K, V> {
	public MapData(Generator<pairs<K, V>> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			pairs<K, V> p = gen.next();
			put(p.key, p.value);
		}

	}

	public MapData(Generator<K> genk, Generator<V> genV, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genk.next(), genV.next());
		}
	}

	public MapData(Generator<K> GenK, V value, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(GenK.next(), value);
		}
	}

	public MapData(Iterable<K>GenK,Generator<V> genV){
		for(K key:GenK){
		put(key,genV.next());	
		}
	}

	public MapData(Iterable<K>GenK,V value){
		for(K key:GenK){
			put(key,value);
		}
	}
}
