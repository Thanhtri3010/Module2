package _04_class_to_java.bai_tap.stop_watch;

import java.util.Arrays;

public class StopWatch {
    private long starTime, stopTime;

    public StopWatch() {
    }

    public long getStarttime() {
        return starTime;
    }

    public void setStarttime(long starttime) {
        this.starTime = starttime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public StopWatch(long starttime, long stoptime) {
        this.starTime = starttime;
        this.stopTime = stoptime;
    }

    public void star() {
        setStarttime(System.currentTimeMillis());
    }

    public void stop() {
        setStopTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return getStopTime() - getStarttime();
    }
}
