package com.trillionstar.trackAny.model.template;

public class OptionItem{
	private String name;
	private int id;
	private String label;
	private String title;
	private boolean selected;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}

	public boolean isSelected(){
		return selected;
	}

	@Override
 	public String toString(){
		return 
			"OptionItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",label = '" + label + '\'' + 
			",title = '" + title + '\'' + 
			",selected = '" + selected + '\'' + 
			"}";
		}
}
