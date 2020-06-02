package ru.not.zemskov.task3;

import java.time.LocalDate;

public final class emailmessage extends mesage{
	LocalDate sendDate;
	LocalDate reciveDate;
	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
 	}
	LocalDate getSendDate() {
		return sendDate;
	}
	public void setReciveDate(LocalDate reciveDate) {
		this.reciveDate = reciveDate;
 	}
	LocalDate getReciveDate() {
		return reciveDate;
	}
}

