package com.github.nekoyasha7.oopregistrationproject.dao;

//--+ Imports +--//

import com.github.nekoyasha7.oopregistrationproject.model.Student;

import java.util.List;

//--+ END Imports +--//

public interface StudentDAO {

    /**
     *
     * Inserts a student int the database
     * @param student to be added to the database.
     */
    void add(Student student);

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    Student findById(int id);

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    List<Student> listStudents();

    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    boolean remove(int id);

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    boolean update(Student student);

}
