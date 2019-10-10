import com.cicleClass.*;

class First {

    public static void main(String[] args) {
        CicleBike cicle1 = new CicleBike();
        cicle1.name("Cona");
        cicle1.speed(60);
        cicle1.wheels(2);

        System.out.println("---------------------------");

        CicleBike cicle2 = new CicleBike();
        cicle2.name("Bona");
        cicle2.speed(68);
        cicle2.wheels(2);

        System.out.println("---------------------------");

        FourCycle fourCycle = new FourCycle();
        fourCycle.name("Камма");
        fourCycle.speed(100);
        fourCycle.wheels(4);
        fourCycle.seats(2);

        int q = 0;
        while (q <= 10){
           System.out.print(q+" ");
           ++q;
        }



    }

}        