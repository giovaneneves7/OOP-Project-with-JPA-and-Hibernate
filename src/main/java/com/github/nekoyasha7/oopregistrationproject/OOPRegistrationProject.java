
package com.github.nekoyasha7.oopregistrationproject;

import com.github.nekoyasha7.oopregistrationproject.dao.StudentDAO;
import com.github.nekoyasha7.oopregistrationproject.model.Student;
import com.github.nekoyasha7.oopregistrationproject.view.Students_GUI;

/**
 *
 * @author GiovaneNeves
 */
public class OOPRegistrationProject {

    public static void main(String[] args) {

        //ConnectionFactory.connect();
        new Students_GUI().setVisible(true);
    }
}
