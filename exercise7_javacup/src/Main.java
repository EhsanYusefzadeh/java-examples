public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Araz", 19);
        Student s2 = new Student("Aysuda", 15);
        Student s3 = new Student("Aysuda", 16);
        Student s4 = new Student("Atila", 17);
        Student s5 = new Student("Ayda", 18);
        Student s6 = new Student("Tamay", 19);
        Student s7 = new Student("Aydin", 15);
        Student s8 = new Student("Aral", 21);
        Student s9 = new Student("onur", 20);

        //Student studentArray[] = new Student[10];

        Course sakhtafzar = new Course("sakhafzar");

        System.out.println(sakhtafzar.getName());

        System.out.println(sakhtafzar.register(s1));
        sakhtafzar.register(s2);
        sakhtafzar.register(s3);
        sakhtafzar.register(s4);
        sakhtafzar.register(s5);
        sakhtafzar.register(s6);
        sakhtafzar.register(s7);
        sakhtafzar.register(s8);
        sakhtafzar.register(s8);
        System.out.println(sakhtafzar.register(s9));


        System.out.println(sakhtafzar.getStudents()[0].getAge());
        System.out.println(sakhtafzar.getStudents()[1].getAge());
        System.out.println(sakhtafzar.getStudents()[2].getAge());
        System.out.println(sakhtafzar.getStudents()[3].getAge());
        System.out.println(sakhtafzar.getStudents()[4].getAge());
        System.out.println(sakhtafzar.getStudents()[5].getAge());
        System.out.println(sakhtafzar.getStudents()[6].getAge());
        System.out.println(sakhtafzar.getStudents()[7].getAge());
        System.out.println(sakhtafzar.getStudents()[8].getAge());
        System.out.println(sakhtafzar.getStudents()[9].getAge());

        System.out.println(sakhtafzar.getNumOfStudents());

        sakhtafzar.setName("Pokh");


        System.out.println(sakhtafzar.getNumOfStudents());


        System.out.println(sakhtafzar.getName());

    }
}
