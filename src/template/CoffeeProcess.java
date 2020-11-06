package template;

import java.util.Scanner;

public class CoffeeProcess extends Process{
    @Override
    protected void drink() {
        System.out.println("drink coffee");
    }

    @Override
    protected void add() {
        System.out.println("add sugar");
    }

    @Override
    protected boolean verify() {
        System.out.println("please input: y/n");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            String next = scanner.next();
            return "y".equals(next);
        }
        return false;
    }
}
