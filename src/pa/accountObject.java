package pa;
/**
 * Mandatory account information
 * @author haskiem
 *
 */
public abstract class accountObject {

	protected String loginName;
	protected Password password;
	
	
//	Getters and Setters
	
	protected String getLoginName(){
		return this.loginName;
	}
	
	protected Password getPassword(){
		return this.password;
	}
	
	protected void setPassword(Password password){
		this.password = password;
	}
	
	protected void setLoginName(String LoginName){
		this.loginName = LoginName;
	}
}
