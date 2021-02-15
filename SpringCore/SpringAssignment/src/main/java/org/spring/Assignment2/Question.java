package org.spring.Assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	
	List <String> answersList;
	Set <String> answersSet;
	Map <Integer,String>answersMap;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	//List Getter and setter
	public List<String> getAnswersList() {
		System.out.println("List Answers: "+answersList);
		return answersList;
	}
	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}
	
	//Set getter and setter
	public Set<String> getAnswersSet() {
		System.out.println("Set Answers: "+answersSet);
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	
	//Map getter and setter
	public Map<Integer, String> getAnswersMap() {
		System.out.println("Map Answers: "+answersMap);
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	
	public void displayInfo() {
		System.out.println("Question Id: "+questionId);
		System.out.println("Question : "+question);
		
		System.out.println("===Answers of type List===");
		for (String s : answersList) {
			System.out.println(s);
		}
		
		System.out.println("===Answers of type Set===");
		for (String s : answersSet) {
			System.out.println(s);
		}
		
		System.out.println("===Answers of type Map===");
		 for (Map.Entry<Integer,String> entry: answersMap.entrySet()) {
			 System.out.println(entry);
		 }
		
	}
	
	
	
	
	

}
