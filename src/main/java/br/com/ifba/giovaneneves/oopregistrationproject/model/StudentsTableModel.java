package br.com.ifba.giovaneneves.oopregistrationproject.model;

//--+ Imports +--//
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.table.AbstractTableModel;
//--+ END imports +--//
/**
 *
 * @author GiovaneNeves
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentsTableModel extends AbstractTableModel{

    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    
    private List<Student> studentList = new ArrayList<>();
    private String[] collumns = {"ID", "Name", "Registration", "Average grades", "Academic Year", "Age"};

    //----------------------------------------------{ METHODS}----------------------------------------------//
    
    @Override
    public String getColumnName(int column){
        
        return this.getCollumns()[column];
    }
    
    @Override
    public int getRowCount() {
        return this.getStudentList().size();
    }

    @Override
    public int getColumnCount() {
        return this.getCollumns().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return this.getStudentList().get(rowIndex).getId();
            case 1:
                return this.getStudentList().get(rowIndex).getName();
            case 2:
                return this.getStudentList().get(rowIndex).getRegistrationNumber();
            case 3:
                return this.getStudentList().get(rowIndex).getAverageGrades();
            case 4:
                return this.getStudentList().get(rowIndex).getAcademicYear();
            case 5:
                LocalDate birthDate = this.getStudentList().get(rowIndex).getBirthDate();
                int age = Period.between(birthDate, LocalDate.now()).getYears();
                return age + " years old";

        }
        
        return null;
    }
    
    /**
    * Adds a new row to the table
    * @param student to be added to the student list
    */
    public void addRow(Student student){
        
        this.getStudentList().add(student);
        
        //--+ Update the table +--//
        this.fireTableDataChanged();
        
    }
    
    /**
     * 
     * @param row to be removed from the JTable.
     */
    public void removeRow(int row){
        
        this.getStudentList().remove(row);
        this.fireTableRowsDeleted(row, row);
        
    }
    
}
