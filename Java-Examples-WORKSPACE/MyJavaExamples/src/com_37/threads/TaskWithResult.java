package com_37.threads;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {

	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of taskWithResult " + id;
	}

}
