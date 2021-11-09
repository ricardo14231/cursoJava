package com.ricardo.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tarefa")
public class TarefaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String terefa;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate data;

	@Column
	private Date criadoEm;
	
	@PrePersist
	protected void onCreate() {
		criadoEm = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTerefa() {
		return terefa;
	}

	public void setTerefa(String terefa) {
		this.terefa = terefa;
	}

	public Calendar getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Calendar createAt) {
		this.createAt = createAt;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date created) {
		this.criadoEm = created;
	}
	
		
}
