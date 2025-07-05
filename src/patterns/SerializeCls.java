package patterns;

import java.io.*;

public class SerializeCls {

    public static void main(String[] args) {


        PersonSerialization personSerialization = new PersonSerialization("Test", "Manhattan");
        FileOutputStream outputStream;

        {
            try {
                outputStream = new FileOutputStream("serializatindata");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        ObjectOutputStream objectOutputStream;

        {
            try {
                objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(personSerialization);
                objectOutputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream("serializatindata");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            PersonSerialization person=(PersonSerialization) objectInputStream.readObject();

            objectInputStream.close();
fileInputStream.close();
System.out.println(person.getName());
System.out.println(person.getCity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
