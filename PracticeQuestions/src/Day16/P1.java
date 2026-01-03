package Day16;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * P1 class implements Serializable interface
 * so that its objects can be converted into a byte stream
 * and stored in a file (Serialization).
 */
public class P1 implements Serializable {

    int id;
    String name;
    /*
     * transient variable:
     * This variable will NOT be saved during serialization.
     * After deserialization, its value will be null.
     */
    transient String pass;

    public static void main(String[] args) throws Exception {
        // Creating object of P1 class
        P1 p = new P1();
        p.id = 101;
        p.name = "hitesh";
        p.pass = "hitesh123";

        System.out.println("----Serialization Process Started----");
        /*
         * FileOutputStream is used to write data to a file
         * "person.ser" is the file where object data will be stored
         */
        FileOutputStream fos = new FileOutputStream("person.ser");
        /*
         * ObjectOutputStream converts object into byte stream
         * and writes it into the file
         */
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Writing object to file (Serialization)
        oos.writeObject(p);
        oos.flush();
        oos.close();

        System.out.println("---Serialization Completed---");
        System.out.println("----De-Serialization Process Started----");
        /*
         * FileInputStream reads the byte stream from the file
         */
        FileInputStream fis = new FileInputStream("person.ser");
        /*
         * ObjectInputStream converts byte stream back into object
         */
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Reading object from file (Deserialization)
        Object object = ois.readObject();

        // Type casting Object to P1
        P1 ps = (P1) object;
        // Printing deserialized values
        System.out.println(ps.id);     // 101
        System.out.println(ps.name);   // hitesh
        /*
         * pass is transient, so it was not serialized.
         * After deserialization, it will be null.
         */
        System.out.println(ps.pass);   // null

        System.out.println("---De-Serialization Completed---");
    }
}
