
/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

/*
 * Created by Basel.Altamimi on 8/4/2019.
 */

package Forms;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class MainForm extends JFrame
{
    public MainForm()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on JForm exit
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);

        final  Calender[] calnders = new Calender[2];


        JButton b1 = new JButton("Show Calender 1"); // Button 1 (Create Calender 1)
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                calnders[0] = Calender.getCalender();// get the single instance of the Calender class
            }
        });

        JButton b2 = new JButton("Show Calender 2"); // Button 2 (Create Calender 2)
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                calnders[1] = Calender.getCalender();// get the single instance of the Calender class
                isHashEqual(calnders[0],  calnders[1]);// test if the two calenders have the same HashCode or not.
            }
        });



        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(b1);
        panel.add(b2);

        this.add(panel);




    }

    /**
     * Create and show new calender object
     * Todo: This method logs the object HashCode in a text file, after refactoring the code; show warning message if the HashCode of Calender1 doesn't equal Calender2 HashCode
     */


//Old way: W/O Singleton Implementation
//    private void showNewCalender() {
//        SwingCalendar sc = new SwingCalendar();
//        Util.Logger.log("Object HC: " + sc.hashCode()); // Log Calender hash code
//    }

    private void isHashEqual(Calender calender1, Calender calender2)
    {
        if(identityHashCode(calender1) != identityHashCode(calender2))
        {
            JOptionPane.showMessageDialog(null,"Doesn't Equal", "Error", ERROR_MESSAGE);// show popup message if the two calenders doesn't have the same HashCode
        }
    }

}


