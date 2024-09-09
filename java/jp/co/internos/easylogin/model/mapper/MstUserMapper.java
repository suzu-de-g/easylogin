package jp.co.internos.easylogin.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internos.easylogin.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(String userName, String password);
	
}
