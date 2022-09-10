package com.trillionstar.trackAny.model.template;

public class Template {
	private TemplateForm templateForm;
	private String templateName;
	private String templateDescription;
	private String organization;
	private String templateId;

	public void setTemplateForm(TemplateForm templateForm){
		this.templateForm = templateForm;
	}

	public TemplateForm getTemplateForm(){
		return templateForm;
	}

	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	public String getTemplateName(){
		return templateName;
	}

	public void setTemplateDescription(String templateDescription){
		this.templateDescription = templateDescription;
	}

	public String getTemplateDescription(){
		return templateDescription;
	}

	public void setOrganization(String organization){
		this.organization = organization;
	}

	public String getOrganization(){
		return organization;
	}

	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	public String getTemplateId(){
		return templateId;
	}

	@Override
 	public String toString(){
		return 
			"Template{" +
			"templateForm = '" + templateForm + '\'' + 
			",templateName = '" + templateName + '\'' + 
			",templateDescription = '" + templateDescription + '\'' + 
			",organization = '" + organization + '\'' + 
			",templateId = '" + templateId + '\'' + 
			"}";
		}
}
