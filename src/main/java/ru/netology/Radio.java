package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {

    private int currentVolume;
    private int currentChannel;
    private int quantityOfChannels = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int minChannelsNumber = 0;
    private int maxChannelsNumber = quantityOfChannels - 1;

    public Radio(int quantityOfChannels) {
        this.quantityOfChannels = quantityOfChannels;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannelsNumber) {
            currentChannel = maxChannelsNumber;
        }
        if (currentChannel > maxChannelsNumber) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {

        if (currentChannel < maxChannelsNumber) {
            currentChannel++;
        } else {
            currentChannel = minChannelsNumber;
        }
    }

    public void prevChannel() {

        if (currentChannel > minChannelsNumber) {
            currentChannel--;
        } else {
            currentChannel = maxChannelsNumber;
        }
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            return;
        }
    }
}