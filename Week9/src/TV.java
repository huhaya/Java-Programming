public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean powerOn=false;
    public TV(){

    }
    public void turnOn(){
        powerOn=true;
    }
    public void turnOff(){
        powerOn=false;
    }
    public void setChannel(int newChannel){
        if(powerOn && newChannel>=1 && newChannel<=7){
           channel=newChannel;
        }
    }
    public void setVolumeLevel(int newVolumeLevel){
        if(powerOn && newVolumeLevel>=1 && newVolumeLevel<=7){
            channel=newVolumeLevel;
        }
    }
    public int channelUp(){
        return channel+1;
    }
    public int volumeLevelUp(){
        return volumeLevel+1;
    }
}
