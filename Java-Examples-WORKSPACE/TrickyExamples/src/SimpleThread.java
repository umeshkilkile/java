class SimpleThread extends Thread {
	String action = "";

	public SimpleThread(String str) {
		this.action = str;
	}

	public void run() {
		doStuff(action);
	}

	public void doStuff(String action2) {
		//String action = "get";
		String status = "";

		synchronized (CheckFusionReportMutex.class) {

			System.out.println("action now is : " + action);
			if (action != null && action.equals("get")) {
				if (CheckFusionReportMutex.isFree()) {
					status = "free";
					CheckFusionReportMutex.setBusy();
				} else {
					status = "wait";
				}
			} else if (action != null && action.equals("free")) {
				CheckFusionReportMutex.setFree();
				status = "free";
			}
		}
		// Put the result in pipeline
		// IDataUtil.put(pipeline.getCursor(), "status", status);
		System.out.println("status : " + status);
		System.out.println("CheckFusionReportMutex isFree() : "	+ CheckFusionReportMutex.isFree());
	}

	// Class used to play checkFusionReportMutex
	public static class CheckFusionReportMutex {
		private static boolean isFree = true;

		public static boolean isFree() {
			return isFree;
		}

		public static void setFree() {
			isFree = true;
		}

		public static void setBusy() {
			isFree = false;
		}
	}
}
