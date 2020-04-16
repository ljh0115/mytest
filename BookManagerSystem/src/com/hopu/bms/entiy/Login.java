package com.hopu.bms.entiy;
//实体类
public class Login {
		//属性
		private String userName;//账号
		private String pwd;//密码
		
		//行为
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public Login() {
			// TODO Auto-generated constructor stub
		}
		public Login(String userName, String pwd) {
			super();
			this.userName = userName;
			this.pwd = pwd;
		}
}
