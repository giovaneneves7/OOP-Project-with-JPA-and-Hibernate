
package com.github.nekoyasha7.oopregistrationproject;

import com.github.nekoyasha7.oopregistrationproject.controller.StudentController;
import com.github.nekoyasha7.oopregistrationproject.model.Student;
import com.github.nekoyasha7.oopregistrationproject.view.Students_GUI;
import com.github.nekoyasha7.oopregistrationproject.connection.ConnectionFactory;

/**
 *
 * @author GiovaneNeves
 */
public class OOPRegistrationProject {

    public static void main(String[] args) {

        Student student = new Student();
        float[] grades = {5f, 6f, 8f};
        float sum = 0f;
        float average;

        for(float grade : grades){
            sum += grade;
        }
        average = (sum / grades.length);

        student.setName("João");
        student.setRegistrationNumber("12345");
        student.setGrades(grades);
        student.setAverageGrades(average);

        StudentController studentController = new StudentController();
        studentController.add(student);
        //ConnectionFactory.connect();
        //new Students_GUI().setVisible(true);
    }
}
