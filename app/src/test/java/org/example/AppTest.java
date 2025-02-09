package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testCalculatePayrollNoOvertimeNoDependents(){
        double[] r=App.calculatePayroll(30,2);
        assertEquals(503.40,r[0],0.01);
        assertEquals(352.55,r[1],0.01);
    }
    @Test
    public void testCalculatePayrollOvertimeAndDependents(){
        double[] r=App.calculatePayroll(50,4);
        double g=40*16.78+10*16.78*1.5;
        assertEquals(g,r[0],0.01);
    }
}
