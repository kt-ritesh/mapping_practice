<center>
<h1> 🏚️Mapping Practice</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center><br>
This project is a Mapping Practice built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The All ...ModelClass  is defined inside the model packages which has the following attributes:
   
   inside Student Model:-<br>
   
private String ID<br>
private String name<br>
private String age<br>
private String phoneNumber<br>
private String branch<br>
private String department<br>

@OneToOne<br>
private Address address<br>
  
Laptop Model:- <br>
 
private String ID<br>
private String name<br>
private String brand<br>
private Integer price<br>

@OneToOne<br>
private Student student<br>
  
 Course Model:- <br>
 
private String ID<br>
private String title<br>
private String description<br>
private String duration<br>

@ManyToMany<br>
List<Student> studentList<br>
   
 Book Model:- <br>
   
private String ID<br>
private String title<br>
private String author<br>
private String description<br>
private String price<br>

@ManyToOne<br>
private Student student<br>
  
  Address Model:- <br>
   
private Long addressId;private String landmark<br>
private String zipcode<br>
private String district<br>
private String state<br>
private String country<br>

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> addAddress </b>

* PostMapping:

This endpoint makes a call to method in Service class which is connected to database. In database we add a new given through API.


* GetMapping: 

This endpoint returns all data through API.


* PutMapping: 

This endpoint makes a call to method in Service class which is connected to database. In database we update.


* DeleteMapping: 

This endpoint makes a call to method in Service class which is connected to database. In database we delete through API.

---

## JpaRepository extended by Repository interface.


We have used JpaRepository to implement CRUD Operations.

---

## 📝Project Summary

I have created Mapping Practice project.  In this project I have used @OneToOne , @ManyToOne , @ManyToMany mapping , user can add the Address , Student , Course , Book , Laptop.  Can delete , update , get ,  can find. etc...

