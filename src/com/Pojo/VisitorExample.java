package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andVisitimformationidIsNull() {
            addCriterion("VisitimformationId is null");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidIsNotNull() {
            addCriterion("VisitimformationId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidEqualTo(Integer value) {
            addCriterion("VisitimformationId =", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidNotEqualTo(Integer value) {
            addCriterion("VisitimformationId <>", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidGreaterThan(Integer value) {
            addCriterion("VisitimformationId >", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitimformationId >=", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidLessThan(Integer value) {
            addCriterion("VisitimformationId <", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidLessThanOrEqualTo(Integer value) {
            addCriterion("VisitimformationId <=", value, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidIn(List<Integer> values) {
            addCriterion("VisitimformationId in", values, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidNotIn(List<Integer> values) {
            addCriterion("VisitimformationId not in", values, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidBetween(Integer value1, Integer value2) {
            addCriterion("VisitimformationId between", value1, value2, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitimformationidNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitimformationId not between", value1, value2, "visitimformationid");
            return (Criteria) this;
        }

        public Criteria andVisitoremailIsNull() {
            addCriterion("VisitorEmail is null");
            return (Criteria) this;
        }

        public Criteria andVisitoremailIsNotNull() {
            addCriterion("VisitorEmail is not null");
            return (Criteria) this;
        }

        public Criteria andVisitoremailEqualTo(String value) {
            addCriterion("VisitorEmail =", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailNotEqualTo(String value) {
            addCriterion("VisitorEmail <>", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailGreaterThan(String value) {
            addCriterion("VisitorEmail >", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorEmail >=", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailLessThan(String value) {
            addCriterion("VisitorEmail <", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailLessThanOrEqualTo(String value) {
            addCriterion("VisitorEmail <=", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailLike(String value) {
            addCriterion("VisitorEmail like", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailNotLike(String value) {
            addCriterion("VisitorEmail not like", value, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailIn(List<String> values) {
            addCriterion("VisitorEmail in", values, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailNotIn(List<String> values) {
            addCriterion("VisitorEmail not in", values, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailBetween(String value1, String value2) {
            addCriterion("VisitorEmail between", value1, value2, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitoremailNotBetween(String value1, String value2) {
            addCriterion("VisitorEmail not between", value1, value2, "visitoremail");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNull() {
            addCriterion("VisitorName is null");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNotNull() {
            addCriterion("VisitorName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitornameEqualTo(String value) {
            addCriterion("VisitorName =", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotEqualTo(String value) {
            addCriterion("VisitorName <>", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThan(String value) {
            addCriterion("VisitorName >", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorName >=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThan(String value) {
            addCriterion("VisitorName <", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThanOrEqualTo(String value) {
            addCriterion("VisitorName <=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLike(String value) {
            addCriterion("VisitorName like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotLike(String value) {
            addCriterion("VisitorName not like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameIn(List<String> values) {
            addCriterion("VisitorName in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotIn(List<String> values) {
            addCriterion("VisitorName not in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameBetween(String value1, String value2) {
            addCriterion("VisitorName between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotBetween(String value1, String value2) {
            addCriterion("VisitorName not between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitortimeIsNull() {
            addCriterion("VisitorTime is null");
            return (Criteria) this;
        }

        public Criteria andVisitortimeIsNotNull() {
            addCriterion("VisitorTime is not null");
            return (Criteria) this;
        }

        public Criteria andVisitortimeEqualTo(Date value) {
            addCriterion("VisitorTime =", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeNotEqualTo(Date value) {
            addCriterion("VisitorTime <>", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeGreaterThan(Date value) {
            addCriterion("VisitorTime >", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VisitorTime >=", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeLessThan(Date value) {
            addCriterion("VisitorTime <", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeLessThanOrEqualTo(Date value) {
            addCriterion("VisitorTime <=", value, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeIn(List<Date> values) {
            addCriterion("VisitorTime in", values, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeNotIn(List<Date> values) {
            addCriterion("VisitorTime not in", values, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeBetween(Date value1, Date value2) {
            addCriterion("VisitorTime between", value1, value2, "visitortime");
            return (Criteria) this;
        }

        public Criteria andVisitortimeNotBetween(Date value1, Date value2) {
            addCriterion("VisitorTime not between", value1, value2, "visitortime");
            return (Criteria) this;
        }

        public Criteria andUsremailIsNull() {
            addCriterion("UsrEmail is null");
            return (Criteria) this;
        }

        public Criteria andUsremailIsNotNull() {
            addCriterion("UsrEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUsremailEqualTo(String value) {
            addCriterion("UsrEmail =", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotEqualTo(String value) {
            addCriterion("UsrEmail <>", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailGreaterThan(String value) {
            addCriterion("UsrEmail >", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailGreaterThanOrEqualTo(String value) {
            addCriterion("UsrEmail >=", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLessThan(String value) {
            addCriterion("UsrEmail <", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLessThanOrEqualTo(String value) {
            addCriterion("UsrEmail <=", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLike(String value) {
            addCriterion("UsrEmail like", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotLike(String value) {
            addCriterion("UsrEmail not like", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailIn(List<String> values) {
            addCriterion("UsrEmail in", values, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotIn(List<String> values) {
            addCriterion("UsrEmail not in", values, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailBetween(String value1, String value2) {
            addCriterion("UsrEmail between", value1, value2, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotBetween(String value1, String value2) {
            addCriterion("UsrEmail not between", value1, value2, "usremail");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}