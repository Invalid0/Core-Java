package Generic;

import java.util.List;

public class Box<T> {
    private T content;

    public void setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return this.content;
    }
    public void printContent(){
        System.out.println("Content: " + content);
    }

    // Example for Upper Bounding
    public <T extends Number> void printNum(T t){
        System.out.println("T =" + t);
    }

    // Example for lower Boundig
    public void printListOfNumber(List<? super Number> list){
        for (Object element : list) {
            System.out.println("List = "+ element);
        }
    }

    
    
}



