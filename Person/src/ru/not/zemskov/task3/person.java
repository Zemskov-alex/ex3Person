package ru.not.zemskov.task3;

public final class person {
	String name;
	String surname;
		public void setName(String name) {
				if (name.isEmpty())	{
					System.out.println("Insert into your name!");
				} else {
				this.name = name;}
}
			String getName() {
				return name;
}
			public void setSurname(String surname) {
				if (surname.isEmpty())	{
					System.out.println("Insert into your surname");
				} else {
				this.surname = surname;}
	}
			String getSurname() {
				return surname;
	}


}


