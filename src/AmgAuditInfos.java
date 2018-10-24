// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmgAuditInfos entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "amg_audit_infos", catalog = "amge")
public class AmgAuditInfos implements java.io.Serializable
{


	
	// Fields

	private String auId;
	private String auBehaveTime;
	private String auBehavetype;
	private String auBusstype;
	private String auDatatype;
	private String auDept;
	private String auProvider;
	private String auServicetype;
	private String auUid;
	private String auUserip;

	// Constructors

	/** default constructor */
	public AmgAuditInfos()
	{
	}

	/** minimal constructor */
	public AmgAuditInfos(String auId)
	{
		this.auId = auId;
	}

	/** full constructor */
	public AmgAuditInfos(String auId, String auBehaveTime, String auBehavetype,
			String auBusstype, String auDatatype, String auDept,
			String auProvider, String auServicetype, String auUid,
			String auUserip)
	{
		this.auId = auId;
		this.auBehaveTime = auBehaveTime;
		this.auBehavetype = auBehavetype;
		this.auBusstype = auBusstype;
		this.auDatatype = auDatatype;
		this.auDept = auDept;
		this.auProvider = auProvider;
		this.auServicetype = auServicetype;
		this.auUid = auUid;
		this.auUserip = auUserip;
	}

	// Property accessors
	@Id
	@Column(name = "AU_ID", unique = true, nullable = false, length = 32)
	public String getAuId()
	{
		return this.auId;
	}

	public void setAuId(String auId)
	{
		this.auId = auId;
	}

	@Column(name = "AU_BEHAVE_TIME", length = 20)
	public String getAuBehaveTime()
	{
		return this.auBehaveTime;
	}

	public void setAuBehaveTime(String auBehaveTime)
	{
		this.auBehaveTime = auBehaveTime;
	}

	@Column(name = "AU_BEHAVETYPE", length = 2)
	public String getAuBehavetype()
	{
		return this.auBehavetype;
	}

	public void setAuBehavetype(String auBehavetype)
	{
		this.auBehavetype = auBehavetype;
	}

	@Column(name = "AU_BUSSTYPE", length = 2)
	public String getAuBusstype()
	{
		return this.auBusstype;
	}

	public void setAuBusstype(String auBusstype)
	{
		this.auBusstype = auBusstype;
	}

	@Column(name = "AU_DATATYPE", length = 2)
	public String getAuDatatype()
	{
		return this.auDatatype;
	}

	public void setAuDatatype(String auDatatype)
	{
		this.auDatatype = auDatatype;
	}

	@Column(name = "AU_DEPT", length = 64)
	public String getAuDept()
	{
		return this.auDept;
	}

	public void setAuDept(String auDept)
	{
		this.auDept = auDept;
	}

	@Column(name = "AU_PROVIDER", length = 64)
	public String getAuProvider()
	{
		return this.auProvider;
	}

	public void setAuProvider(String auProvider)
	{
		this.auProvider = auProvider;
	}

	@Column(name = "AU_SERVICETYPE", length = 2)
	public String getAuServicetype()
	{
		return this.auServicetype;
	}

	public void setAuServicetype(String auServicetype)
	{
		this.auServicetype = auServicetype;
	}

	@Column(name = "AU_UID", length = 32)
	public String getAuUid()
	{
		return this.auUid;
	}

	public void setAuUid(String auUid)
	{
		this.auUid = auUid;
	}

	@Column(name = "AU_USERIP", length = 64)
	public String getAuUserip()
	{
		return this.auUserip;
	}

	public void setAuUserip(String auUserip)
	{
		this.auUserip = auUserip;
	}

}