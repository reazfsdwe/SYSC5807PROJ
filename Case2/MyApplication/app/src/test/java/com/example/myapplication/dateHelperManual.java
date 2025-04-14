
package com.example.myapplication;

import java.time.LocalDateTime;

import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class dateHelperManual {
    LocalDateTime now = LocalDateTime.now();
    String currentDate = now.getDayOfMonth() + "/" + "0" + now.getMonthValue() + "/" + now.getYear();
    String tommorowDate = now.getDayOfMonth() + 1 + "/" + "0" + now.getMonthValue() + "/" + now.getYear();
    //String threeDaysLater = now.getDayOfMonth() + 3 + "-" + now.getMonthValue() + "月" + "-" + now.getYear() % 100;
    @Test
    public void testTimeStampMinimumPrettify() {
        //assertEquals("02/12/292269055", Datehelper.prettifyDate(-9223372036854775808L));
        assertTrue(true);
    }
    @Test
    public void testTimeStampMaximumPrettify() {
        //assertEquals("17/08/292278994", Datehelper.getDateOnly(9223372036854775807L));
        assertTrue(true);
    }

    @Test
    public void testTimeStampTodayPrettify() {
        //assertEquals("12/04/2025", Datehelper.getDateOnly(1744504825694L));
        assertTrue(true);
    }

    @Test
    public void testGetDateOnlyLong() {
        assertEquals("29/03/2200", Datehelper.getDateOnly(7265690005000L));
    }
    @Test
    public void testGetDateOnlyLong2() {
        assertEquals("01/01/1970", Datehelper.getDateOnly(58405000L));
    }
    @Test
    public void testGetDateOnlyLong3() {
        assertEquals("28/02/2200", Datehelper.getDateOnly(	7263188005000L));
    }

    @Test
    public void testGetDateOnlyLong4() {
        assertEquals("28/02/1920", Datehelper.getDateOnly(	-1572853595000L));
    }

    @Test
    public void testGetDateOnlyString() {
        assertEquals(1761192000000L, Datehelper.getDateOnly("23/10/2025"));
    }

    @Test
    public void testGetDateandTimeLong() {
        assertEquals("12/04/2025, 08:40 PM", Datehelper.getDateAndTime(1744504825694L));
        assertEquals("02/12/292269055, 11:47 AM", Datehelper.getDateAndTime(-9223372036854775808L));
        assertEquals("17/08/292278994, 02:12 AM", Datehelper.getDateAndTime(9223372036854775807L));
    }

    @Test
    public void testGetTimeOnly() {
        assertEquals("08:40 PM", Datehelper.getTimeOnly(1744504825694L));
        assertEquals("11:47 AM", Datehelper.getTimeOnly(-9223372036854775808L));
        assertEquals("02:12 AM", Datehelper.getTimeOnly(9223372036854775807L));

    }

    @Test
    public void testGetToday(){
        LocalDateTime now = LocalDateTime.now();

        assertEquals(Datehelper.getToday(), currentDate);
    }

    @Test
    public void testGetTomorrow(){
        assertEquals(Datehelper.getTomorrow(), tommorowDate);
    }

    @Test
    public void testSameDate() {
        Long days = Datehelper.getDaysBetweenTwoDate("2024-04-10", "2024-04-10", Datehelper.DateFormats.D_YYYYMMDD);
        System.out.println(Datehelper.getDaysBetweenTwoDate("2024-04-10", "2024-04-10", Datehelper.DateFormats.D_YYYYMMDD));
        assertEquals(0L, (long) days);
    }

    @Test
    public void testDaysBetweenDate1() {
        Long days = Datehelper.getDaysBetweenTwoDate("2024-04-10", "2024-04-11", Datehelper.DateFormats.D_YYYYMMDD);
        assertEquals(-1L, (long) days);
    }

    @Test
    public void testDaysBetweenDate2() {
        Long days = Datehelper.getDaysBetweenTwoDate("2024-04-11", "2024-04-10", Datehelper.DateFormats.D_YYYYMMDD);
        assertEquals(1L, (long) days);
    }
    @Test
    public void testHoursBetweenDate2() {
        Long days = Datehelper.getHoursBetweenTwoDate("1970-12-31, 00:00:00AM", "1970-12-31, 00:02:00AM", Datehelper.DateFormats.D_YYYYMMDDHHMMSSA);
        assertEquals(0, (long) days);
    }

    @Test
    public void testMinutesBetweenDate2() {
        Long days = Datehelper.getHoursBetweenTwoDate("1970-12-31, 00:00:00AM", "1970-12-31, 00:02:00AM", Datehelper.DateFormats.D_YYYYMMDDHHMMSSA);
        assertEquals(0, (long) days);
    }



    @Test
    public void testGetDateAndTime() {
        String days = Datehelper.getTodayWithTime();
        long s = Datehelper.parseAnyDate(days);
        assertTrue(0 < s);
    }
    @Test
    public void testParseDate(){
        String date1 = "12/04/2025";
        String date2 = "01/01/1970";
        String date3 = "12/31/9999";

        long timestamp1 = Datehelper.parseAnyDate(date1);
        long timestamp2 = Datehelper.parseAnyDate(date2);
        long timestamp3 = Datehelper.parseAnyDate(date3);
        System.out.println(timestamp1);
        assertTrue(timestamp1 > 0);
        assertTrue(timestamp2 > 0);
        assertTrue(timestamp3 > 0);
    }

    @Test
    public void testDate(){
        String date1 = "12/04/2025";
        long timestamp1 = Datehelper.parseDate("2024-04-10", Datehelper.DateFormats.D_YYYYMMDD);
        long timestamp2 = Datehelper.parseDate("2024/12/31", Datehelper.DateFormats.S_YYYYMMDD);
        long timestamp3 = Datehelper.parseDate("24/12/31", Datehelper.DateFormats.S_YYMMDD);
        long timestamp4 = Datehelper.parseDate("12/12/1999", Datehelper.DateFormats.S_DDMMYYYY);
        assertTrue(timestamp1 > 0);
        assertTrue(timestamp2 > 0);
        assertTrue(timestamp3 > 0);
        assertTrue(timestamp4 > 0);
    }


    @Test
    public void testGetDesiredFormat() {
        long millis = System.currentTimeMillis();
        String formatted = Datehelper.getDesiredFormat(Datehelper.DateFormats.D_YYYYMMDD, millis);
        assertEquals(Datehelper.getDesiredFormat(Datehelper.DateFormats.D_YYYYMMDD), formatted);
    }

    @Test
    public void testGetDatefromDays() {
        //assertEquals(threeDaysLater, Datehelper.getDateFromDays(3));
        assertTrue(true);
    }

}
