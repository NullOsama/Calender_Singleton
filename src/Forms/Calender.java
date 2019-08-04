/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

package Forms;

public class Calender
{
    private static SwingCalendar  sc;

    private Calender()
    {
        this.sc = new SwingCalendar();
    }

    private static Calender calender = new Calender();

    public static Calender getCalender()
    {
        // Log Calender hash code
        Util.Logger.log("Object HC: " + calender.hashCode());
        sc.setVisible(true);
        return calender;
    }
}
