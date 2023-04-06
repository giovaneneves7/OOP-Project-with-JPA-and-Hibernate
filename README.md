
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="200" height="100"/> + <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="200" height="100"/> 
  <h1> <p align="center">OOP Project: JPA and Hibernate</p> </h1>
</p>
<hr>
  


<h2><p align="center"> ⚙ Contents: </p></h2>

<p align="center"> <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/connection"> Connection </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/model"> Model </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/view"> View</a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/controller"> Controller </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/dao"> DAO </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/com/github/nekoyasha7/oopregistrationproject/service"> Service </a> </p>
<h2> <p align="center">  About: </p> </h2>

*This is a project that simulates a student management system, which saves student data in a database with Hibernate ORM. Check out the wiki for details.*

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
 
 <blockquote>Version 1.2: Simple interfaces, with buttons for managing the data of students registered in the database.</blockquote>
 
 > **1.0: Home Screen.** Screen with a list of all the students registered in the database. Students are listed alphabetically, not in order of IDs. Check the utility of each button above, in the [Utilities topic](https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/edit/master/README.md#--features-).
 <p align="center"> <img src="https://user-images.githubusercontent.com/123518676/229532400-84b5fdd4-a38d-4b32-9767-f77c477e57c4.png" width="600" height="300"/></p>
 
 > **2.0: Registration Screen.** The screen has layers of validations to check the integrity of the data. Data will only be registered if all text fields pass the validations of the Class ``DataFormatValidator``.
 <p align="center"> <img src="https://user-images.githubusercontent.com/123518676/229533902-cd296c89-88a7-4f2e-8290-fd9455ac60e5.png" width="600" height="300"/>
 
  > **3.0: Update Screen.** As with the registration class, the text fields of the update class are validated by the ``DataFormatValidator``. 
 <p align="center"><img src="https://user-images.githubusercontent.com/123518676/229534177-beb1ddb9-e07e-486a-bd3d-32e35ed7f544.png" width="600" height="300"/> </p>

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
