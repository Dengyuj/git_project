package student_prc;

public class StudentModel {
      private int id;
      private String username;
      private String password;
      private int sex;
      private String lova;
	private String love;
      
      public StudentModel(int id,String username,String password,int sex,String love) {

            super();
            this.setId(id);
            this.setUsername(username);
            this.setPassword(password);
            this.setSex(sex);
            this.setLove(love);
            
      }

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getLova() {
		return lova;
	}

	public void setLova(String lova) {
		this.lova = lova;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}