package com_14.interfaces;

class ChessFactory implements GameFactory {
	public Game getGame() {
		return new Chess();
	}
}
