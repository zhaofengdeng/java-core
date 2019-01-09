package ebean;

import java.util.List;

import io.ebean.Ebean;
import io.ebean.SqlRow;


public class EbeanError {
	
	/**
	 * 错误 问题：
	 * 1.id为空处理
	 * 2.防止sql注入
	 * 3.查询不出来是否有错 注意点：查询条件是否有索引
	 * 
	 * @param id
	 * @return
	 */
	public SqlRow searchError(String id) {
		String sql = "select * from tbl_user where id=" + id;
		return Ebean.createSqlQuery(sql).findOne();
	}

	/**
	 * 正确
	 * @throws Exception 
	 */
	public SqlRow search(String id) throws Exception {
		String sql="select * from tbl_user where id= :id ";
		List<SqlRow> rows = Ebean.createSqlQuery(sql).setParameter("id", id).findList();
		int qty = rows.size();
		if(qty==1) {
			return rows.get(0);
		}
		if(qty==0) {
			  throw new Exception("tbl_user表中id为"+id+"的没有一条数据");
		}else {
			 throw new Exception("tbl_user表中id为"+id+"的有"+qty+"条数据");
		}
	}
}
