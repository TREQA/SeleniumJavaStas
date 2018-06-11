package seleniumTesting;

import java.util.Set;

public class Users {
    public String firstName;
    public String lastName;
    public String email;
    public String user;

    public Users(){
        this.user = this.getRandomUser(this.names);
        this.firstName=this.getFirstName(this.user);
        this.lastName  = this.getLastName(this.user);
        this.email = this.createEmail(this.user);
    }
    public String[]  names= {
            "Flavia Curro",
            "Kristyn Dahmen",
            "Dolly Walters",
            "Kenya Cappiello",
            "Evangeline Guarnieri",
            "Selena Gorney",
            "Alla Cantero",
            "Awilda Funderburk",
            "Chanell Grenier",
            "Crystal Grosso",
            "Estella Ryba",
            "Lewis Lent",
            "Elin Lesh",
            "Felice Garney",
            "Rayford Mesa",
            "Xuan Pruett",
            "Elise Gritton",
            "Maricela Reichard",
            "Lorraine Stacks",
            "Don Dubrey",
    };
    public String getFirstName(String name){
        return name.split(" ")[0];
    }
    public String getLastName(String name){
        return name.split(" ")[1];
    }

    public String getRandomUser(String names[]){
            return names[(int)Math.floor(Math.random()*names.length)];
    }

    public String createEmail(String name){
        String firstName =name.split(" ")[0];
        String lastName =name.split(" ")[1];
        return firstName+"."+lastName+"@yahoo.com";
    }

}