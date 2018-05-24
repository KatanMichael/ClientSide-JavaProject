import com.google.gson.Gson;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main
{

    String IPAddress;

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner (System.in);
        DataModel[] dataModel = new DataModel[1];

        int rand = (int) (Math.random ()*1000);
        dataModel[0] = new DataModel (Long.valueOf (rand),Integer.valueOf (100));

        System.out.println (rand);

        Map<String, String> map = new HashMap<> ();
        String action = "action";
        String header = "DELETE";

        //header = scanner.nextLine ();
        scanner.reset ();

        map.put (action,header);
        Request request = new Request (map,dataModel);

        Gson gson = new Gson ();

        InetAddress address = InetAddress.getLocalHost ();
        Socket clinetSocket = new Socket (address.getHostAddress (),12345);

        ObjectOutputStream output=new ObjectOutputStream(clinetSocket.getOutputStream());
        ObjectInputStream input=new ObjectInputStream (clinetSocket.getInputStream());


        String gsonModel = gson.toJson (request);

        output.writeObject (gsonModel);

        DataModel[] model;
        String inputGson;
            try
            {
                inputGson = (String) input.readObject ();

                if(inputGson.equals ("true") || inputGson.equals ("false"))
                {
                    System.out.println (inputGson);
                }else
                {
                    model = gson.fromJson (inputGson,DataModel[].class);
                    for (DataModel d: model)
                    {
                        System.out.println (d.toString ());
                    }

                }
            } catch (ClassNotFoundException e)
            {
                e.printStackTrace ();
            }


    }



}