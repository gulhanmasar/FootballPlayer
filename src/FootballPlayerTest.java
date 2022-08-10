public class FootballPlayerTest {
    public static void main(String[] args){

        FootballPlayer alex = new FootballPlayer();

        alex.no = 10;
        alex.name = "Alex de Souza ";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;

        alex.play(90);
        alex.score(2);





        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals );
        System.out.println("Alex played totally: " + alex.minutes + "minutes so far." );

        alex.play(60);


        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals );
        System.out.println("Alex played totally: " + alex.minutes + "minutes so far." );

System.out.println("***********");
        FootballPlayer oguzhan = new FootballPlayer();
        oguzhan.no = 10;
        oguzhan.name = "Oguzhan ";
        oguzhan.minutes = 0;
        oguzhan.inPlay = true;
        oguzhan.numberOfGoals = 0;

        oguzhan.play(90);
        oguzhan.score(3);



        System.out.println("Number of goals Oguzhan scored: " + oguzhan.numberOfGoals );
        System.out.println("Oguzhan played totally: " + oguzhan.minutes + "minutes so far." );


    }

}
