package com.javaex.ex06;

public class MyBase extends Base{

   public void service(String state) {
	   switch(state) {
	   		case "낮":
	   			System.out.println("낮에는 열심히 수업듣자");
	   			break;
	   		case "밤":
	   			System.out.println("밤에는 숙면");
	   			break;
	   		case "오후":
	   			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	   			break;
	   }
   }
    
}
