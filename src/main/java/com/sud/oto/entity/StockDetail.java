package com.sud.oto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_detail")
public class StockDetail implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "STOCK_ID", unique = true)
	private Integer id;
	
	@Column(name = "compName")
	private String compName;
	
	@Column(name = "listedDate")
	private Date listedDate;

	public StockDetail() {
	}

	public StockDetail(String compName, Date listedDate) {
		this.compName = compName;
		this.listedDate = listedDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Date getListedDate() {
		return listedDate;
	}

	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}
	
}