interface Camera{
    void click();
    public static void main(String[] args){
        Camera c = new Phone();
        c.click();
        MusicPlayer m = new Phone();
        m.playMusic();
    }
}
interface MusicPlayer{
    void playMusic();
    
}
class Phone implements Camera, MusicPlayer{
    @Override
    public void click(){
        System.out.println("Photo clicked");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
