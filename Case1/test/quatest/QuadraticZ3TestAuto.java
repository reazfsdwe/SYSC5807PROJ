package quatest;
import org.junit.Test;
import static org.junit.Assert.*;
import qua.QuadraticReturn;
import qua.Quadratic;
import qua.NotEnoughPrecisionException;
public class QuadraticZ3TestAuto {
    @Test
    public void testCase0() throws NotEnoughPrecisionException
    {
        double a = -3333.0;
        double b = -4999.5;
        double c = -1666.5;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase1() throws NotEnoughPrecisionException
    {
        double a = -3332.0;
        double b = -4998.0;
        double c = -1666.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase2() throws NotEnoughPrecisionException
    {
        double a = -4999.0;
        double b = -4999.6102294921;
        double c = -0.6102294921;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase3() throws NotEnoughPrecisionException
    {
        double a = 1.0;
        double b = 4999.0;
        double c = 4998.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase4() throws NotEnoughPrecisionException
    {
        double a = -4999.5;
        double b = 0.0;
        double c = 4999.5;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase5() throws NotEnoughPrecisionException
    {
        double a = -3332.5;
        double b = -4998.75;
        double c = -1666.25;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase6() throws NotEnoughPrecisionException
    {
        double a = -3332.25;
        double b = -4998.375;
        double c = -1666.125;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase7() throws NotEnoughPrecisionException
    {
        double a = -3332.75;
        double b = -4999.125;
        double c = -1666.375;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase8() throws NotEnoughPrecisionException
    {
        double a = -3332.875;
        double b = -4999.3125;
        double c = -1666.4375;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase9() throws NotEnoughPrecisionException
    {
        double a = -4999.75;
        double b = 0.0;
        double c = 4999.75;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase10() throws NotEnoughPrecisionException
    {
        double a = -3332.625;
        double b = 0.0;
        double c = 3332.625;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase11() throws NotEnoughPrecisionException
    {
        double a = -3332.5625;
        double b = -4998.84375;
        double c = -1666.28125;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase12() throws NotEnoughPrecisionException
    {
        double a = -3332.59375;
        double b = 0.0;
        double c = 3332.59375;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase13() throws NotEnoughPrecisionException
    {
        double a = 0.5;
        double b = 4999.5;
        double c = 4999.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase14() throws NotEnoughPrecisionException
    {
        double a = -3332.8125;
        double b = 0.0;
        double c = 3332.8125;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase15() throws NotEnoughPrecisionException
    {
        double a = -4998.0;
        double b = -4999.2202148437;
        double c = -1.2202148437;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase16() throws NotEnoughPrecisionException
    {
        double a = -3332.6875;
        double b = -4999.03125;
        double c = -1666.34375;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase17() throws NotEnoughPrecisionException
    {
        double a = -3332.125;
        double b = -4998.1875;
        double c = -1666.0625;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase18() throws NotEnoughPrecisionException
    {
        double a = -3332.375;
        double b = -4998.5625;
        double c = -1666.1875;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }

    @Test
    public void testCase19() throws NotEnoughPrecisionException
    {
        double a = -3332.78125;
        double b = 0.0;
        double c = 3332.78125;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);
        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);
    }


    @Test
    public void testCase20() throws NotEnoughPrecisionException
    {
        double a = -0.25;
        double b = 0.0;
        double c = -1.0;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase21() throws NotEnoughPrecisionException
    {
        double a = -1.25;
        double b = 0.0;
        double c = -0.2;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase23() throws NotEnoughPrecisionException
    {
        double a = -1.45;
        double b = 0.0;
        double c = -0.1724137931;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase24() throws NotEnoughPrecisionException
    {
        double a = -1.6224137931;
        double b = 0.0;
        double c = -0.1540913921;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase25() throws NotEnoughPrecisionException
    {
        double a = -1.7765051852;
        double b = 0.0;
        double c = -0.1407257361;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase26() throws NotEnoughPrecisionException
    {
        double a = -1.9172309214;
        double b = 0.0;
        double c = -0.1303963947;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase27() throws NotEnoughPrecisionException
    {
        double a = -2.0476273161;
        double b = 0.0;
        double c = -0.1220925302;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase28() throws NotEnoughPrecisionException
    {
        double a = -2.1697198463;
        double b = 0.0;
        double c = -0.1152222488;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase29() throws NotEnoughPrecisionException
    {
        double a = -2.2849420951;
        double b = 0.0;
        double c = -0.109411963;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase210() throws NotEnoughPrecisionException
    {
        double a = -2.3943540581;
        double b = 0.0;
        double c = -0.104412294;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase211() throws NotEnoughPrecisionException
    {
        double a = -2.4987663522;
        double b = 0.0;
        double c = -0.1000493702;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase212() throws NotEnoughPrecisionException
    {
        double a = -2.5988157225;
        double b = 0.0;
        double c = -0.0961976633;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase213() throws NotEnoughPrecisionException
    {
        double a = -2.6950133858;
        double b = 0.0;
        double c = -0.0927639177;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase214() throws NotEnoughPrecisionException
    {
        double a = -2.7877773036;
        double b = 0.0;
        double c = -0.0896771774;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase215() throws NotEnoughPrecisionException
    {
        double a = -2.877454481;
        double b = 0.0;
        double c = -0.0868823474;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase216() throws NotEnoughPrecisionException
    {
        double a = -2.9643368285;
        double b = 0.0;
        double c = -0.0843358951;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase217() throws NotEnoughPrecisionException
    {
        double a = -3.0486727236;
        double b = 0.0;
        double c = -0.0820028985;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase218() throws NotEnoughPrecisionException
    {
        double a = -3.1306756222;
        double b = 0.0;
        double c = -0.0798549674;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testCase219() throws NotEnoughPrecisionException
    {
        double a = -3.2105305896;
        double b = 0.0;
        double c = -0.0778687487;
        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);
        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);
    }

    @Test
    public void testRealNumber1() throws NotEnoughPrecisionException {
        double a = -3333; double b = -4999.5; double c = -1666.5; String output1 = "-1"; String output2 = "-0.5";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testRealNumber2() throws NotEnoughPrecisionException {
        double a = -3332; double b = -4998; double c = -1666; String output1 = "-1"; String output2 = "-0.5";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }

    @Test
    public void testRealNumber3() throws NotEnoughPrecisionException {
        double a = -3332; double b = -4998; double c = -1666; String output1 = "-1"; String output2 = "-0.5";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1));
        assertTrue(output.contains(output2));
    }
    @Test
    public void testRealNumber4() throws NotEnoughPrecisionException {
        double a = 1; double b = 4999; double c = 4998; String output1 = "-1"; String output2 = "-4998";
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
        double a = -0.25; double b = 0; double c = -1; String output1 = "0"; String output2 = "2i";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testComplexNumber3() throws NotEnoughPrecisionException {
        double a = -1.25; double b = 0; double c = -0.2; String output1 = "0.4i"; String output2 = " ";
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
        QuadraticReturn.solveQuadratic(a,b,c);
        String output = out.toString().trim();
        assertTrue(output.contains(output1) || output.contains(output2));
        
    }

    @Test
    public void testTooLargeNumberNotAllowed() throws NotEnoughPrecisionException{
        double a = 1; double b = 4999; double c = 4998; String output1 = "-4998";
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        QuadraticReturn.solveQuadratic(a,b,c);
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

