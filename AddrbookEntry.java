class AddrbookEntry {
	String firstname;
	String lastname;
    String street;
    String city;
    String state;
    String zip; 
    String phone;

    AddrbookEntry(String firstname, String lastname, String street, String city, String state, String zip, String phone) {
    	this.firstname = firstname;
    	this.lastname = lastname;
    	this.street = street;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phone = phone;
    }

    public String toString(){
    	String  data = "First name: " + firstname + "\n";
    			data = "Last name: " + lastname + "\n";
    			data = "Street Address: " + street + "\n";
    			data = "City: " + city + "\n";
    			data = "State: " + state + "\n";
    			data = "Zip: " + zip + "\n";
    			data = "Phone num: " + phone + "\n";
    	return(data); 
    }
}