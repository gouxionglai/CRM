package cn.tf.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.tf.post.dao.PostDao;
import cn.tf.post.domain.CrmPost;

public class PostDaoImpl extends  HibernateDaoSupport implements PostDao{

	@Override
	public List<CrmPost> findAll(String departmentId) {
		
		return this.getHibernateTemplate().find("from CrmPost c  where  c.crmDepartment.depId=? ",departmentId);
	}

}