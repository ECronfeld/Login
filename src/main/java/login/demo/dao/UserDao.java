package login.demo.dao;

import login.demo.models.User;

import javax.sql.DataSource;

public interface UserDao {

    public void setDataSource(DataSource ds);

    public User getUser(String username);

}
