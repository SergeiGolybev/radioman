package ru.netology;

public class Radio {

    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            currentChannel = 9;
        }
        if (currentChannel > 9) {
            currentChannel = 0;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {

        if (currentChannel < 9) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {

        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
