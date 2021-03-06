package com.wellsfargo.serv_req_center.task_management.beans;

import java.io.Serializable;

/**
 * Uploaded Documents Detail
 * @author Heta Shah
 *
 */
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String documentName;
	private String dueDate;
	private String added;
	private String notes;
	private String additionalInst;
	private String attachment;
	private String documentAction;
	
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getAdditionalInst() {
		return additionalInst;
	}
	public void setAdditionalInst(String additionalInst) {
		this.additionalInst = additionalInst;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getDocumentAction() {
		return documentAction;
	}
	public void setDocumentAction(String documentAction) {
		this.documentAction = documentAction;
	}
	
	

}
