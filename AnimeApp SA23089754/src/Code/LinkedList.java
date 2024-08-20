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
public class LinkedList {
    
    private Link first;
    
    public LinkedList(){
        first = null;
    }
    
    public Link getFirst(){
        return first;
    }
    
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertFirst(String cn, String des ,String pic){
        Link obj = new Link(cn, des, pic);
        obj.next = first;
        first = obj;
    }
    
    public void insertLast(String cn, String des ,String pic){
        Link obj = new Link(cn, des, pic);
        
        if(isEmpty()){
            first = obj;
        }
        
        obj.next = first;
        first = obj;
    }
    
    public void deleteFirst(){
        Link temp = first;
        first = first.next;
    }
    
    public boolean insertAfter(String exName, String cn, String des ,String pic){
        Link obj = new Link(cn, des, pic);
        obj.next = first;
        first = obj;
        return true;
    }
    
    public Link find(String name){
        Link current = first;
        while(current != null){
            if(current.characterName == name){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
     public Link delete(String name){
         Link current = first;
         Link previous = current;
         
         while(current != null){
             if(current.characterName == name){
                 if(current == first){
                     first = first.next;
                 }
                 else{
                     previous.next = current.next;
                 }
                 return current;
             }
             else{
                 previous = current;
                 current = current.next;
             }
         }
         return null;
     }
}
