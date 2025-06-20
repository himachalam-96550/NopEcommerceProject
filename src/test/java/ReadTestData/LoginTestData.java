package ReadTestData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginTestData {

	
	 @JsonProperty("LoginData")
	    private Credentials loginData;

	    public Credentials getLoginData() {
	        return loginData;
	    }

	    public void setLoginData(Credentials loginData) {
	        this.loginData = loginData;
	    }

	    public static class Credentials {
	        @JsonProperty("Email")
	        private String email;

	        @JsonProperty("Password")
	        private String password;

	        public String getEmail() {
	            return email;
	        }

	        public void setEmail(String email) {
	            this.email = email;
	        }

	        public String getPassword() {
	            return password;
	        }

	        public void setPassword(String password) {
	            this.password = password;
	        }
	    }
	
}
