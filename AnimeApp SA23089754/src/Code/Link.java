/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Link {
    
    public String characterName;
    private String description;
    private String picture;
    public Link next;

    public Link(String characterName, String description, String picture) {
        this.characterName = characterName;
        this.description = description;
        this.picture = picture;
        next = null;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }
    
    
    
    
    
}
