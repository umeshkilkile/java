package com_14.interfaces;

class CheckersFactory implements GameFactory {
	public Game getGame() {
		return new Checkers();
	}
}