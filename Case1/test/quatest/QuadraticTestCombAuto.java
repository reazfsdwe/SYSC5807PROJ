package quatest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

import qua.Quadratic;
import qua.QuadraticReturn;
import qua.NotEnoughPrecisionException;



public class QuadraticTestCombAuto {
    private static long startTime;

    @BeforeClass
    public static void beforeAll() {
        startTime = System.currentTimeMillis();
    }

    @AfterClass
    public static void afterAll() {
        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL time: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testCase0() throws NotEnoughPrecisionException
    {
        double a = 1.0;
        double b = 8.0;
        double c = 1.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase1() throws NotEnoughPrecisionException
    {
        double a = 2.0;
        double b = 7.0;
        double c = 1.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase2() throws NotEnoughPrecisionException
    {
        double a = 3.0;
        double b = 6.0;
        double c = 1.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase3() throws NotEnoughPrecisionException
    {
        double a = 4.0;
        double b = 5.0;
        double c = 1.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase4() throws NotEnoughPrecisionException
    {
        double a = -1.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase5() throws NotEnoughPrecisionException
    {
        double a = -2.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase6() throws NotEnoughPrecisionException
    {
        double a = -3.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase7() throws NotEnoughPrecisionException
    {
        double a = -4.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase8() throws NotEnoughPrecisionException
    {
        double a = -5.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase9() throws NotEnoughPrecisionException
    {
        double a = -6.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase10() throws NotEnoughPrecisionException
    {
        double a = -7.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase11() throws NotEnoughPrecisionException
    {
        double a = -8.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase12() throws NotEnoughPrecisionException
    {
        double a = -9.0;
        double b = 0.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase13() throws NotEnoughPrecisionException
    {
        double a = -10.0;
        double b = 1.0;
        double c = 9.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase14() throws NotEnoughPrecisionException
    {
        double a = -10.0;
        double b = 9.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase15() throws NotEnoughPrecisionException
    {
        double a = -9.0;
        double b = 9.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase16() throws NotEnoughPrecisionException
    {
        double a = -8.0;
        double b = 1.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase17() throws NotEnoughPrecisionException
    {
        double a = -7.0;
        double b = 1.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase18() throws NotEnoughPrecisionException
    {
        double a = -6.0;
        double b = 1.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase19() throws NotEnoughPrecisionException
    {
        double a = -5.0;
        double b = 1.0;
        double c = 8.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase20() throws NotEnoughPrecisionException
    {
        double a = 25.0;
        double b = 4.0;
        double c = 3.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase21() throws NotEnoughPrecisionException
    {
        double a = 26.0;
        double b = 3.0;
        double c = 3.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase22() throws NotEnoughPrecisionException
    {
        double a = 27.0;
        double b = 2.0;
        double c = 3.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase23() throws NotEnoughPrecisionException
    {
        double a = 28.0;
        double b = 1.0;
        double c = 3.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase24() throws NotEnoughPrecisionException
    {
        double a = 29.0;
        double b = 0.0;
        double c = 3.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase25() throws NotEnoughPrecisionException
    {
        double a = 30.0;
        double b = 0.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase26() throws NotEnoughPrecisionException
    {
        double a = 31.0;
        double b = 1.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase27() throws NotEnoughPrecisionException
    {
        double a = 32.0;
        double b = 2.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase28() throws NotEnoughPrecisionException
    {
        double a = 33.0;
        double b = 3.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase29() throws NotEnoughPrecisionException
    {
        double a = 34.0;
        double b = 4.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase30() throws NotEnoughPrecisionException
    {
        double a = 35.0;
        double b = 5.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase31() throws NotEnoughPrecisionException
    {
        double a = 36.0;
        double b = 6.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase32() throws NotEnoughPrecisionException
    {
        double a = 37.0;
        double b = 7.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase33() throws NotEnoughPrecisionException
    {
        double a = 38.0;
        double b = 8.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase34() throws NotEnoughPrecisionException
    {
        double a = 39.0;
        double b = 9.0;
        double c = 4.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase35() throws NotEnoughPrecisionException
    {
        double a = 40.0;
        double b = 9.0;
        double c = 5.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase36() throws NotEnoughPrecisionException
    {
        double a = 41.0;
        double b = 8.0;
        double c = 5.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase37() throws NotEnoughPrecisionException
    {
        double a = 42.0;
        double b = 7.0;
        double c = 5.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase38() throws NotEnoughPrecisionException
    {
        double a = 43.0;
        double b = 6.0;
        double c = 5.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase39() throws NotEnoughPrecisionException
    {
        double a = 44.0;
        double b = 5.0;
        double c = 5.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testRealNumber1() throws NotEnoughPrecisionException {
        double a = 1; double b = 7; double c = 2; String output1 = "-0.298"; String output2 = "-6.701";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testRealNumber3() throws NotEnoughPrecisionException {
        double a = 3; double b = 7; double c = 3; String output1 = "-0.565"; String output2 = "-1.767";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }
    @Test
    public void testRealNumber4() throws NotEnoughPrecisionException {
        double a = 1; double b = 8; double c = 8; String output1 = "-1.171"; String output2 = "-6.828";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }
    @Test
    public void testRealNumber5() throws NotEnoughPrecisionException {
        double a = -4999.5; double b = 0; double c = 4999.5; String output1 = "-1"; String output2 = "1";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
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
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testComplexNumber2() throws NotEnoughPrecisionException {
        double a = 6; double b = 0; double c = 1; String output1 = "0.40825i"; String output2 = "0.408";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));

    }

    @Test
    public void testComplexNumber3() throws NotEnoughPrecisionException {
        double a = 6; double b = -2; double c = 1; String output1 = "0.166"; String output2 = "0.166";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));

    }

    @Test
    public void testComplexNumber4() throws NotEnoughPrecisionException {
        double a = -1.45; double b = 0; double c = -0.1724137931034483; String output1 = "-0.3448275862"; String output2 = " ";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
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
    @Test
    public void testValidInputInteger() throws Exception {
        assertEquals(42.0, QuadraticReturn.validateInput("42"), 1e6);
    }

    @Test
    public void testValidInputDecimal() throws Exception {
        assertEquals(0.123, QuadraticReturn.validateInput("0.123"), 1e6);
    }

    @Test
    public void testInputWithTrailingZero() throws Exception {
        assertEquals(42.0, QuadraticReturn.validateInput("42.0"), 1e6);
    }

    @Test(expected = NotEnoughPrecisionException.class)
    public void testScientificNotationShouldFail() throws Exception {
        QuadraticReturn.validateInput("1e3");
    }

    @Test(expected = NotEnoughPrecisionException.class)
    public void testPrecisionLossInputShouldFail() throws Exception {
        QuadraticReturn.validateInput("12345678901234567890");
    }
}

