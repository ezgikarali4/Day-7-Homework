package com.example.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		@Column(name = "id")
		private int id;
		
		@Column(name = "password")
		private String password;

		@Column(name = "password_repeat")
		private String passwordRepeat;
		
		@Column(name = "is_active")
		private boolean isActive;
		
		@Column(name = "is_deleted")
		private boolean isDeleted;
		
		public User(){
			
		}

		public User(int id, String password, String passwordRepeat, boolean isActive, boolean isDeleted) {
			super();
			this.id = id;
			this.password = password;
			this.passwordRepeat = passwordRepeat;
			this.isActive = isActive;
			this.isDeleted = isDeleted;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPasswordRepeat() {
			return passwordRepeat;
		}

		public void setPasswordRepeat(String passwordRepeat) {
			this.passwordRepeat = passwordRepeat;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public boolean isDeleted() {
			return isDeleted;
		}

		public void setDeleted(boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
}
