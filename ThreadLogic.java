package multithreading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadLogic implements Runnable {
	Thread t;
	int num;
	BufferedWriter bw;

	public ThreadLogic() {
		t = new Thread(this);

	}

	public ThreadLogic(BufferedWriter bw, int num) {
		super();
		t = new Thread(this);
		this.num = num;
		this.bw = bw;
	}

	@Override
	public void run() {
		synchronized (bw) {
			String s = "Divisor of " + num + " is ";
			try {
				bw.write(s);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					try {
						bw.write("" + i + ",");
						System.out.println(i);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				bw.newLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

}
