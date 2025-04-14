import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateHelper {

    public enum DateFormats {
        D_YYMMDD("yy-MM-dd"), D_DDMMyy("dd-MM-yy"),
        D_YYMMDD_N("yy-MMM-dd"), D_DDMMyy_N("dd-MMM-yy"),
        D_YYMMDDHHMMA_N("yy-MMM-dd, hh:mma"), D_DDMMyyHHMMA_N("dd-MMM-yy, hh:mma"),
        S_YYMMDD("yy/MM/dd"), S_DDMMyy("dd/MM/yy"),
        S_YYMMDDHHMMA("yy/MM/dd, hh:mma"), S_DDMMyyHHMMA("dd/MM/yy, hh:mma"),
        S_YYMMDDHHMMA_N("yy/MMM/dd, hh:mma"), S_DDMMyyHHMMA_N("dd/MMM/yy, hh:mma"),
        D_YYYYMMDD("yyyy-MM-dd"), D_DDMMYYYY("dd-MM-yyyy"),
        D_YYYYMMDDHHMMA("yyyy-MM-dd, hh:mma"), D_DDMMYYYYHHMMA("dd-MM-yyyy, hh:mma"),
        D_YYYYMMDD_N("yyyy-MMM-dd"), D_DDMMYYYY_N("dd-MMM-yyyy"),
        D_YYYYMMDDHHMMA_N("yyyy-MMM-dd, hh:mma"), D_DDMMYYYYHHMMA_N("dd-MMM-yyyy, hh:mma"),
        S_YYYYMMDD("yyyy/MM/dd"), S_DDMMYYYY("dd/MM/yyyy"),
        S_YYYYMMDDHHMMA("yyyy/MM/dd, hh:mma"), S_DDMMYYYYHHMMA("dd/MM/yyyy, hh:mma"),
        S_YYYYMMDDHHMMA_N("yyyy/MMM/dd, hh:mma"), S_DDMMYYYYHHMMA_N("dd/MMM/yyyy, hh:mma"),
        D_YYMMDDHHMMSSA_N("yy-MMM-dd, hh:mm:ssa"), D_DDMMyyHHMMSSA_N("dd-MMM-yy, hh:mm:ssa"),
        S_YYMMDDHHMMSSA("yy/MM/dd, hh:mm:ssa"), S_DDMMyyHHMMSSA("dd/MM/yy, hh:mm:ssa"),
        S_YYMMDDHHMMSSA_N("yy/MMM/dd, hh:mm:ssa"), S_DDMMyyHHMMSSA_N("dd/MMM/yy, hh:mm:ssa"),
        D_YYYYMMDDHHMMSSA("yyyy-MM-dd, hh:mm:ssa"), D_DDMMYYYYHHMMSSA("dd-MM-yyyy, hh:mm:ssa"),
        D_YYYYMMDDHHMMSSA_N("yyyy-MMM-dd, hh:mm:ssa"), D_DDMMYYYYHHMMSSA_N("dd-MMM-yyyy, hh:mm:ssa"),
        S_YYYYMMDDHHMMSSA("yyyy/MM/dd, hh:mm:ssa"), S_DDMMYYYYHHMMSSA("dd/MM/yyyy, hh:mm:ssa"),
        S_YYYYMMDDHHMMSSA_N("yyyy/MMM/dd, hh:mm:ssa"), S_DDMMYYYYHHMMSSA_N("dd/MMM/yyyy, hh:mm:ssa"),
        HHMMA("hh:mma"), HHMM("hh:mm"), HHMMSSA("hh:mm:ssa"), HHMMSS("hh:mm:ss");

        private String dateFormat;

        DateFormats(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        public String getDateFormat() {
            return dateFormat;
        }
    }

    public static String prettifyDate(long timestamp) {
        Calendar cal = Calendar.getInstance();
        Calendar inputCal = Calendar.getInstance();
        inputCal.setTimeInMillis(timestamp);

        SimpleDateFormat dateFormat;
        if (cal.get(Calendar.YEAR) == inputCal.get(Calendar.YEAR)
                && cal.get(Calendar.DAY_OF_YEAR) == inputCal.get(Calendar.DAY_OF_YEAR)) {
            dateFormat = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        } else {
            dateFormat = new SimpleDateFormat("dd MMM hh:mm a", Locale.getDefault());
        }
        return dateFormat.format(timestamp);
    }

    public static String prettifyDate(String timestamp) {
        return prettifyDate(Long.parseLong(timestamp));
    }

    public static long getDateOnly(String date) {
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        try {
            return sample.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getDateOnly(long time) {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(time);
    }

    public static String getDateAndTime(long time) {
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy, hh:mm a", Locale.getDefault());
        return sample.format(new Date(time));
    }

    public static String getTimeOnly(long time) {
        SimpleDateFormat sample = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        return sample.format(time);
    }

    public static String getTodayWithTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        return dateFormat.format(new Date());
    }

    public static String getToday() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dateFormat.format(new Date());
    }

    public static String getTomorrow() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).parse(getToday()));
            calendar.add(Calendar.DATE, 1);
            return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(calendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Long getDaysBetweenTwoDate(String old, String newDate, DateFormats dateFormats) {
        return getDiffBetweenDates(old, newDate, dateFormats, TimeUnit.DAYS);
    }

    public static Long getHoursBetweenTwoDate(String old, String newDate, DateFormats dateFormats) {
        return getDiffBetweenDates(old, newDate, dateFormats, TimeUnit.HOURS);
    }

    public static Long getMinutesBetweenTwoDates(String old, String newDate, DateFormats dateFormats) {
        return getDiffBetweenDates(old, newDate, dateFormats, TimeUnit.MINUTES);
    }

    private static Long getDiffBetweenDates(String old, String newDate, DateFormats dateFormats, TimeUnit unit) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormats.getDateFormat(), Locale.getDefault());
        try {
            Date date1 = format.parse(old);
            Date date2 = format.parse(newDate);
            long diff = date1.getTime() - date2.getTime();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long parseAnyDate(String date) {
        for (DateFormats formats : DateFormats.values()) {
            try {
                SimpleDateFormat format = new SimpleDateFormat(formats.getDateFormat(), Locale.getDefault());
                return format.parse(date).getTime();
            } catch (Exception ignored) {}
        }
        return 0;
    }

    public static long parseDate(String date, DateFormats dateFormats) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormats.getDateFormat(), Locale.getDefault());
        try {
            return format.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getDesiredFormat(DateFormats formats) {
        return getDesiredFormat(formats, new Date().getTime());
    }

    public static String getDesiredFormat(DateFormats formats, long date) {
        SimpleDateFormat format = new SimpleDateFormat(formats.getDateFormat(), Locale.getDefault());
        return format.format(date);
    }

    public static String getDateFromDays(int numOfDays) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, numOfDays);
        return getDesiredFormat(DateFormats.D_DDMMyy_N, cal.getTimeInMillis());
    }
}
