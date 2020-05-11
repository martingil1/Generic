package Class;

import java.util.LinkedList;

public class Slack <T>{

    LinkedList <T> list;

    public Slack() {
        list = new LinkedList<>();
    }

    public void setList(LinkedList<T> list){
        this.list = list;
    }

    public LinkedList<T> getList (){
        return list;
    }

    public void push (T object){
        list.add(object);
    }

    public T pop (){
        return list.getFirst();
    }

    public Integer size(){
        return list.size();
    }

    public T getTop(){
        return list.getLast();
    }

    public Integer getMax(){
        Integer higher = (Integer)list.getFirst();;
        for (Integer i = 1 ;i<list.size();i++) {
            if(((Integer)list.get(i)) > (higher)){
                higher = (Integer)list.get(i);
            }
        }
        return higher;
    }

    public Integer getMin(){
        Integer smaller = (Integer)list.getFirst();;
        for (Integer i = 1 ;i<list.size();i++) {
            if((Integer)list.get(i) < smaller){
                smaller = (Integer)list.get(i);
            }
        }
        return smaller;
    }

    public String toString(){
        return " "+list;
    }

}
