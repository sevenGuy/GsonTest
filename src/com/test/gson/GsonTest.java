package com.test.gson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Gson gson = new Gson();
		Message msg = new Message("me", "you", "hello.", "201603251020");
		//字符串转换为jsonObject对象
		JsonObject jsonObj = (JsonObject) new JsonParser().parse(gson.toJson(msg));
		//添加属性
		jsonObj.addProperty("newProperty", "newValue");
		
		System.out.println(gson.toJson(jsonObj));
		System.out.println(gson.toJson(msg));
		
		
	}

}

class Message{
	
	public Message(String sender,String reciever,String msg,String sendTime){
		this.msg = msg;
		this.reciver = reciever;
		this.sender = sender;
		this.sendTime = sendTime;
	}
	
	private String sender;
	private String reciver;
	private String msg;
	private String sendTime;
	
}

