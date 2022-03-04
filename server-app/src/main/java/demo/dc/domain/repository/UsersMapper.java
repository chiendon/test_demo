package demo.dc.domain.repository;

import demo.dc.domain.entity.Users;
import demo.dc.domain.entity.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	long countByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int deleteByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int insert(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int insertSelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	List<Users> selectByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	Users selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int updateByPrimaryKeySelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 16:26:54 ICT 2022
	 */
	int updateByPrimaryKey(Users record);
}