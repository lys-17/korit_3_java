package ch13_adstraction.interfaces;

public class VolumeDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("볼륨을 한칸 내립니다");
    }

    @Override
    public void onDown() {
        System.out.println("볼륨을 계속 내립니다");
    }

}
