package Class8;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class UnionFind {
    public static class Element<V>{
        public V value;

        public Element(V value){
            this.value=value;
        }
    }

    public static class UnionFindSet<V>{
        public HashMap<V,Element<V>> elementMap;
        public HashMap<Element<V>,Element<V>> fatherMap;
        public HashMap<Element<V>,Integer> sizeMap;

        public UnionFindSet(List<V> list){
            elementMap=new HashMap<>();
            fatherMap=new HashMap<>();
            sizeMap=new HashMap<>();
            for (V v : list) {
                Element<V> element=new Element<>(v);
                elementMap.put(v,element);
                fatherMap.put(element,element);
                sizeMap.put(element,1);
            }
        }

        public Element<V> findHead(Element<V> element){
            Stack<Element<V>> stack=new Stack<>();
            while(element!=fatherMap.get(element)){
                stack.push(element);
                element=fatherMap.get(element);
            }
            while(!stack.isEmpty()){
                fatherMap.put(stack.pop(),element);
            }
            return element;
        }

        public boolean isSameSet(V a,V b){
            if(elementMap.containsKey(a)&&elementMap.containsKey(b)){
                return findHead(elementMap.get(a))==findHead((elementMap.get(b)));
            }
            return false;
        }

        public void Union(V a,V b){
            if(elementMap.containsKey(a)&& elementMap.containsKey(b)){
                Element<V> aH=findHead(elementMap.get(a));
                Element<V> bH=findHead(elementMap.get(b));
                if(aH!=bH){
                    Element<V> Big=sizeMap.get(aH)>sizeMap.get(bH)?aH:bH;
                    Element<V> Small=Big==aH?bH:aH;
                    fatherMap.put(Small,Big);
                    sizeMap.put(Big,sizeMap.get(Big)+sizeMap.get(Small));
                    sizeMap.remove(Small);
                }
                
            }
        }


    }




}
