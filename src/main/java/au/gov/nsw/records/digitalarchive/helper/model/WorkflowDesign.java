package au.gov.nsw.records.digitalarchive.helper.model;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class WorkflowDesign {
	
	private String name;
	
	private String xml;
	
	private String owner;
}
