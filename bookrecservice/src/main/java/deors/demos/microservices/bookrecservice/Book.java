package deors.demos.microservices.bookrecservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
public class Book {

    @Id @GeneratedValue private Long id;
    private String title;
    private String author;

    public Book(){
     this.title = "default-title";
     this.author = "default-author";
    }

    public Book(id, title, author){
       this.id = id;
       this.title = title;
       this.author = author;
    }

    public setId(id){
        this.id = id;
    }

    public Long getId(){
    	return this.id;
    }

    public setTitle(title){
        this.title = title;
    }

    public String getTitle(){
    	return this.title;
    }

    public setAuthor(author){
        this.author = author;
    }

    public String getAuthor(){
    	return this.author;
    }

    public String toString(){
        
    	String returnString = "*--------------------------*\n";
    	returnString += "ID: " + Long.toString(this.id) + "\n";
    	returnString += "Title: " + this.title + "\n";
    	returnString += "Author: " + this.author + "\n";
    	returnString += "*--------------------------*\n";

    	return returnString;
    }
}