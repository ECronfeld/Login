package login.demo.daoimpl;

import login.demo.dao.UserDao;
import login.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;


@Repository("orgDao")
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Override
    public void setDataSource(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public User getUser(String firstname) {
        String sqlQuery = "SELECT id, firstname, lastname " + "FROM customer WHERE firstname = ?";
        Object[] args = new Object[]{firstname};
        User user = jdbcTemplate.queryForObject(sqlQuery, args, new UserRowMapper());
        return user;
    }
}

