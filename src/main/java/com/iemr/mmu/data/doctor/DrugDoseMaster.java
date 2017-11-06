package com.iemr.mmu.data.doctor;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "m_drugdose")
public class DrugDoseMaster {
	@Id
	@GeneratedValue
	@Expose
	@Column(name = "DrugDoseID")
	private Integer drugDoseID;
	@Expose
	@Column(name = "DrugDose")
	private String drugDose;
	@Expose
	@Column(name = "DrugDoseDesc")
	private String drugDoseDesc;
	@Expose
	@Column(name = "DrugFormID")
	private Integer drugFormID;
	@Expose
	@Column(name = "Deleted", insertable = false, updatable = false)
	private Boolean deleted;
	@Expose
	@Column(name = "Processed", insertable = false, updatable = false)
	private Character processed;
	@Expose
	@Column(name = "CreatedBy")
	private String createdBy;
	@Expose
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;
	@Expose
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Expose
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;

	public DrugDoseMaster() {
	}

	public DrugDoseMaster(Integer drugDoseID, String drugDose, String drugDoseDesc, Integer drugFormID, Boolean deleted,
			Character processed, String createdBy, Timestamp createdDate, String modifiedBy, Timestamp lastModDate) {
		super();
		this.drugDoseID = drugDoseID;
		this.drugDose = drugDose;
		this.drugDoseDesc = drugDoseDesc;
		this.drugFormID = drugFormID;
		this.deleted = deleted;
		this.processed = processed;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModDate = lastModDate;
	}

	public Integer getDrugDoseID() {
		return drugDoseID;
	}

	public void setDrugDoseID(Integer drugDoseID) {
		this.drugDoseID = drugDoseID;
	}

	public String getDrugDose() {
		return drugDose;
	}

	public void setDrugDose(String drugDose) {
		this.drugDose = drugDose;
	}

	public String getDrugDoseDesc() {
		return drugDoseDesc;
	}

	public void setDrugDoseDesc(String drugDoseDesc) {
		this.drugDoseDesc = drugDoseDesc;
	}

	public Integer getDrugFormID() {
		return drugFormID;
	}

	public void setDrugFormID(Integer drugFormID) {
		this.drugFormID = drugFormID;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Character getProcessed() {
		return processed;
	}

	public void setProcessed(Character processed) {
		this.processed = processed;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Timestamp lastModDate) {
		this.lastModDate = lastModDate;
	}

}
