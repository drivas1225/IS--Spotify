package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reproductor {

		@Id
		private long id;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		/*public boolean reproducirAleatoria()
		{
			return true;
			
		}
		
		public boolean reproducirSecuencial()
		{
			return true;
			
		}
		public boolean play()
		{
			return true;
			
		}
		
		public boolean stop()
		{
			return true;
			
		}
		*/
}
