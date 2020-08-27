package th.go.rd.atm.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import th.go.rd.atm.model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer>{

}
