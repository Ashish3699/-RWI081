package org.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private int answer_id;
	private String answer;
	
	@ManyToOne
	private Question que;

	public Answer(int answer_id, String answer ,Question question ) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.que = question;
	}

	public Answer() {
		super();
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", answer=" + answer + ", que=" + que + "]";
	}

	

}
