package Challange;

import java.util.List;

public class ReadXmlSAX {
    
    public static void main(String[] args){
        
        DataRunner runner = new DataRunner();
        List<Data> lines = runner.parseUsers();
        System.out.print("[ ");
        lines.forEach(System.out::print);
        System.out.print("]");
    }
}

