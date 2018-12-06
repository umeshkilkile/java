package com_14.interfaces;

class Implementation2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}
