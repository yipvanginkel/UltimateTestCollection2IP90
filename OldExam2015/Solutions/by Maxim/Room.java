// file for exam 2ip90
// should not be changed except that
// a method isLecturer should be added

import java.util.ArrayList;

class Room { 
    ArrayList<User> visitors;
    String name; 
    
    public Room( String name ) {
        this.name = name;
        visitors = new ArrayList<User>();
    }
    
    @Override
    public String toString() {
        String result;
        result = "Room: "+name+"\n";
        if ( visitors.isEmpty() ) {
            result += "Currently no visitors.\n";
        } else {
            result += "Current visitors: ";
            for ( User u : visitors ) {
                result += u.toString()+"  ";
            }
            result += "\n";
        }
        return result;
    }
                
    boolean hasLecturer() {
        boolean hasLect = false;
        for ( User u : visitors ) {
            hasLect |= u.isLecturer();
        }
        return hasLect;
    }
    
    // assume user is not in room
    public void enter( User user ) {
        visitors.add( user );
    }
    
    // assume user is in room
    public void leave( User user ) {
        visitors.remove( user ); 
    } 
}
    