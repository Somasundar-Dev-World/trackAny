package com.trillionstar.trackAny.model.template;

import java.util.List;

public class TemplateForm{
	private List<FieldItem> field;

	public void setField(List<FieldItem> field){
		this.field = field;
	}

	public List<FieldItem> getField(){
		return field;
	}

	@Override
 	public String toString(){
		return 
			"TemplateForm{" + 
			"field = '" + field + '\'' + 
			"}";
		}
}