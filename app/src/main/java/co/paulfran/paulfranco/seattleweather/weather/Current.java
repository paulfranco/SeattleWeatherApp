package co.paulfran.paulfranco.seattleweather.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import co.paulfran.paulfranco.seattleweather.R;

/**
 * Created by paulfranco on 3/24/18.
 */

public class Current {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getmIcon() {
        return mIcon;
    }


    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }

    public long getmTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formater = new SimpleDateFormat("h:mm a");
        formater.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date datetime = new Date(getmTime() * 1000);
        String timeString = formater.format(datetime);

        return timeString;
    }

    public void setmTime(long mTime) {
        this.mTime = mTime;
    }

    public int getmTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setmTemperature(double mTemperature) {
        this.mTemperature = mTemperature;
    }

    public double getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(double mHumidity) {
        this.mHumidity = mHumidity;
    }

    public int getmPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setmPrecipChance(double mPrecipChance) {
        this.mPrecipChance = mPrecipChance;
    }

    public String getmSummary() {
        return mSummary;
    }

    public void setmSummary(String mSummary) {
        this.mSummary = mSummary;
    }
}
