//--+ Package +--//
package com.github.nekoyasha7.oopregistrationproject.model;
//--+ END Package +--//

//--+ Imports +--//
import java.time.LocalDate;
        
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
@Entity
@Table (name = "students")
public class Student {
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String registrationNumber;
    private LocalDate birthDate;
    private int academicYear;
    private float[] grades = new float[3];
    private float averageGrades;
    
    //----------------------------------------------{ GETTERS AND SETTERS}----------------------------------------------//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }
    
    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public float getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(float averageGrades) {
        this.averageGrades = averageGrades;
    }
    
    
}
