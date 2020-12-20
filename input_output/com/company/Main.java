package com.company;

//sample code to write 100 random ints to a file, 1 per line

import java.io.*;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

/*
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        // File class
        String path = "/home/ehsan/IdeaProjects/IO/inputFile1";
        File file = new File(path);
        File directory = new File("/home/ehsan/Desktop");
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.lastModified());
        String[] files = directory.list();
        System.out.println(files[0]);
*/


        // FileReader and FileWriter Classes to read and write
/*        FileReader fileReader;
        try {
            fileReader = new FileReader("");
        }catch(Exception e){

        }
        for(int i = 0; i< file.length(); i++){
            fileReader.
        }
        System.out.println();*//*

        // If we are working with text files, it is better to use Scanner and Formatter



        File file1 = new File("/home/ehsan/IdeaProjects/IO/inputFile1");
        try {
            Scanner scanner = new Scanner(file1);
            Formatter formatter = new Formatter("/home/ehsan/IdeaProjects/IO/outputFile1.txt");
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(!line.startsWith("d")){
                    formatter.format("%s\n", line);
                }
            }
            scanner.close();
            formatter.close();
            // Note to close the formatter otherwise it will not act as we consider
        } catch(IOException e){
            e.printStackTrace();
        }


        // try with resources comes in following code
        // in this manner of coding you don't need to close the resources
*/
/*        try(Scanner scanner = new Scanner(file1);
            Formatter formatter = new Formatter("/home/ehsan/IdeaProjects/IO/outputFile1.txt");
        ){

        } catch (IOException e){
            e.printStackTrace();
        }*//*


    }
}
*/

// fiiling a file with random numbers in each line
//sample code to write 100 random ints to a file, 1 per line

/*
import java.io.PrintStream;
        import java.io.IOException;
        import java.io.File;

        import java.util.Random;

public class WriteToFile{
public static void main(String[] args){
    try{
        PrintStream writer = new PrintStream( new File("randInts.txt"));
        Random r = new Random();
        final int LIMIT = 100;
        for(int i = 0; i < LIMIT; i++){
    	    writer.println( r.nextInt() );
        }
        writer.close();
   }
   catch(IOException e){
        System.out.println("An error occured while trying to write to the file");
        }
    }
}*/

/*


// Thread
class T extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }
}

class R implements Runnable {
    @Override
    public void run(){
        for(char ch = 'A'; ch < 'Z'; ch++){
            System.out.println(ch);
        }
    }
}

class D implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+1);
        }

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getName());
    }

}

class AreaCalculator extends Thread{
    private int width;
    private int length;
    private int area;

    public AreaCalculator(int a, int b){
        this.width = a;
        this.length = b;
    }
    @Override
    public void run(){
        this.area = this.width * this.length;
    }

    public int getArea() {
        return this.area;
    }
}

// Main itself is a Thread
// Other Daemon Threads are running in the background like garbage collector
public class Main{
    public static void main(String[] args){
*/
/*        new Thread(new R()).start();// A Thread here(1)
        new T().start(); // Another one here(2)
        new Thread(new R()).start(); // Another one here(3)
        new T().start(); // Another one here(4)
        for(char ch = 'a'; ch < 'z'; ch++){
            System.out.println(ch);
        }*//*


*/
/*        new Thread(new D()).start();

        for (char ch = 'a'; ch < 'z'; ch++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ch);
        }

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getName());*//*

        AreaCalculator[] threadArray;
        threadArray = new AreaCalculator[100];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 100; i++) {
            int width = scanner.nextInt();
            int length = scanner.nextInt();
            threadArray[i] = new AreaCalculator(width, length);
        }

        ArrayList<AreaCalculator> threadArrayList = new ArrayList<>();

        AreaCalculator areaCalculatorThread1 = new AreaCalculator(12, 12);
        threadArrayList.add(areaCalculatorThread1);

        AreaCalculator areaCalculatorThread2 = new AreaCalculator(13, 15);
        threadArrayList.add(areaCalculatorThread2);

        AreaCalculator areaCalculatorThread3 = new AreaCalculator(13, 18);
        threadArrayList.add(areaCalculatorThread3);

        areaCalculatorThread1.start();
        areaCalculatorThread2.start();
        areaCalculatorThread3.start();


        for(int i = 0; i < threadArrayList.size(); i++){
            try {
                threadArrayList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(areaCalculatorThread1.getArea());
        System.out.println(areaCalculatorThread2.getArea());
        System.out.println(areaCalculatorThread3.getArea());
    }
}
*/





// Producer/Consumer Problem Version 1 - Wait and Notify Version
/*
public class Main{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> list = new LinkedList<>();
        // mutual list among different threads

        // array of 4 threads - 2 consumer and 2 producer
        Thread[] threads = {new Producer(list),
        new Producer(list), new Consumer(list),
        new Consumer(list)};

        for (Thread thread: threads){
            thread.start();
        }

        for (Thread thread: threads){
            thread.join();
        }

        System.out.println("Finished " + list.size());
    }
}

// producer/consumer problem
class Producer extends Thread{
    List<Integer> list;
    Producer (List<Integer> l){
        list = l;
    }
    @Override
    public void run(){
        for(Integer i = 0; i < 100; i++){
            synchronized(list){
                Integer num = (int) (Math.random() * 1000);
                System.out.println("Added: " + num);
                list.add(num);

                // tells that I produced and added to list
                // Now you can use the list :D
                list.notify();
            }
            try {
                Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer extends Thread{
    List<Integer> list;
    Consumer(List<Integer> l){
        list = l;
    }
    public void run(){
        for(Integer i = 0; i < 100; i++){
            synchronized (list){
                while (list.size() == 0){
                    try {
                        list.wait();
                    }catch (InterruptedException e){
                    }
                }
                Integer fetch = list.remove(0);
                System.out.println("Fetched: " + fetch);
            }
        }
    }
}*/


// Producer Consumer Problem Version 2 - Semaphore Version
/*
class Main{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> list = new LinkedList<>();
        Semaphore semaphore = new Semaphore(0);
        Thread[] threads = {
                new Consumer = new Consumer(list, semaphore);
                new Consumer = new Consumer(list, semaphore);
                new Producer = new Producer(list, semaphore);
                new Producer = new Producer(list, semaphore);
        };

        for(Thread thread: threads){
            thread.start();
        }

        for (Thread thread:threads){
            thread.join();
        }

        System.out.println("Finished, List Size: "+list.size());
    }
}

class Consumer extends Thread{
    List<Integer> list;
    private Semaphore semaphore;
    Consumer(List<Integer> list, Semaphore semaphore){
        this.list = list;
        this.semaphore = semaphore;
    }

    public void run(){
        for(Integer i=0; i<100; i++){
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            synchronized (list){
                Integer fetch = list.remove(0);
                System.out.println("Fetched: "+fetch);
            }
        }
    }
}

class Producer extends Thread{
    List<Integer> list;
    private Semaphore semaphore;
    Producer(List<Integer> list, Semaphore semaphore){
        this.list = list;
        this.semaphore = semaphore;
    }

    public void run(){
        for(Integer i=0; i<100; i++){
            Integer num = (int) (Math.random()*1000);
            System.out.println("Added: "+num);
            synchronized (list){
                list.add(num);
            }
            semaphore.release();
        }
    }

}*/

// Consumer/ Producer Problem - Version 3 - BlockingQueue Version
/*

class Main{
    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
        Thread[] threads = {
          new Producer(queue),
          new Producer(queue),
          new Consumer(queue),
          new Consumer(queue)
        };

        for(Thread thread: threads){
            thread.start();
        }

        for(Thread thread: threads){
            thread.join();
        }
    }
}


class Producer extends Thread{
    ArrayBlockingQueue<Integer> queue;
    public Producer(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }

    public void run(){
        for (int i = 0; i<100; i++){
            Integer num = (int)(Math.random()*100);

            try {
                queue.put(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Added: "+num);
        }
    }
}

class Consumer extends Thread{
    ArrayBlockingQueue<Integer> queue;
    public Consumer(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }


    public void run(){
        for (Integer i = 0; i<100; i++){
            try {
                int fetch = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/


