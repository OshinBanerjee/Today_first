package com.bit.batch.dashboard.bo;

public class BatchDetailsVO {
	
	private String jobName;
	private String description;
	private String executableName;
	private String executablePath;
	private String logFileName;
	private String logFileLocation;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExecutableName() {
		return executableName;
	}
	public void setExecutableName(String executableName) {
		this.executableName = executableName;
	}
	public String getExecutablePath() {
		return executablePath;
	}
	public void setExecutablePath(String executablePath) {
		this.executablePath = executablePath;
	}
	public String getLogFileName() {
		return logFileName;
	}
	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}
	public String getLogFileLocation() {
		return logFileLocation;
	}
	public void setLogFileLocation(String logFileLocation) {
		this.logFileLocation = logFileLocation;
	}
		
}
