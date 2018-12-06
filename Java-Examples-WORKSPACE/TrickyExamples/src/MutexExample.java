public class MutexExample {
	public static void main(String[] args) {
		// Get input parameter action
		// String action = IDataUtil.getString(pipeline.getCursor(), "action");
		String action = "get";
		String status = "";

		synchronized (CheckFusionReportMutex.class) {
			
			System.out.println("action : " + action);
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
		System.out.println("CheckFusionReportMutex isFree() : " + CheckFusionReportMutex.isFree());
		
		/*String action2 = "free";
		String status2 = "";

		synchronized (CheckFusionReportMutex.class) {
			
			System.out.println("action2 : " + action2);
			if (action2 != null && action2.equals("get")) {
				if (CheckFusionReportMutex.isFree()) {
					status2 = "free";
					CheckFusionReportMutex.setBusy();
				} else {
					status2 = "wait";
				}
			} else if (action2 != null && action2.equals("free")) {
				CheckFusionReportMutex.setFree();
				status2 = "free";
			}
		}
		// Put the result in pipeline
		// IDataUtil.put(pipeline.getCursor(), "status", status);
		System.out.println("status2 : " + status2);
		System.out.println("CheckFusionReportMutex isFree() : " + CheckFusionReportMutex.isFree());
*/
		
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
