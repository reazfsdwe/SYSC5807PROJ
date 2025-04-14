from z3 import *
import time
def test_RealNumber():
    s = Solver()
    a = Real('a')
    b = Real('b')
    c = Real('c')
    x1 = Real('x1')
    x2 = Real('x2')
    discriminant = b * b - 4 * a * c
    root1 = ((-b) + Sqrt(discriminant))/(2 * a)
    root2 = ((-b) - Sqrt(discriminant))/(2 * a)
    s.add(a != 0)
    s.add(discriminant > 0)
    s.add(discriminant != b * b)
    s.add(a > -5000, a < 5000)
    s.add(b > -5000, b < 5000)
    s.add(c > -5000, c < 5000)
    s.add(x1 == root1)
    s.add(x2 == root2)
    s.add(a * root1 * root1 + b * root1 + c == 0)
    s.add(a * root2 * root2 + b * root2 + c == 0)
    with open("QuadraticRealNumberTest.java", "w") as f:
        f.write("package quatest; \n")
        f.write("import org.junit.Test; \n")
        f.write("import static org.junit.Assert.*; \n")
        f.write("import qua.QuadraticReturn; \n")
        f.write("import qua.NotEnoughPrecisionException; \n")
        f.write("public class QuadraticTest { \n")
        for i in range(20):
            if s.check() == sat:
                m = s.model()
                a_val = float(m[a].as_decimal(10).replace("?", ""))
                b_val = float(m[b].as_decimal(10).replace("?", ""))
                c_val = float(m[c].as_decimal(10).replace("?", ""))

                f.write("@Test\n")
                f.write(f"    public void testCase{i}() throws NotEnoughPrecisionException \n")
                f.write(" { \n")
                f.write(f"        double a = {a_val};\n")
                f.write(f"        double b = {b_val};\n")
                f.write(f"        double c = {c_val};\n")
                f.write(f"        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);\n")
                f.write(f"        assertEquals(0.0, a * roots[0] * roots[0] + b * roots[0] + c, 1e6);\n")
                f.write(f"        assertEquals(0.0, a * roots[1] * roots[1] + b * roots[1] + c, 1e6);\n")
                f.write("    }\n\n")
                
            s.add(Or(a != m[a]))
        f.write("    }\n\n")

    
          
        

def test_ComplexNumber2():
    s = Solver()
    a = Real("a")
    b = Real("b")
    c = Real("c")
    
    discriminant = b * b - 4 * a * c
    s.add(discriminant < 0)
    s.add(a != 0)
    s.add(a > -5000, a < 5000)
    s.add(b > -5000, b < 5000)
    s.add(c > -5000, c < 5000)
    s.add(discriminant != b * b)
    with open("QuadraticComplexNumberTest.java", "w") as f:
        f.write("package quatest; \n")
        f.write("import org.junit.Test; \n")
        f.write("import static org.junit.Assert.*; \n")
        f.write("import qua.QuadraticReturn; \n")
        f.write("import qua.NotEnoughPrecisionException; \n")
        f.write("public class QuadraticTest { \n")
        for i in range(20):
            if s.check() == sat:
                m = s.model()
                a_val = float(m[a].as_decimal(10).replace("?", ""))
                b_val = float(m[b].as_decimal(10).replace("?", ""))
                c_val = float(m[c].as_decimal(10).replace("?", ""))

                f.write("@Test\n")
                f.write(f"    public void testCase{i}() throws NotEnoughPrecisionException \n")
                f.write(" { \n")
                f.write(f"        double a = {a_val};\n")
                f.write(f"        double b = {b_val};\n")
                f.write(f"        double c = {c_val};\n")
                f.write(f"        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);\n")
                f.write(f"        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);\n")
                
                f.write("    }\n\n")
                
            s.add(Or(a != m[a]))
        f.write("    }\n\n")




def get_month_name(month_number):
    months = {
        "01": "Jan", "02": "Feb", "03": "Mar", "04": "Apr",
        "05": "May", "06": "Jun", "07": "Jul", "08": "Aug",
        "09": "Sep", "10": "Oct", "11": "Nov", "12": "Dec"
    }
    return months.get(month_number, "Invalid")

def test_specialDate():
    y = Int('year')
    m = Int('month')
    d = Int('day')
    h24 = Int('hrs')
    min = Int('minute')
    sec= Int('second')
    s = Solver()
    
    s.add(y >= 1970, y <= 9999)
    s.add(m >= 1, m <= 12)
    s.add(d >= 1, d <= 31)
    s.add(h24 >= 0, h24 <= 24)
    s.add(min >= 0, min < 60)
    s.add(sec >= 0, sec < 60)
    s.add(Or(And(m == 2,Or(And(y % 4 == 0, y % 100 != 0), y % 400 == 0),d <= 29),And(m == 2,Not(Or(And(y % 4 == 0, y % 100 != 0), y % 400 == 0)),d <= 28),
    And(Or(m == 4, m == 6, m == 9, m == 11), d <= 30),
    And(Or(m == 1, m == 3, m == 5, m == 7, m == 8, m == 10, m == 12), d <= 31)
    ))
    
    if s.check() == sat:
        fl = 0
        with open("dateTestZ3Auto.java", "w") as f:
            f.write("package com.example.myapplication; \n")
            f.write("import java.time.LocalDateTime; \n")
            f.write("import org.junit.Test; \n")
            f.write("import static org.junit.Assert.*; \n")
            f.write("public class dateTestZ3Auto {\n")
            for i in range(10):
                if s.check() == sat:
                    mo = s.model()
                    
                    yearVal = mo[y].as_long()
                    monthVal = mo[m].as_long()
                    dayVal = mo[d].as_long()
                    h24Val = mo[h24].as_long()
                    minVal = mo[m].as_long()
                    secVal = mo[sec].as_long()
                    yyVal = mo[y].as_long()
                    yyVal = yyVal % 100
                    monthName = get_month_name(monthVal)
                    s.add(Or( y != yearVal, m != monthVal, d != dayVal))  
                    
                    h24Val = 0
                    minVal = 0
                    secVal = 0
                    h12Val = 0
                    minVal = 0
                    
                    if h24Val >= 12:
                        h12Val = h24Val - 12
                        aMPM = "PM"
                    else:
                        h12Val = h24Val
                        aMPM = "AM"
                    
                    if monthVal < 10:
                        monthVal = "0" + str(monthVal)
                    
                    if dayVal < 10:
                        dayVal = "0" + str(dayVal)
                    
                    if h12Val < 10:
                        h12Val = "0" + str(h12Val)

                    if h24Val < 10:
                        h24Val = "0" + str(h24Val)
                        
                    if minVal < 10:
                        minVal = "0" + str(minVal)
                    if secVal < 10:
                        secVal = "0" + str(secVal)
                    
                    monthName = get_month_name(str(monthVal))
                    
                    formats = {
                    "D_YYMMDD": f"{yyVal}-{monthVal}-{dayVal}",
                    "D_DDMMyy": f"{dayVal}-{monthVal}-{yyVal}",
                    "D_YYMMDD_N": f"{yyVal}-{monthName}-{dayVal}",
                    "D_DDMMyy_N": f"{dayVal}-{monthName}-{yyVal}",
                    "D_YYMMDDHHMMA_N": f"{yyVal}-{monthName}-{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "D_DDMMyyHHMMA_N": f"{dayVal}-{monthName}-{yyVal}, {h12Val}:{minVal}{aMPM}",
                    "S_YYMMDD": f"{yyVal}/{monthVal}/{dayVal}",
                    "S_DDMMyy": f"{dayVal}/{monthVal}/{yyVal}",
                    "S_YYMMDDHHMMA": f"{yyVal}/{monthVal}/{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "S_DDMMyyHHMMA": f"{dayVal}/{monthVal}/{yyVal}, {h12Val}:{minVal}{aMPM}",
                    "S_YYMMDDHHMMA_N": f"{yyVal}/{monthName}/{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "S_DDMMyyHHMMA_N": f"{dayVal}/{monthName}/{yyVal}, {h12Val}:{minVal}{aMPM}",
                    "D_YYYYMMDD": f"{yearVal}-{monthVal}-{dayVal}",
                    "D_DDMMYYYY": f"{dayVal}-{monthVal}-{yearVal}",
                    "D_YYYYMMDDHHMMA": f"{yearVal}-{monthVal}-{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "D_DDMMYYYYHHMMA": f"{dayVal}-{monthVal}-{yearVal}, {h12Val}:{minVal}{aMPM}",
                    "D_YYYYMMDD_N": f"{yearVal}-{monthName}-{dayVal}",
                    "D_DDMMYYYY_N": f"{dayVal}-{monthName}-{yearVal}",
                    "D_YYYYMMDDHHMMA_N": f"{yearVal}-{monthName}-{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "D_DDMMYYYYHHMMA_N": f"{dayVal}-{monthName}-{yearVal}, {h12Val}:{minVal}{aMPM}",
                    "S_YYYYMMDD": f"{yearVal}/{monthVal}/{dayVal}",
                    "S_DDMMYYYY": f"{dayVal}/{monthVal}/{yearVal}",
                    "S_YYYYMMDDHHMMA": f"{yearVal}/{monthVal}/{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "S_DDMMYYYYHHMMA": f"{dayVal}/{monthVal}/{yearVal}, {h12Val}:{minVal}{aMPM}",
                    "S_YYYYMMDDHHMMA_N": f"{yearVal}/{monthName}/{dayVal}, {h12Val}:{minVal}{aMPM}",
                    "S_DDMMYYYYHHMMA_N": f"{dayVal}/{monthName}/{yearVal}, {h12Val}:{minVal}{aMPM}",
                    "D_YYMMDDHHMMSSA_N": f"{yyVal}-{monthName}-{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "D_DDMMyyHHMMSSA_N": f"{dayVal}-{monthName}-{yyVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_YYMMDDHHMMSSA": f"{yyVal}/{monthVal}/{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_DDMMyyHHMMSSA": f"{dayVal}/{monthVal}/{yyVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_YYMMDDHHMMSSA_N": f"{yyVal}/{monthName}/{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_DDMMyyHHMMSSA_N": f"{dayVal}/{monthName}/{yyVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "D_YYYYMMDDHHMMSSA": f"{yearVal}-{monthVal}-{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "D_DDMMYYYYHHMMSSA": f"{dayVal}-{monthVal}-{yearVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "D_YYYYMMDDHHMMSSA_N": f"{yearVal}-{monthName}-{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "D_DDMMYYYYHHMMSSA_N": f"{dayVal}-{monthName}-{yearVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_YYYYMMDDHHMMSSA": f"{yearVal}/{monthVal}/{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_DDMMYYYYHHMMSSA": f"{dayVal}/{monthVal}/{yearVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_YYYYMMDDHHMMSSA_N": f"{yearVal}/{monthName}/{dayVal}, {h12Val}:{minVal}:{secVal}{aMPM}",
                    "S_DDMMYYYYHHMMSSA_N": f"{dayVal}/{monthName}/{yearVal}, {h12Val}:{minVal}:{secVal}{aMPM}"
                    }
                    

                    f.write("@Test\n")
                    f.write(f"    public void testCase{i}()\n")
                    f.write(" { \n")
                    f.write(f"String y = \"{yearVal}\";\n")
                    
                    f.write(f"String m = \"{monthVal}\";\n")
                    f.write(f"String d = \"{dayVal}\";\n")
                    f.write(f"String h12 = \"{h12Val}\";\n")
                    f.write(f"String h24 = \"{h24Val}\";\n")
                    f.write(f"String min = \"{minVal}\";\n")
                    f.write(f"String ampm = \"{aMPM}\";\n")
                    f.write(f"long expectedTimestamp = Datehelper.parseDate(\"{formats['D_YYYYMMDD']}\", Datehelper.DateFormats.D_YYYYMMDD); \n")
                    
                    for key, value in formats.items():
                        f.write(f"long ts{fl} = Datehelper.parseDate(\"{value}\", Datehelper.DateFormats.{key}); \n")
                        f.write(f"assertEquals(expectedTimestamp, ts{fl}, 1e6);\n")
                        fl += 1
                    f.write("    }\n\n")  
                    
            f.write("    }\n\n") 
        
test_specialDate()