package CustomHashmap;

/**
 * Created by Sneha on 01-08-2017.
 */
public class MapNode<K,V> {
    K key ;
    V value ;
    MapNode next ;
    MapNode(K key , V value){
        this.key = key ;
        this.value = value ;
    }
}
