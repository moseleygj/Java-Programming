import java.util.*;
import java.io.*;
public class StringM
{
public static  void main(String[] args)
{
String num = "10 20 30 5 15 2 7";
//delimeter [ ]+ consecutive spaces to be treated as one
String delim = "[ ]";
String[] tokens = num.split(delim);
 for (int i=0; i < tokens.length;i++)
 System.out.println(tokens[i]);
//create file to ask for(optional)
try{

FileReader file = new FileReader("WinningNumbers.txt");
BufferedReader buffer = new BufferedReader(file);

String textline = null;
while((textline = buffer.readLine()) != null)
System.out.println(textline);
buffer.close();
}
catch (IOException e ){System.out.println(e);
}
}
}

