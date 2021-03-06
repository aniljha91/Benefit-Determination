package com.ccsp.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ClaimData generated by hbm2java
 */
@Entity
@Table(name = "ClaimData", uniqueConstraints = @UniqueConstraint(columnNames = "AdminPlanId"))
public class ClaimData implements java.io.Serializable {

	@Id
	@Column(name = "NodeId", columnDefinition = "BINARY(254)", length = 254, unique = true, nullable = false)
	private byte[] nodeId;
	private int claimId;
	private int memberId;
	private String procedureCode;
	private String diagonisticCode;
	private BigDecimal billedAmount;
	private Date claimDate;
	private int adminPlanId;

	public ClaimData() {
	}

	public ClaimData(byte[] nodeId, int claimId, int memberId, String procedureCode, String diagonisticCode,
			BigDecimal billedAmount, Date claimDate, int adminPlanId) {
		this.nodeId = nodeId;
		this.claimId = claimId;
		this.memberId = memberId;
		this.procedureCode = procedureCode;
		this.diagonisticCode = diagonisticCode;
		this.billedAmount = billedAmount;
		this.claimDate = claimDate;
		this.adminPlanId = adminPlanId;
	}

	public byte[] getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(byte[] nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "ClaimId", nullable = false)
	public int getClaimId() {
		return this.claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	@Column(name = "MemberId", nullable = false)
	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Column(name = "ProcedureCode", nullable = false)
	public String getProcedureCode() {
		return this.procedureCode;
	}

	public void setProcedureCode(String procedureCode) {
		this.procedureCode = procedureCode;
	}

	@Column(name = "DiagonisticCode", nullable = false)
	public String getDiagonisticCode() {
		return this.diagonisticCode;
	}

	public void setDiagonisticCode(String diagonisticCode) {
		this.diagonisticCode = diagonisticCode;
	}

	@Column(name = "BilledAmount", nullable = false, precision = 10)
	public BigDecimal getBilledAmount() {
		return this.billedAmount;
	}

	public void setBilledAmount(BigDecimal billedAmount) {
		this.billedAmount = billedAmount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ClaimDate", nullable = false)
	public Date getClaimDate() {
		return this.claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	@Column(name = "AdminPlanId", unique = true, nullable = false)
	public int getAdminPlanId() {
		return this.adminPlanId;
	}

	public void setAdminPlanId(int adminPlanId) {
		this.adminPlanId = adminPlanId;
	}

}
