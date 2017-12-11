import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Long> ids = new ArrayList<Long>();
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<Integer> ages = new ArrayList<Integer>();
    static ArrayList<Character> sexs = new ArrayList<Character>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char answer = 'y';
        int choice;
        long tempID;
        int tempAge;
        String tempName;
        char tempChar;

        while(answer == 'y' || answer == 'Y'){
            System.out.println("Library Management Program Directory. Choose the operation: ");
            System.out.println("1. Create a New Member ");
            System.out.println("2. Read a Member's Information ");
            System.out.println("3. Update a Member's Information ");
            System.out.println("4. Remove a Member's Membership and Information from System ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter ID:");
                    tempID = scanner.nextLong();
                    System.out.println("Enter Name:");
                    tempName = scanner.next();
                    System.out.println("Enter Age:");
                    tempAge = scanner.nextInt();
                    System.out.println("Enter Sex:");
                    tempChar = scanner.next().charAt(0);

                    create(tempID, tempName, tempAge, tempChar);
                    break;
                case 2:
                    System.out.println("Enter ID:");
                    tempID = scanner.nextLong();
                    read(tempID);
                    break;
                case 3:
                    System.out.println("Enter ID:");
                    tempID = scanner.nextLong();
                    update(tempID);
                    break;
                case 4:
                    System.out.println("Enter ID:");
                    tempID = scanner.nextLong();
                    delete(tempID);
                    break;
                    default:
                        System.out.println("INCORRECT CHOICE!");
            }

            System.out.println("Do You Want to Continue? (y/ n)");
            answer = scanner.next().charAt(0);
        }
        scanner.close();
    }

    static void create(long id, String name, int age, char sex){
        ids.add(id);
        names.add(name);
        ages.add(age);
        sexs.add(sex);
        System.out.println("Registering is Completed Successfully.\n Your Id is: " + id);
    }

    static void read(long id){
        int iterator = find(id);
        if(iterator != -1) {
            System.out.println("Member ID: " + id);
            System.out.println("Member Name is: " + names.get(iterator));
            System.out.println("Member Age is: " + ages.get(iterator));
            System.out.println("Member Sex is: " + sexs.get(iterator));
        }
    }

    static void update(long id){
        int iterator = find(id);
        Scanner scanner = new Scanner(System.in);
        String temp;
        if(iterator != -1) {
            System.out.println("New Name: ");
            temp = scanner.nextLine();
            names.add(temp);

            int tmp;
            System.out.println("New Age: ");
            tmp = scanner.nextInt();
            ages.add(tmp);

            char t;
            System.out.println("New Sex: ");
            tmp = scanner.next().charAt(0);
            ages.add(tmp);

            System.out.println("Information Updated Successfully!");
        }
    }
    static void delete(long id){

        int iterator = find(id);
        Scanner scanner = new Scanner(System.in);
        if(find(id) != -1) {
            ids.remove(iterator);
            names.remove(iterator);
            ages.remove(iterator);
            sexs.remove(iterator);
            System.out.println("Member Removed Successfully!");
        } else {
            System.out.println("Not Found!");
        }
    }

    static int find(long id){
        int iterator = 0;
        for(long i: ids){
            if(i != id){
                iterator++;
            } else {
                break;
            }
        }
        if(iterator == ids.size()){
            System.out.println("Not Found!");
            return -1;
        }else{
            return iterator;
        }
    }
}
