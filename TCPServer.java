
import java.io.*;
import java.net.*;
//http://www.youtube.com/watch?v=6G_W54zuadg
class TCPServer
{
   public static void main(String argv[]) throws Exception
      {
         String clientSentence;
         String capitalizedSentence;
         ServerSocket welcomeSocket = new ServerSocket(6789);
           System.out.println(":waiting:");
         while(true)
         {
             System.out.println(".");
             
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            System.out.println("Received:   ANKUR " + clientSentence);
            capitalizedSentence = clientSentence.toUpperCase() +"Small and big worl is  also written "
                    + ""
                    + ""
                    + " hear";
            outToClient.writeBytes(capitalizedSentence + " hellllllllo"+'\n');
           

         }
      }
}
