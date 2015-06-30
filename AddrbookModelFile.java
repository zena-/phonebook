import java.io.*;

public class AddrbookModelFile
{
    private AddrbookEntry[] found;                           	//An array of address book
    	        						//using the default constructor
 
    AddrbookEntry[] search(String searchName)                                          
    {                                                         	//returns array of matching entries        
        try 
        {
            FileReader     addrbook = new FileReader("/Users/nekpenerhabor/dev/addressbook/addrbook");  //open file for input
            BufferedReader fileBuf  = new BufferedReader(addrbook);     //buffer the input

            found = new AddrbookEntry[100];
            int i = 0;        

            while(true)                                                 //keeing looping
            {
                String rec = fileBuf.readLine();                        //read from the file

                if (rec == null)                                        //if end-of-file
                    break;                                              //exit loop

                String[] tokens = rec.split(",");                       //split on ,

                String fileLastname = tokens[0];                        //get first token

                fileLastname   = fileLastname.toLowerCase();            //convert to lowercase
                searchName     = searchName.toLowerCase();
                        
                if (fileLastname.indexOf(searchName) == 0)          //if match
                {
                    String lname  = tokens[0];                          //populate it
                    String fname  = tokens[1];
                    String street = tokens[2];
                    String city   = tokens[3];
                    String state  = tokens[4];
                    String zip    = tokens[5];
                    String phone  = tokens[6];

                    AddrbookEntry entry = new AddrbookEntry(lname,fname,street,city,state,zip,phone);  //create an address book entry object

                    found[i++] = entry;                     //save object in the array
                }
            }
            addrbook.close();                               //close the file
        }       
        catch (FileNotFoundException e)
        {
            System.out.println(e);                          //print exception message
            e.printStackTrace(System.err);                  //print pgm trace to error stream 
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace(System.err);                  //print pgm trace to error stream 
        }       

        return(found);
    }
}