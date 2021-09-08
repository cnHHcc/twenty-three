package com.cc.twentythree.start.prototype.improve.deepclone;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深度拷贝的实现拷贝的两种方式
 * @author Administrator
 *
 */
@Data
public class DeepPrototype implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	public String name;

	public DeepCloneableTarget deepCloneableTarget;

	public DeepPrototype() {

	}

	// 方式1 ：通过重写clone方法来实现深拷贝 （引用对象多，这种方法比较繁琐）
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    //第一步：先创建一个Object类
		Object deep = null;
		try {
            //第二步：这里完成对基本数据类型的克隆（包括String类型）
			deep = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
        //第三步：父类指向子类对象
		DeepPrototype deepPrototype = (DeepPrototype) deep;
        if (deepPrototype != null){
            //第四步：单独处理引用数据类型，让引用数据类型，调用自己的浅克隆方法（由于deepCloneableTarget中都是String类型，所以浅克隆即可）
            deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
        }
		return deepPrototype;
	}
    // 方式2： 通过对象序列化实现深拷贝 （推荐）
	public Object deepClone() {
	    //第一步：创捷字节数组和对象的输入输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            //创建字节流输出对象
            bos = new ByteArrayOutputStream();
            //将字节流输出对象关联给对象流输出对象，这样，不管是基本数据类型，还是引用数据类型，都可以进行流输出了
            oos = new ObjectOutputStream(bos);
            //将当前这个对象以流的形式输出
            oos.writeObject(this);
            //将输出流读出来（反序列化）
            //将字节数组读出来
            bis = new ByteArrayInputStream(bos.toByteArray());
            //将读出来的字节数组与对象输入流关联
            ois = new ObjectInputStream(bis);
            //将对象读出来，并转为DeepPrototype类返回
            return (DeepPrototype)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}
