/**
 * 
 */

/**
 * @author ukilkil
 *
 */
public enum T7744_PRC_RCM_RVW_STS_TYP {
	PENDING_REVIEW(1), FAILED_RESOLVABLE_ERROR(2), UNRESOLVABLE_ERROR(3), OVERRIDE(4), EDIT_FAILED(5), AMEND(
			6), WITHDRAW(7), REVIEWED(8), EXECUTED(9);

	private final int t7744PrcRcmRvwStsTyp;

	T7744_PRC_RCM_RVW_STS_TYP(int t7744PrcRcmRvwStsTyp) {
		this.t7744PrcRcmRvwStsTyp = t7744PrcRcmRvwStsTyp;
	}

	public int getPrcRcmRvwStsTyp() {
		return this.t7744PrcRcmRvwStsTyp;
	}
}
