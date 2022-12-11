
package models;

/**
 *
 * @author vicken
 */
public class Posts {
    
    private int postID; // private key
    private int addressID; // foreign key
    private String description;
    private String dateTime;
    private String postTag;
    private String photos;
    
    public Posts(int postID, int addressID, String description, String dateTime, String postTag, String photos) {
        this.postID = postID;
        this.addressID = addressID;
        this.description = description;
        this.dateTime = dateTime;
        this.postTag = postTag;
        this.photos = photos;
    }
    
    public int getPostID() {
        return postID;
    }
    
    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getAddressID() {
        return addressID;
    }
    
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPostTag() {
        return postTag;
    }
    
    public void setPostTag(String postTag) {
        this.postTag = postTag;
    }

    public String getPhotos() {
        return photos;
    }
    
    public void setPhotos(String photos) {
        this.photos = photos;
    }
}
