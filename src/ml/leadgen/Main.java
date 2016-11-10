package ml.leadgen;

public class Main {

    public static void main(String[] args) {
        Tbook tbook=Tbook.getInstance();
        System.out.println("Hello phones");
        System.out.println(Tbook.getInstance());
        System.out.println(new Person("John","Doe","0661111111"));
        tbook.addPerson(new Person("John","Doe","0661111111")).addPerson(new Person("Jason","Doe","0662222222"));
        tbook.addPerson(new Person("Ippolit","-","")).addPerson(new Person("Sintia","Simpson","0631111111"));
        System.out.println(tbook);
        System.out.println(tbook.getPhone("Jason","Doe"));
    }
}
