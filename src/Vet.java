import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet (String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal animal){
        String currName = animal.getName();
        boolean isClientAlready = false;
        if (clients.contains(animal)){
            isClientAlready = true;
        }
        if (isClientAlready){
            System.out.println(currName + " is already a client of " + name);
        }
        else {
            clients.add(animal);
            System.out.println("Welcome to " + name + "'s office, " + currName);
        }
    }
}
