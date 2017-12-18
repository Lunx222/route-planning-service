package Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimeHelper {
    public static String transformTimeToFormat(Long time, String format){
        Date date = new Date();
        date.setTime(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String transformed = simpleDateFormat.format(date);
        System.out.println(transformed);
        return transformed;
    }

    public static Date fromStringToDate(String dateString){
        Long longTime = Long.parseLong(dateString);
        Date date = new Date();
        date.setTime(longTime);
        return date;
    }

    public static Date fromFormatStringToDate(String formatDate, String format){
        SimpleDateFormat parser = new SimpleDateFormat(format);
        Date date = new Date();
        try {
            date = parser.parse(formatDate);
        }catch (Exception e){
            e.printStackTrace();
        }
        return date;
    }

    public static List<Date> generateDateListFromFormatStringArray(String[] dateStrings, String format){
        List<Date> dates = new ArrayList<Date>();
        for(int i = 0; i< dateStrings.length ; i++){
            dates.add(TimeHelper.fromFormatStringToDate(dateStrings[i],format));
        }
        return dates;
    }

    public static Boolean isOnTheSameDay(Date toJudge,Date target){
        String orig = TimeHelper.transformTimeToFormat(toJudge.getTime(),"yyyy-MM-dd HH:mm:ss");
        String origDay = orig.split(" ")[0];
        String tar = TimeHelper.transformTimeToFormat(target.getTime(),"yyyy-MM-dd HH:mm:ss");
        String tarDay = tar.split(" ")[0];
        if(origDay.equals(tarDay)) return true;
        else return false;
    }

    public static Date fromUTCStamp(Long utcTime){
        Date date = new Date();
        date.setTime(utcTime*1000-28800000L);
        return date;
    }
}
