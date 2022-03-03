package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Mapper
public class UsersExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public UsersExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andWorkNameIsNull() {
			addCriterion("work_name is null");
			return (Criteria) this;
		}

		public Criteria andWorkNameIsNotNull() {
			addCriterion("work_name is not null");
			return (Criteria) this;
		}

		public Criteria andWorkNameEqualTo(String value) {
			addCriterion("work_name =", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameNotEqualTo(String value) {
			addCriterion("work_name <>", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameGreaterThan(String value) {
			addCriterion("work_name >", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
			addCriterion("work_name >=", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameLessThan(String value) {
			addCriterion("work_name <", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameLessThanOrEqualTo(String value) {
			addCriterion("work_name <=", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameLike(String value) {
			addCriterion("work_name like", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameNotLike(String value) {
			addCriterion("work_name not like", value, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameIn(List<String> values) {
			addCriterion("work_name in", values, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameNotIn(List<String> values) {
			addCriterion("work_name not in", values, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameBetween(String value1, String value2) {
			addCriterion("work_name between", value1, value2, "workName");
			return (Criteria) this;
		}

		public Criteria andWorkNameNotBetween(String value1, String value2) {
			addCriterion("work_name not between", value1, value2, "workName");
			return (Criteria) this;
		}

		public Criteria andStartingDateIsNull() {
			addCriterion("starting_date is null");
			return (Criteria) this;
		}

		public Criteria andStartingDateIsNotNull() {
			addCriterion("starting_date is not null");
			return (Criteria) this;
		}

		public Criteria andStartingDateEqualTo(Date value) {
			addCriterion("starting_date =", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateNotEqualTo(Date value) {
			addCriterion("starting_date <>", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateGreaterThan(Date value) {
			addCriterion("starting_date >", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateGreaterThanOrEqualTo(Date value) {
			addCriterion("starting_date >=", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateLessThan(Date value) {
			addCriterion("starting_date <", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateLessThanOrEqualTo(Date value) {
			addCriterion("starting_date <=", value, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateIn(List<Date> values) {
			addCriterion("starting_date in", values, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateNotIn(List<Date> values) {
			addCriterion("starting_date not in", values, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateBetween(Date value1, Date value2) {
			addCriterion("starting_date between", value1, value2, "startingDate");
			return (Criteria) this;
		}

		public Criteria andStartingDateNotBetween(Date value1, Date value2) {
			addCriterion("starting_date not between", value1, value2, "startingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateIsNull() {
			addCriterion("ending_date is null");
			return (Criteria) this;
		}

		public Criteria andEndingDateIsNotNull() {
			addCriterion("ending_date is not null");
			return (Criteria) this;
		}

		public Criteria andEndingDateEqualTo(Date value) {
			addCriterion("ending_date =", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateNotEqualTo(Date value) {
			addCriterion("ending_date <>", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateGreaterThan(Date value) {
			addCriterion("ending_date >", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateGreaterThanOrEqualTo(Date value) {
			addCriterion("ending_date >=", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateLessThan(Date value) {
			addCriterion("ending_date <", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateLessThanOrEqualTo(Date value) {
			addCriterion("ending_date <=", value, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateIn(List<Date> values) {
			addCriterion("ending_date in", values, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateNotIn(List<Date> values) {
			addCriterion("ending_date not in", values, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateBetween(Date value1, Date value2) {
			addCriterion("ending_date between", value1, value2, "endingDate");
			return (Criteria) this;
		}

		public Criteria andEndingDateNotBetween(Date value1, Date value2) {
			addCriterion("ending_date not between", value1, value2, "endingDate");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table users
	 * @mbg.generated  Fri Mar 04 00:33:19 ICT 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 03 20:52:40 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}