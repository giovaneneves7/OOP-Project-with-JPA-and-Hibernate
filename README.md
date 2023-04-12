
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="200" height="100"/> + <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="200" height="100"/> 
  <h1> <p align="center">OOP Project: JPA and Hibernate</p> </h1>
</p>
<hr>
  


<h2><p align="center"> ⚙ Contents: </p></h2>

<p align="center"> <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/model"> Model </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/view"> View</a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/controller"> Controller </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/dao"> DAO </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/service"> Service </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/exceptions"> Exceptions </a> | <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/tree/master/src/main/java/br/com/ifba/giovaneneves/oopregistrationproject/util"> Util </a> </p>
<h2> <p align="center">  About: </p> </h2>

*This is a project that simulates a student management system, which saves student data in a database with Hibernate ORM. Check out the wiki for details:*
<p align="center"> <h3> <a href="https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/wiki"> Project Wiki </a> </h3></p>
<hr>

<h2><p align="center"> 🛠 Features: </p></h2>

> **1.0 Add:** opens a new screen to register a student in the database. The new screen will be overlaid on the current screen, this means that the "refresh" button will have to be pressed every time a new student is registered. <br />
![image](https://user-images.githubusercontent.com/123518676/230914639-ae838cb2-22bb-4fed-8d45-96852ba6c615.png)
<hr>

> **2.0 Edit:** Opens a new screen to edit a student. To remove the selection from the row, refresh it by clicking the "refresh" button. If you want to select another student, click on the new student, only one student can be selected at a time.<br />
![image](https://user-images.githubusercontent.com/123518676/230914775-50013273-f882-46b5-9f7d-e1fb7c518fb9.png)
<hr>

> **2.1 Edit:** If a row in the table is not selected, a screen will open asking for the ID of the student you want to edit. <br />
![image](https://user-images.githubusercontent.com/123518676/230915389-4f6811da-1bd6-4ed3-8861-235b1453ea80.png)
<hr>

> **3.0 Delete:** Deletes the selected line. <br />
![image](https://user-images.githubusercontent.com/123518676/230915129-68782d46-f886-49ce-8464-9998da7da32d.png) 
<hr>

> **3.1 Delete:** If a row in the table is not selected, a screen will open asking for the ID of the student you want to delete. <br />
![image](https://user-images.githubusercontent.com/123518676/230915389-4f6811da-1bd6-4ed3-8861-235b1453ea80.png)
<hr>

> **4.0 Refresh:** Refresh the page. Some data may not load correctly into the table after an operation on other screens. Pressing the button will retrieve the updated data from the database. <br />
![image](https://user-images.githubusercontent.com/123518676/230915646-73eda8a2-9c4c-4af8-86a3-2d26df8a5c12.png)

> **5.0 Search Bar:** The search bar collects the text you type and searches the database for students with names containing the characters you type. When the search bar is empty, it loads all data from the database. If you type in a student name that does not exist in the database, the table is empty. <br />
![image](https://user-images.githubusercontent.com/123518676/230915781-78c5aea8-2fb5-4397-8312-70fb525a4e75.png)

> **6.0 Statistic Panels:** The panels use the list data to display numbers for the total number of students, the average grade for each student, and the total number of students who pass (students who pass have a grade higher than 7). When a student is added or removed, the panels update in real-time. <br />
![image](https://user-images.githubusercontent.com/123518676/230916619-5b23dad5-062d-4c06-923d-009bd8cb3a7f.png)

<h2><p align="center"> 📟 GUI: </p></h2>

 #### New Version:
 
 <blockquote>Version 1.2: Simple interfaces, with buttons for managing the data of students registered in the database.</blockquote>
 
 > **1.0: Home Screen.** Screen with a list of all the students registered in the database. Students are listed alphabetically, not in order of IDs. Check the utility of each button above, in the [Utilities topic](https://github.com/NekoYasha7/OOP-Project-with-JPA-and-Hibernate/edit/master/README.md#--features-).
 <p align="center"> <img src="https://user-images.githubusercontent.com/123518676/230913888-94db99e4-673d-4eac-92c0-b8194c7db08f.png" width="600" height="300"/></p>

 > **2.0: Registration Screen.** The screen has layers of validations to check the integrity of the data. Data will only be registered if all text fields pass the validations of the Class ``DataFormatValidator``.
 <p align="center"> <img src="https://user-images.githubusercontent.com/123518676/230914226-c382cc1f-ff72-4412-ab82-6e8f24fee834.png" width="600" height="300"/>

  > **3.0: Update Screen.** As with the registration class, the text fields of the update class are validated by the ``DataFormatValidator``. 
 <p align="center"><img src="https://user-images.githubusercontent.com/123518676/230914396-d9daf272-4bed-412f-bd87-1224d9976613.png" width="600" height="300"/> </p>

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
