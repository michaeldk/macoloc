package com.macoloc.domain;

public interface Notification {
	NotificationType getType();
	String getContent();
	String getSmallContent();
}
