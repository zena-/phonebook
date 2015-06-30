public class AddrbookControl {

    private AddrbookView0     view;            //the view object
    private AddrbookModelFile model;           //The model object

    private String searchName;                  //The name to search for 
    private AddrbookEntry[] found;             //A reference to the array of found entries
    private int    numMatches;                  //Number of matches
    private String message;                     //Client message


    AddrbookControl()
    {
        this.view  = new AddrbookView0();
        this.model = new AddrbookModelFile();
        
        start();                
    }
    
    void start()                                        
    {
        while (true)					//keep running 
        {
            searchName = view.getUserInput();		//call the view to get user input

            if (searchName.equals(""))            	//if input is null
                System.exit(0);				//exit

            found = model.search(searchName);		//call the model search() method

            numMatches = 0;                            
            for (AddrbookEntry entry : found)      	//loop through the returned entries
                if(entry != null)
                    numMatches++;
                                             
            if (numMatches > 0)
                message = numMatches + " " + searchName + " were found";
            else 
                message = " Name " + searchName + " was not found";

            view.display(found, numMatches, message);	//call the view to display
        }
    }
}