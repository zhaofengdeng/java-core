package ebean;

import java.util.ArrayList;
import java.util.List;

import io.ebean.Ebean;
import io.ebean.Expr;
import io.ebean.Expression;
import io.ebean.ExpressionList;
import io.ebean.Query;
import io.ebean.Transaction;
import model.User;
import model.UserDetail;

public class EbeanUse {
	public List<User> search() {
		ExpressionList<User> el = Ebean.find(User.class).where();
		// 模糊查询带a
		el.like("name", "%a%");
		// 查询type等于abc
		el.eq("type", "abc");
		// 查询sex等于男或者等于女的
		Expression el1 = Expr.eq("sex", "男");
		Expression el2 = Expr.eq("sex", "女");
		el.or(el1, el2);

		// in使用list
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		el.in("id", list);

		// in使用sql
		Query<UserDetail> queryin = Ebean.find(UserDetail.class).select("userId").where().eq("remark", "O2活动").query();
		el.in("id", queryin);

		// 分页
		Query<User> query = el.setFirstRow(10).setMaxRows(15);
		// ==========================================fectch使用
		// 如果UserDetail有10万条数据，我需要获取user的那么，与user对象中test（另一个model）的name
		// 因为使用的是懒加载，所以会查询10万次user对象与10万次test对象
		// 处理方式，查询userDetail时，直接查询user与test对象
		//查询指定属性
		query.fetch("user","id,name").fetch("user.test","name").findList();
		//全部查询
		query.fetch("user","*").fetch("user.test","*").findList();
		// ==========================================fectch使用
		return query.findList();
	}

	public void process(User user) {

		Transaction transaction = Ebean.beginTransaction();
		try {
			Ebean.delete(user);
			Ebean.save(user);
			Ebean.update(user);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.end();

	}

}
