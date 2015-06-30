import java.io.*;

public class AddrbookView0
{    
    	        				//using the default constructor
            
    String getUserInput()			//Called by controller object            
    {
        String searchString = "";

        try
        {
            InputStreamReader keyboard    = new InputStreamReader(System.in);   
            BufferedReader    keyboardBuf = new BufferedReader(keyboard);

            System.out.println();
            System.out.print("Enter (partial) last name: ");

            searchString = keyboardBuf.readLine();     	 	//read a line
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            return(searchString);
        }
    }

    void display(AddrbookEntry[] entry, int numMatches, String msg)    //Called by the controller object
    {       
        String str = msg + "\n";

        if (numMatches == 1)			//if one entry was found
            str = "";				//no need to display number of matches
                
        for (int i=0; i<numMatches; i++)      	//loop and create a proper display
            str += entry[i] + "\n";
                    
        System.out.println(str);        	//print the results                     
    }
}