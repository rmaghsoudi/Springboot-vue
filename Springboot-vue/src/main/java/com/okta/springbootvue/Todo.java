package com.okta.springbootvue;  
  
import lombok.*;  
  
import javax.persistence.Id;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Entity;  

/**  
 * Defines a data model with 3 properties, autogen ID, string title, and true/false completed
 * Lombok takes care of the getters and setters
 * This class will be mapped to an in-memory H2 database
**/
@Entity  
@Data  
@NoArgsConstructor  
public class Todo {  
      
  @Id @GeneratedValue  
  private Long id;  

  @NonNull
  private String title;  

  private Boolean completed = false;
      
}