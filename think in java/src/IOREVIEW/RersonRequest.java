package IOREVIEW;

import nu.xom.Element;

public class RersonRequest extends APIRequest{
	private String name;
	private String sex;
	private String tel;
	public RersonRequest(String name,String sex,String tel){
		this.name=name;
		this.sex=sex;
		this.tel=tel;
	}
	public RersonRequest(Element element,String name,String sex,String tel){
		this.name=element.getFirstChildElement(name).getValue();
		this.sex=element.getFirstChildElement(sex).getValue();
		this.tel=element.getFirstChildElement(tel).getValue();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
