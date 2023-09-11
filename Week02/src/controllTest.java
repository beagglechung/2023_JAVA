interface controllable  {
	void play();
	void stop();
}

public class controllTest {
	public static void main(String arg[]) {
		controllable c = new controllable() {
			public void play() {
				System.out.println("PLAY");
			}

			public void stop() {
				System.out.println("STOP");
			}
			
		};
		c.play();
		c.stop();
	}
}