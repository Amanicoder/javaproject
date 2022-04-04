import org.humanbooster.myproject.carproject.Parking;
import org.humanbooster.myproject.model.*;
import org.humanbooster.myproject.ordermanagement.Dessert;
import org.humanbooster.myproject.ordermanagement.Drink;
import org.humanbooster.myproject.ordermanagement.MainCourse;
import org.humanbooster.myproject.ordermanagement.Order;
import org.humanbooster.myproject.singleton.Computer;
import org.humanbooster.myproject.singleton.Printer;
import org.humanbooster.myproject.singleton.Repartitor;

import java.util.*;

public class Entry {
    public static void main(String[] args) {
        exo11();
    }

    public  static void exo1() {
        Bike b1 = new Bike("commencal",26,"red");


        Bike b2 = new Bike("PEUGEOT","GREEN");

        b1.display();
        b2.display();

    }
    public  static void exo2() {
        Person p = new Person("Thomas", 36);
        Person p2 = new Person("Jeanjean", 20);
        Person p3 = new Person("JeanLucMelanchon");

        p.disp();
        p2.disp();
        p3.disp();

        System.out.println("Bonjour je m'appelle "+ p.name +" et j'ai "+p.age +" ans");
        System.out.println(p2);

        if (p.age== 20){
            p.addToAge();
            System.out.println("Bonjour je m'appelle "+ p.name +" et j'ai "+p.age +" ans");
        }
        System.out.println("Status de "+p.name + " : "+ p.getStatus());
    }

    public static void exo3(){
        Orc orc1 = new Orc("Grugct",50, 5);
        Orc orc2 = new Orc("JeanJacque",60, 10);
        Orc orc3 = new Orc(50, 5);

        System.out.println(orc1);
        System.out.println(orc2);
        System.out.println(orc3);

        orc2.attack(orc1);
        orc1.attack(orc2);

        System.out.println(orc1.toString());
        System.out.println(orc2.toString());

    }
    public static void exo4(){
        City c1= new City("Tunis", "Tunisia",11.000,true);
        City c2= new City("Alger", "Algeria",50.000,true);
        City c3= new City("Mtp", "France",4.000,false);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println(c1.makeCompare(c2));
        System.out.println(c1.makeCompare(c3));
        System.out.println(c2.makeCompare(c3));
    }

    public static void exo5(){

        ArrayList<Orc> list = new ArrayList<>();

        System.out.println("Bonjour");
        System.out.println("Que voulez vous faire?");
        System.out.println("1: Ajouter un Orc");
        System.out.println("2: Supprimer un Orc");
        System.out.println("3: Total forces");
        System.out.println("4: Lister les orcs");
        System.out.println("5: Quitter");

        //ask();

        Scanner sc = new Scanner(System.in);

        int answer = sc.nextInt();

        list.add(new Orc("orc1", 40, 50));
        list.add(new Orc("orc2", 40, 50));

        if (answer> 0 && answer<6){
            switch (answer){

                case 1:
                    System.out.println("Créer votre orc");
                    System.out.println("Nom ?");
                    String a = sc.nextLine();
                    String name = sc.nextLine();

                //setName(name);
                System.out.println("Force ?");
                int force = Integer.parseInt(sc.nextLine());
                //getForce(force);
                System.out.println("Health?");
                int health = Integer.parseInt(sc.nextLine());
                //setHealth(health);
                list.add(new Orc(name, health, force));
                    System.out.println(list);
                System.out.println("Saisie Ok");
                break;

                case 2:

                    System.out.println("Quel Orc voulez vous supprimer (Tapper son nom)");
                    System.out.println(list);
                    String b = sc.nextLine();
                    String nameSup = sc.nextLine();
                    Iterator it = list.iterator();
                    while (it.hasNext()){
                        Orc o = (Orc) it.next();
                        if(o.getName().equalsIgnoreCase(nameSup)){
                            it.remove();
                            System.out.println(nameSup+" supprimé, il reste "+list.size());
                            System.out.println(list);
                            break;
                        }
                    }


                case 3:
                    System.out.println("3: Total les forces");
                    int total = 0;
                    for (Orc orc : list){
                        total += orc.getForce();
                        }
                    System.out.println(total);
                    break;
                case 4:
                    System.out.println("4: Lister les orcs");
                for (Orc orc :list){
                    //System.out.println(orc);
                    System.out.printf("Name : %s, Health: %s,Force: %s \n", orc.getName(), orc.getHealth(),orc.getForce());

                }
                    break;

                case 5:
                    System.out.println("Au revoir");
                    break;
            }
        }
    }

    public static void exo6(){
        /*System.out.println(o2.equals(o3));

            HashSet<Car> monSet= new HashSet<>();
            monSet.add(new Car("a","z","bmw"));
            monSet.add(o2);
            monSet.add(o3);

        System.out.println(monSet.size());
        for (Car car: monSet){
            System.out.println(car);
        }*/
        }
    public static void exo7(){
        
        HashMap<Orc,ArrayList<Orc>> equipes = new HashMap<>();
        Orc c1 = new Orc("c1", 40, 50);
        Orc c2 = new Orc("c2", 30, 40);

        ArrayList<Orc> team1 = new ArrayList<>();
        ArrayList<Orc> team2 = new ArrayList<>();

        team1.add(new Orc("a1", 40, 50));
        team1.add(new Orc("a2", 30, 40));
        team1.add(new Orc("a3", 30, 40));

        team2.add(new Orc("b1", 50, 40));
        team2.add(new Orc("b2", 20, 80));
        team2.add(new Orc("b3", 50, 40));
        equipes.put(c1,team1);
        equipes.put(c2,team2);
        
        int teamCount = 0;

        for (Orc orc : equipes.keySet()){
            System.out.println("Equipe "+ ++teamCount);
            System.out.println("\t Chef "+ orc.getName());

            ArrayList<Orc> equipe = equipes.get(orc);
            System.out.println("\t Membres :");
            for (Orc orcTeam : equipe){
                System.out.println("\t\t" + orcTeam.getName());
            }
        }
        /*System.out.println("--------------");
        Collection values = membres.values();
        for (Object value : values){
            System.out.println(((Orc)value).getHealth());
            System.out.println(((Orc)value).getForce());*/
            
        }
        /* public static void exo8(){
            List<Computer> list = new ArrayList<>();
            list.add(new Computer("HP", 4));
            list.add(new Computer("XM", 2));
            list.add(new Computer("HP", 8));

            List<Integer> liste = list.stream()
                    .filter(v -> v.getModele() == "HP")
                    .map(v -> v.getFrequency() * 10)
                    .collect(Collectors.toList());

            System.out.println(liste);

            for(Integer computer: liste){
                System.out.println(computer);
            }
        }

         */
    public static void exo9(){
        Car c1= new Car("red", "VW touareg","VW");
        Car c2= new Car("green", "Mini Cooper","Mini");
        Car c3= new Car("black", "Min","A");

        Parking p1 = new Parking("park1","mtp","boulevard strasbourg");


        //String abc = compare(c1, c2);

    }

    public static void exo10(){

        Printer p1 = new Printer(1, "Canon");
        Printer p2 = new Printer(2,"Epson");

        Repartitor.getInstance().getPrinters().add(p1);
        Repartitor.getInstance().getPrinters().add(p2);

        Computer c1 = new Computer("HP");
        Computer c2 = new Computer("Apple");
        Computer c3 = new Computer("Lenovo");
        Computer c4 = new Computer("Dell");
        Computer c5 = new Computer("Sony");
    }
    public static void exo11(){
        Order o = new Order("thop90", Drink.BEER, MainCourse.BEEF, Dessert.ICECREAM);
        Order o2 = new Order("thop99", Drink.COKE, MainCourse.CHICKEN, Dessert.CHOCOSNACK);
        System.out.println("Prix total de la commande :"+ o.getTotalPrice());
        System.out.println("Prix total de la commande :"+ o2.getTotalPrice());
    }
    }


