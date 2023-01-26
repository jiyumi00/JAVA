import java.util.*;
import java.io.*;
import java.net.*;
import com.google.gson.Gson;

public class Client
{
    public static void main(String[]args) throws IOException
    {
        Socket socket=new Socket("localhost",8000);

        Family family=new Family();
        family.member=5;
        family.address="마산";

        ArrayList<Person> persons=new ArrayList<>();

        Person person1=new Person();
        person1.name="아빠";
        person1.age=51;
        persons.add(person1);

        Person person2=new Person();
        person2.name="엄마";
        person2.age=46;
        persons.add(person2);

        family.person=persons;

       
        ///////////////////////////
        Gson gson=new Gson();
        String jsonString=gson.toJson(family);

        OutputStream out=socket.getOutputStream();
        out.write(jsonString.getBytes("utf-8"));
        out.flush();

        socket.close();

    }
}