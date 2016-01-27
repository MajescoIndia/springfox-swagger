package com.majesco.poc.model.mvr;

import java.math.BigDecimal;
import java.util.Date;

public class MvrLicense {

	    protected BigDecimal batchNo;
	    protected String createdBy;
	    protected Date creationDate;
	    protected String driverClass;
	    protected Date expiryDate;
	    protected String expiryDateFromResponse;
	    protected BigDecimal id;
	    protected String isDeleted;
	    protected Date issueDate;
	    protected String issueDateFromResponse;
	    protected String modifiedBy;
	    protected Date modifiedDate;
	    protected BigDecimal mvrResponseID;
	    protected BigDecimal orderNo;
	    protected String restrictions;
	    protected BigDecimal seqNo;
	    protected String status;
	    
		public BigDecimal getBatchNo() {
			return batchNo;
		}
		public void setBatchNo(BigDecimal batchNo) {
			this.batchNo = batchNo;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public Date getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		public String getDriverClass() {
			return driverClass;
		}
		public void setDriverClass(String driverClass) {
			this.driverClass = driverClass;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getExpiryDateFromResponse() {
			return expiryDateFromResponse;
		}
		public void setExpiryDateFromResponse(String expiryDateFromResponse) {
			this.expiryDateFromResponse = expiryDateFromResponse;
		}
		public BigDecimal getId() {
			return id;
		}
		public void setId(BigDecimal id) {
			this.id = id;
		}
		public String getIsDeleted() {
			return isDeleted;
		}
		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Date getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}
		public String getIssueDateFromResponse() {
			return issueDateFromResponse;
		}
		public void setIssueDateFromResponse(String issueDateFromResponse) {
			this.issueDateFromResponse = issueDateFromResponse;
		}
		public String getModifiedBy() {
			return modifiedBy;
		}
		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
		public Date getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}
		public BigDecimal getMvrResponseID() {
			return mvrResponseID;
		}
		public void setMvrResponseID(BigDecimal mvrResponseID) {
			this.mvrResponseID = mvrResponseID;
		}
		public BigDecimal getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(BigDecimal orderNo) {
			this.orderNo = orderNo;
		}
		public String getRestrictions() {
			return restrictions;
		}
		public void setRestrictions(String restrictions) {
			this.restrictions = restrictions;
		}
		public BigDecimal getSeqNo() {
			return seqNo;
		}
		public void setSeqNo(BigDecimal seqNo) {
			this.seqNo = seqNo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
}
