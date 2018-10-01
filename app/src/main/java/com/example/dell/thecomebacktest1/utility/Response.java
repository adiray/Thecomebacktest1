package com.example.dell.thecomebacktest1.utility;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("PRODUCT_PRICE")
	private String pRODUCTPRICE;

	@SerializedName("DESCRIPTION")
	private String dESCRIPTION;

	@SerializedName("created")
	private long created;

	@SerializedName("___class")
	private String _class;

	@SerializedName("PRODUCT_IMAGE_REFERENCE")
	private String pRODUCTIMAGEREFERENCE;

	@SerializedName("ownerId")
	private Object ownerId;

	@SerializedName("PRODUCT_NAME")
	private String pRODUCTNAME;

	@SerializedName("FEATURED")
	private boolean fEATURED;

	@SerializedName("updated")
	private long updated;

	@SerializedName("objectId")
	private String objectId;

	public void setPRODUCTPRICE(String pRODUCTPRICE){
		this.pRODUCTPRICE = pRODUCTPRICE;
	}

	public String getPRODUCTPRICE(){
		return pRODUCTPRICE;
	}

	public void setDESCRIPTION(String dESCRIPTION){
		this.dESCRIPTION = dESCRIPTION;
	}

	public String getDESCRIPTION(){
		return dESCRIPTION;
	}

	public void setCreated(long created){
		this.created = created;
	}

	public long getCreated(){
		return created;
	}

	public void set_Class(String _class){
		this._class = _class;
	}

	public String get_Class(){
		return _class;
	}

	public void setPRODUCTIMAGEREFERENCE(String pRODUCTIMAGEREFERENCE){
		this.pRODUCTIMAGEREFERENCE = pRODUCTIMAGEREFERENCE;
	}

	public String getPRODUCTIMAGEREFERENCE(){
		return pRODUCTIMAGEREFERENCE;
	}

	public void setOwnerId(Object ownerId){
		this.ownerId = ownerId;
	}

	public Object getOwnerId(){
		return ownerId;
	}

	public void setPRODUCTNAME(String pRODUCTNAME){
		this.pRODUCTNAME = pRODUCTNAME;
	}

	public String getPRODUCTNAME(){
		return pRODUCTNAME;
	}

	public void setFEATURED(boolean fEATURED){
		this.fEATURED = fEATURED;
	}

	public boolean isFEATURED(){
		return fEATURED;
	}

	public void setUpdated(long updated){
		this.updated = updated;
	}

	public long getUpdated(){
		return updated;
	}

	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public String getObjectId(){
		return objectId;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"pRODUCT_PRICE = '" + pRODUCTPRICE + '\'' + 
			",dESCRIPTION = '" + dESCRIPTION + '\'' + 
			",created = '" + created + '\'' + 
			",___class = '" + _class + '\'' +
			",pRODUCT_IMAGE_REFERENCE = '" + pRODUCTIMAGEREFERENCE + '\'' + 
			",ownerId = '" + ownerId + '\'' + 
			",pRODUCT_NAME = '" + pRODUCTNAME + '\'' + 
			",fEATURED = '" + fEATURED + '\'' + 
			",updated = '" + updated + '\'' + 
			",objectId = '" + objectId + '\'' + 
			"}";
		}
}