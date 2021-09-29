package lyssechko.com;

import java.util.List;

public class Teachers implements Observer{
    String name;

    public Teachers(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear\n" + name + "\n We have some vacancies to you:\n" + " " + vacancies);
    }
}
