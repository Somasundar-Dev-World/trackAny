package com.trillionstar.trackAny.model.template;

import java.util.List;

public class FieldItem{
	private String name;
	private String defaultvalue;
	private int id;
	private String label;
	private String type;
	private String title;
	private List<OptionItem> option;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDefaultvalue(String defaultvalue){
		this.defaultvalue = defaultvalue;
	}

	public String getDefaultvalue(){
		return defaultvalue;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setOption(List<OptionItem> option){
		this.option = option;
	}

	public List<OptionItem> getOption(){
		return option;
	}

	@Override
 	public String toString(){
		return 
			"FieldItem{" + 
			"name = '" + name + '\'' + 
			",defaultvalue = '" + defaultvalue + '\'' + 
			",id = '" + id + '\'' + 
			",label = '" + label + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",option = '" + option + '\'' + 
			"}";
		}
}