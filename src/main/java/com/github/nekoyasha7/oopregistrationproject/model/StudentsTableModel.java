package com.github.nekoyasha7.oopregistrationproject.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GiovaneNeves
 */
public class StudentsTableModel extends AbstractTableModel{

    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    
    private List<Student> studentList = new ArrayList<>();
    private String[] collumns = {"Name", "Registration", "Average grades", "Remove", "Edit"};

    //----------------------------------------------{ GETTERS AND SETTERS}----------------------------------------------//
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String[] getCollumns() {
        return collumns;
    }

    public void setCollumns(String[] collumns) {
        this.collumns = collumns;
    }
    
    
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
                return this.getStudentList().get(rowIndex).getName();
            case 1:
                return this.getStudentList().get(rowIndex).getRegistrationNumber();
            case 2:
                return this.getStudentList().get(rowIndex).getAverageGrades();
            /*case 3:
                return new JButton("Delete");
            case 4:
                return new JButton("Edit");*/
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
    
}
