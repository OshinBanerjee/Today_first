package com.bit.schedule.dashboard.bo;

public class ScheduleDetailsVO {
	private String serverName;
	private String runDays;
	private int maxDuration;
	private String dependency;
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getRunDays() {
		return runDays;
	}
	public void setRunDays(String runDays) {
		this.runDays = runDays;
	}
	public int getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(int maxDuration) {
		this.maxDuration = maxDuration;
	}
	public String getDependency() {
		return dependency;
	}
	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
}
