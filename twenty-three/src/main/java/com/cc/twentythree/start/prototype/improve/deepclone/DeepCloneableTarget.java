package com.cc.twentythree.start.prototype.improve.deepclone;

import lombok.Data;

import java.io.Serializable;

/**
 * 需要深度克隆的类，实现Serializable、Cloneable两个接口
 */
@Data
public class DeepCloneableTarget implements Serializable, Cloneable {


	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}
	//因为DeepCloneableTarget的两个属性都是基本数据类型String，所以，这里用默认的浅克隆即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
