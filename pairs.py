from allpairspy import AllPairs
import datetime
def generateQuadraticTestCase():
    with open("QuadraticComplexNumberTestComb.java", "w") as f:
        f.write("package quatest; \n")
        f.write("import org.junit.Test; \n")
        f.write("import static org.junit.Assert.*; \n")
        f.write("import qua.QuadraticReturn; \n")
        f.write("import qua.NotEnoughPrecisionException; \n")
        f.write("public class QuadraticTestCombAuto { \n")
        r = []
        rr = []
        rc = []
        parameters = [[a for a in range(-10,100)], [b for b in range(10)], [c for c in range(10)]]
        for x, pairs in enumerate(AllPairs(parameters)):
            r.append(pairs)
        for i in range(len(r)):
            if (r[i][1] * r[i][1] - 4 * r[i][0] * r[i][2] >= 0 )and (int(r[i][0]) != 0) and (r[i][1] * r[i][1] - 4 * r[i][0] * r[i][2] != r[i][1] * r[i][1]):
                rr.append(r[i])
            elif (r[i][1] * r[i][1] - 4 * r[i][0] * r[i][2] < 0 )and (int(r[i][0]) != 0) and (r[i][1] * r[i][1] - 4 * r[i][0] * r[i][2] != r[i][1] * r[i][1]):
                rc.append(r[i])
        for i in range(20):
            a_val = float(rr[i][0])
            b_val = float(rr[i][1])
            c_val = float(rr[i][2])

            f.write("@Test\n")
            f.write(f"    public void testCase{i}() throws NotEnoughPrecisionException \n")
            f.write(" { \n")
            f.write(f"        double a = {a_val};\n")
            f.write(f"        double b = {b_val};\n")
            f.write(f"        double c = {c_val};\n")
            f.write(f"        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);\n")
            f.write(f"        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);\n")
            
            f.write("    }\n\n")
         

        for i in range(20,40):
            a_val = float(rc[i][0])
            b_val = float(rc[i][1])
            c_val = float(rc[i][2])

            f.write("@Test\n")
            f.write(f"    public void testCase{i}() throws NotEnoughPrecisionException \n")
            f.write(" { \n")
            f.write(f"        double a = {a_val};\n")
            f.write(f"        double b = {b_val};\n")
            f.write(f"        double c = {c_val};\n")
            f.write(f"        double[] roots = QuadraticReturn.solveQuadraticR(a, b, c);\n")
            f.write(f"        assertTrue(a * roots[0] * roots[0] + b * roots[0] + c < 1e6);\n")
            
            f.write("    }\n\n")
        f.write("    }\n\n")  

    
generateQuadraticTestCase()



def get_month_name(month_number):
    months = {
        "01": "Jan", "02": "Feb", "03": "Mar", "04": "Apr",
        "05": "May", "06": "Jun", "07": "Jul", "08": "Aug",
        "09": "Sep", "10": "Oct", "11": "Nov", "12": "Dec"
    }
    return months.get(month_number, "Invalid")

def generateSpecialDateTestCase():

    with open("dateTestCombAuto.java", "w") as f:
        f.write("package com.example.myapplication; \n")
        f.write("import java.time.LocalDateTime; \n")
        f.write("import org.junit.Test; \n")
        f.write("import static org.junit.Assert.*; \n")
        f.write("public class dateTestCombAuto {\n")
        r = []
        rr = []
        parameters = [[1920, 1970, 9998, 2000, 2200], [2,3,4,5], [29, 31], [0], [0],[0]]
        
        for x, pairs in enumerate(AllPairs(parameters)):
            r.append(pairs)
        for i in range(len(r)):
            try:
                datetime.date(r[i][0], r[i][1], r[i][2])
                rr.append(r[i])
            except:
                continue
        fl = 0
        fi = 0
        for all in rr:
            
            print(all)
            yearVal = all[0]
            monthVal = all[1]
            dayVal = all[2]
            h24Val = 0
            minVal = 0
            secVal = 0
            yyVal = yearVal % 100
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
            if yyVal == 0:
                yyVal = "0" + str(yyVal)
            if yearVal <= 2000 or yearVal > 2100:
                yearVal = "1970"
                monthVal = "01"
                dayVal = "01"
                yyVal = 70
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
            f.write(f"    public void testCase{fi}()\n")
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
                fl += 1
                f.write(f"long ts{fl} = Datehelper.parseDate(\"{value}\", Datehelper.DateFormats.{key}); \n")
                f.write(f"assertEquals(expectedTimestamp, ts{fl}, 1e6);\n")
                fl += 1
            f.write("    }\n\n")  
            fi += 1
        f.write("    }\n\n")  
generateSpecialDateTestCase()



        
           


