package Item2;

public class Calzone extends Pizza {

	private final boolean sauseInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false;// Default

		/*
		 * Calzone.Builder build method returns Calzone. This technique, wherein
		 * a subclass method is declared to return a subtype of the return type
		 * declared in the super-class, is known as covariant return typing. It
		 * allows clients to use these builders without the need for casting.
		 */
		@Override
		Calzone build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}
	}

	private Calzone(Builder builder) {
		super(builder);
		sauseInside = builder.sauceInside;
	}

	@Override
	public String toString() {
		return "Calzone [sauseInside=" + sauseInside + "]";
	}
}
