/* package quatest;
import org.junit.Test;
import static org.junit.Assert.*;
import qua.Quadratic;
import qua.NotEnoughPrecisionException;

public class quadraticTestComb {
    //TestRealNumber
    @Test
    public void testRealNumber1() throws NotEnoughPrecisionException {
        double a = 1; double b = 7; double c = 2; String output1 = "-0.298"; String output2 = "-6.701";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testRealNumber2() throws NotEnoughPrecisionException {
        double a = 6; double b = 6; double c = 0; String output1 = "0"; String output2 = "1";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testRealNumber3() throws NotEnoughPrecisionException {
        double a = 3; double b = 7; double c = 3; String output1 = "-0.565"; String output2 = "-1.767";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }
    @Test
    public void testRealNumber4() throws NotEnoughPrecisionException {
        double a = 1; double b = 8; double c = 8; String output1 = "-1.171"; String output2 = "-6.828";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }
    @Test
    public void testRealNumber5() throws NotEnoughPrecisionException {
        double a = -4999.5; double b = 0; double c = 4999.5; String output1 = "-1"; String output2 = "1";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    //testComplexNumber
    @Test
    public void testComplexNumber() throws NotEnoughPrecisionException {
        double a = 1; double b = 0; double c = 1; String output1 = "i"; String output2 = "-i";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testComplexNumber2() throws NotEnoughPrecisionException {
        double a = 6; double b = 0; double c = 1; String output1 = "0.40825i"; String output2 = "0.408";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testComplexNumber3() throws NotEnoughPrecisionException {
        double a = 6; double b = -2; double c = 1; String output1 = "0.166"; String output2 = "0.166";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testComplexNumber4() throws NotEnoughPrecisionException {
        double a = -1.45; double b = 0; double c = -0.1724137931034483; String output1 = "-0.3448275862"; String output2 = " ";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testComplexNumber5() throws NotEnoughPrecisionException {
        double a = -1.622413793103448; double b = 0; double c = -0.1540913921360255; String output1 = "0.3081827842i"; String output2 = " ";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testTooLargeNumberNotAllowed() throws NotEnoughPrecisionException{
        double a = 1; double b = 4999; double c = 4998; String output1 = "-4998";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        Quadratic.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
    }

}
*/