
public class Rabbit implements Prey {

    @Override
    public void flee(){
        System.out.println("The Rabbit has flee");
    }

    public void fight(){
        System.out.println("The Rabbit is fighting");
    }
}