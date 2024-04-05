// Assume that these instance variables and import are declared at the top of the class
import java.util.Calendar;

private String FName;
private String LName;
private String LibNumber;
private Media myMedia;

// Accessor methods (getters)
public String getFName() {
    return FName;
}

public String getLName() {
    return LName;
}

public String getLibNumber() {
    return LibNumber;
}

public Media getMedia() {
    return myMedia;
}

// Mutator methods (setters)
public void setFName(String f) {
    FName = f;
}

public void setLName(String l) {
    LName = l;
}

public void setLibNumber(String ln) {
    LibNumber = ln;
}

public void setMedia(Media b) {
    myMedia = b;
}

// toString method
public String toString() {
    String str = "The specs of this Patron are: ";
    str += "\n\tFirst Name: " + FName;
    str += "\n\tLast Name: " + LName;
    str += "\n\tLibrary Number: " + LibNumber;
    str += "\n\tMedia: " + myMedia;
    return str;
}

// Constructors for the Patron class
public Patron() {
    FName = null;
    LName = null;
    LibNumber = null;
    myMedia = null;
}

public Patron(String f, String l, String ln, Media b) {
    FName = f;
    LName = l;
    LibNumber = ln;
    myMedia = b;
}
