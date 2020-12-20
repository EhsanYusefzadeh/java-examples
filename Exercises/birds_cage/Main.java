package ir.javacup.contest.zoo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cage c1 = new Cage(12, "Tutia");
        Cage c2 = new Cage(13, "Kalagha");

        Bird b1 = new Bird();
        Bird b2 = new Bird();
        Bird b3 = new Bird();
        Bird b4 = new Bird();
        b1.setName("akbar");
        b1.setColor("kara");
        b2.setName("ehsan");
        b2.setColor("mavi");
        b3.setName("mehdi");
        b3.setColor("kirmizi");
        b4.setName("ali");
        b4.setColor("sari");

        Bird[] birds1 = new Bird[2];
        Bird[] birds2 = new Bird[2];

        birds1[0] = b1;
        birds1[1] = null;

        birds2[0] = b3;
        birds2[1] = b3;

        c1.setBirds(birds1);
        c1.setBirds(birds2);

        CageCopier copy = new CageCopier();

        copy.copy(c1, c2);

        if(c1.getName() == c2.getName())
            System.out.println("INCORRECT");

        if(c1.equals(c2))
            System.out.println("CORRECT");

        System.out.println(c1);

        System.out.println(c2);


        System.out.println(c2.getBirds()[1]);


    }
}
