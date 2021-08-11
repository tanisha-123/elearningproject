
public class Member1 {
	

		private String uid,uname,email,feedback;
		
		public Member1() {
			super();
		}

		public Member1(String uid, String uname, String email,String feedback) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.email = email;
			this.feedback = feedback;	
	         }
		public String getuid() {
			
			return uid;
		}

		public void setuid(String uid) {
			
			this.uid = uid;
		}
		
		public String getuname()
		{
			return uname;
		}

		public void setuname(String uname) {
			this.uname = uname;
		}

		

		public String getemail() {
			
			return email;
		}

		public void setemail(String email) {
			
			this.email = email;
		}

		public String getfeedback() {
			return feedback;
		}

		public void setfeedback(String feedback) {
			this.feedback = feedback;
		}

		
	

		

		
		
	}

