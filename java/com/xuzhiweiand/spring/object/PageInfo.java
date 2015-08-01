package com.xuzhiweiand.spring.object;

import java.util.List;

public class PageInfo<E> {
	private int start;
	private int size;
	private List<E> objects;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<E> getObjects() {
		return objects;
	}

	public void setObjects(List<E> objects) {
		this.objects = objects;
	}

}
