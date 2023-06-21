package dio.webapi.model;

public class UserModel {

         private Long id;
         private String login;
         private String password;

         public UserModel() {
         }

         public UserModel(String login, String password) {
                  this.login = login;
                  this.password = password;
         }
         

         public UserModel(Long id, String login, String password) {
                  this.id = id;
                  this.login = login;
                  this.password = password;
         }

         @Override
         public String toString() {
                  return "User [login=" + login + ", password=" + password + "]";
         }

         public Long getId() {
                  return id;
         }

         public void setId(Long id) {
                  this.id = id;
         }

         public String getLogin() {
                  return login;
         }

         public void setLogin(String login) {
                  this.login = login;
         }

         public String getPassword() {
                  return password;
         }

         public void setPassword(String password) {
                  this.password = password;
         }

}
