package br.unibh.sdm.backend_needhelp.entidades;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "cliente")
public class Cliente {
	
		private int id;
		private String nome;
		private String cpf;
		
		public Cliente() {
			super();
		}

		public Cliente(int id, String nome, String cpf) {
			super();
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			result = prime * result + id;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			if (id != other.id)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}

		@DynamoDBHashKey
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@DynamoDBAttribute
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		@DynamoDBAttribute
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
		}
		
		
		

}
