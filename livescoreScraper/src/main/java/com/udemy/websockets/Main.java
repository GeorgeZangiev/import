package com.udemy.websockets;

public class Main {

	public static void main(String[] args) throws Exception{
		final Hltv_Livescore hltv = new Hltv_Livescore("wss://cf1-scorebot.hltv.org/socket.io/?EIO=3&transport=websocket&sid=1fce44d0-17e2-433b-a9bf-08e34912cf2a");
		hltv.connect();
	}
}
