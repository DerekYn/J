package my.day18;

public class BottonMusic {

	@Override
	public String toString() {
		return "음악소리버튼";
	}
	
	public void musicClick() {
		ButtonMusicAction action = new ButtonMusicAction();
		action.click();
	}
	
	
}
