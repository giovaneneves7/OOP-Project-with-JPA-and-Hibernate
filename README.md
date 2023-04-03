
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="200" height="100"/> + <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="200" height="100"/> 
  <h1> <p align="center">OOP Project: JPA and Hibernate</p> </h1>
</p>
<hr>
  


<h2><p align="center"> ⚙ Contents: </p></h2>

<p align="center"> <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/connection"> Connection </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/model"> Model </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/view"> View</a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/controller"> Controller </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/dao"> DAO </a> </p>
<h2> <p align="center">  About: </p> </h2>

*This is a project that simulates a student management system, which saves student data in a database with Hibernate ORM. Check out below the resources used to create the project:*
|Technology | Utlity |
|-----------|--------|
| JAVA      | Java is a general-purpose, object-oriented programming language that is designed to be platform-independent, meaning that it can run on multiple operating systems with minimal changes.|
| Swing| Java Swing is a set of graphical user interface (GUI) components and tools for building desktop applications in Java. It is a part of the Java Foundation Classes (JFC) and provides a rich set of widgets, including buttons, text fields, labels, tables, and more, that can be used to create complex and customizable user interfaces. |
| Maven     | Maven is a build automation tool used primarily for Java projects. It provides a simple way to manage project dependencies, build processes, and project documentation. Maven uses a declarative approach to build configurations, which means developers specify the desired outcome of the build rather than the specific steps needed to achieve it. Maven also provides a centralized repository of libraries and plugins, called the Maven Central Repository, which makes it easy to find and manage project dependencies. Maven is widely used in the Java community and integrates with popular development tools such as Eclipse and IntelliJ IDEA. It is known for its ease of use and simplifies the process of building, testing, and deploying Java applications.|
| Hibernate | Hibernate is an Object-Relational Mapping (ORM) framework that simplifies the management of relational databases in Java applications. When combined with MySQL, it can be used to store and retrieve data for a student management project. Hibernate provides an abstraction layer that maps Java objects to database tables, allowing developers to work with Java objects rather than SQL statements. This simplifies the code and improves productivity by reducing the amount of boilerplate code required to interact with the database.|
|MySQL      | MySQL is an open-source Relational Database Management System (RDBMS) that is widely used for storing and managing structured data. It uses the Structured Query Language (SQL) to manage and manipulate data stored in its databases. MySQL is highly scalable and can handle large amounts of data efficiently. It is commonly used in web applications, such as student management systems, to store and retrieve data. MySQL provides a variety of features, including support for transactions, indexes, and stored procedures, making it a popular choice for developers.|
<hr>

<h2><p align="center"> 🛠 Features: </p></h2>

> **1.0 Add:** opens a new screen to register a student in the database. The new screen will be overlaid on the current screen, this means that the "refresh" button will have to be pressed every time a new student is registered. <br />
![image](https://user-images.githubusercontent.com/123518676/229386601-ddfc6af4-3b7c-4bf9-8f68-21a02dfd3812.png)
<hr>

> **2.0 Edit:** Opens a new screen to edit a student. To remove the selection from the row, refresh it by clicking the "refresh" button. If you want to select another student, click on the new student, only one student can be selected at a time.<br />
![image](https://user-images.githubusercontent.com/123518676/229386847-6ebab7c8-a3eb-446d-af88-11a6f53c71a2.png)
<hr>

> **2.1 Edit:** If a row in the table is not selected, a screen will open asking for the ID of the student you want to edit. <br />
![image](https://user-images.githubusercontent.com/123518676/229386783-ebc0c3d7-ad0b-4e36-b0fe-99c9f9d0ca0f.png)
<hr>

> **3.0 Delete:** Deletes the selected line. <br />
![image](https://user-images.githubusercontent.com/123518676/229387047-a6267b4c-408e-4f5a-a2e6-a6662191f41b.png) 
<hr>

> **3.1 Edit:** If a row in the table is not selected, a screen will open asking for the ID of the student you want to delete. <br />
![image](https://user-images.githubusercontent.com/123518676/229386783-ebc0c3d7-ad0b-4e36-b0fe-99c9f9d0ca0f.png)
<hr>

> **4.0 Refresh:** Refresh the page. Some data may not load correctly into the table after an operation on other screens. Pressing the button will retrieve the updated data from the database. <br />
![image](https://user-images.githubusercontent.com/123518676/229387299-a0f6257a-8d34-4be2-a052-a1e354525454.png)

> **5.0 Search Bar:** The search bar collects the text you type and searches the database for students with names containing the characters you type. When the search bar is empty, it loads all data from the database. If you type in a student name that does not exist in the database, the table is empty. <br />
![image](https://user-images.githubusercontent.com/123518676/229387456-8be3e06f-8629-4338-b689-9838380e503f.png)

<h2><p align="center"> 📟 GUI: </p></h2>

 #### New Version:
 
 <blockquote>Version 1.1: Simple interfaces, with buttons for managing the data of students registered in the database.</blockquote>
 <p align="center"> <img src="https://user-images.githubusercontent.com/123518676/229368180-0fc6c028-31fe-44e6-845b-407d8fb9d963.png" width="400" height="200"/><img src="https://user-images.githubusercontent.com/123518676/229368287-a6dcf653-cb02-4caa-9205-e3946ba170e3.png" width="400" height="200"/><img src="https://user-images.githubusercontent.com/123518676/229368323-30f4a85e-814a-44d0-89e4-3e132c0ea7af.png" width="400" height="200"/> </p>
 
<hr>


<h2><p align="center"> 🧉 Sources: </p></h2>

**Link to the icons used in the buttons:** [MyWorkspace.html](https://meuworkspace.blogspot.com/2023/04/oop-project.html)

**MySQL remote database:** [Free SQL DataBase](https://www.freesqldatabase.com/account/)

<h2><p align="center"> 📼 SQL Sources: </p></h2>

> Because of a "create" error in ``<property name="hibernate.hbm2ddl.auto" value="create" />``, on the Free SQL Database site, the table "students" had to be created manually with the following SQL:
```mysql

USE school;

CREATE TABLE students (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  registration_number VARCHAR(20) NOT NULL DEFAULT '',
  birth_date DATE NOT NULL DEFAULT '1111-11-11',
  academic_year INT NOT NULL DEFAULT 0,
  grade1 FLOAT NOT NULL DEFAULT 0,
  grade2 FLOAT NOT NULL DEFAULT 0,
  grade3 FLOAT NOT NULL DEFAULT 0,
  average_grade FLOAT NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
);

```
