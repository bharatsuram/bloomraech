package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RandomLists implements Runnable {

	final static int NUMBER_OF_THREADS = 5;

	public static synchronized List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int number = 1 + random.nextInt(100);
			list.add(number);
		}

		return list;
	}

	public static synchronized List<Integer> getSortedList(List<Integer> list) {

		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomLists randomlists = new RandomLists();

		ExecutorService threadPool = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
		for (int i = 0; i < 5; i++) {
			threadPool.submit(randomlists);
		}
		threadPool.shutdown();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Integer> list = getList();
		list = getSortedList(list);

	}

}
