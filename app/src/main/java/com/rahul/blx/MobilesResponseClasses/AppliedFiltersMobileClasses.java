package com.rahul.blx.MobilesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class AppliedFiltersMobileClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("description")
	private String description;

	@SerializedName("display_order")
	private int displayOrder;

	@SerializedName("type")
	private String type;

	@SerializedName("render_as")
	private String renderAs;

	@SerializedName("values")
	private List<ValuesMobileClasses> values;

	public String getId(){
		return id;
	}

	public String getDescription(){
		return description;
	}

	public int getDisplayOrder(){
		return displayOrder;
	}

	public String getType(){
		return type;
	}

	public String getRenderAs(){
		return renderAs;
	}

	public List<ValuesMobileClasses> getValues(){
		return values;
	}
}