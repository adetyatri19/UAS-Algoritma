package no2;
public class AntrianApp {
    public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(46);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama saya adalah Adetya Tri Susilo Aji ");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(70);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
