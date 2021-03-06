package com.wellsfargo.serv_req_center.task_management.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Base class for all Tasks
 * Includes Common fields related to all tasks
 * @author Heta Shah
 *
 */
public class ServiceRequestTask implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String taskType;
	private String taskSpecific;
	private String workflowStep;
	private String accountNo;
	private String accountName;
	private String requesterName;
	private String dueDate;
	private String status;
	private String phone;
	private String createdDate;
	private Account accountDetail;
	private String email;
	private String assignedUserGroup;
	private String assignedEmail;
	private String accountService;
	private List<Document> documents;

	public ServiceRequestTask() {

	}

	public ServiceRequestTask(long id, String taskType, String taskSpecific, String workflowStep, String accountNo,
			String accountName, String requesterName, String dueDate, String status, String phone, String createdDate,
			Account accountDetail, String email, String assignedUserGroup, String assignedEmail, String accountService,
			List<Document> documents) {
		super();
		this.id = id;
		this.taskType = taskType;
		this.taskSpecific = taskSpecific;
		this.workflowStep = workflowStep;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.requesterName = requesterName;
		this.dueDate = dueDate;
		this.status = status;
		this.phone = phone;
		this.createdDate = createdDate;
		this.accountDetail = accountDetail;
		this.email = email;
		this.assignedUserGroup = assignedUserGroup;
		this.assignedEmail = assignedEmail;
		this.accountService = accountService;
		this.documents = documents;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskSpecific() {
		return taskSpecific;
	}

	public void setTaskSpecific(String taskSpecific) {
		this.taskSpecific = taskSpecific;
	}

	public String getWorkflowStep() {
		return workflowStep;
	}

	public void setWorkflowStep(String workflowStep) {
		this.workflowStep = workflowStep;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Account getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(Account accountDetail) {
		this.accountDetail = accountDetail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssignedUserGroup() {
		return assignedUserGroup;
	}

	public void setAssignedUserGroup(String assignedUserGroup) {
		this.assignedUserGroup = assignedUserGroup;
	}

	public String getAssignedEmail() {
		return assignedEmail;
	}

	public void setAssignedEmail(String assignedEmail) {
		this.assignedEmail = assignedEmail;
	}

	public String getAccountService() {
		return accountService;
	}

	public void setAccountService(String accountService) {
		this.accountService = accountService;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

}
