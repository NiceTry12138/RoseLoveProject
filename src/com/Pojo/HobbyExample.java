package com.Pojo;

import java.util.ArrayList;
import java.util.List;

public class HobbyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HobbyExample() {
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

        public Criteria andHobbyidIsNull() {
            addCriterion("HobbyId is null");
            return (Criteria) this;
        }

        public Criteria andHobbyidIsNotNull() {
            addCriterion("HobbyId is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyidEqualTo(Integer value) {
            addCriterion("HobbyId =", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidNotEqualTo(Integer value) {
            addCriterion("HobbyId <>", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidGreaterThan(Integer value) {
            addCriterion("HobbyId >", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HobbyId >=", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidLessThan(Integer value) {
            addCriterion("HobbyId <", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidLessThanOrEqualTo(Integer value) {
            addCriterion("HobbyId <=", value, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidIn(List<Integer> values) {
            addCriterion("HobbyId in", values, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidNotIn(List<Integer> values) {
            addCriterion("HobbyId not in", values, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidBetween(Integer value1, Integer value2) {
            addCriterion("HobbyId between", value1, value2, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbyidNotBetween(Integer value1, Integer value2) {
            addCriterion("HobbyId not between", value1, value2, "hobbyid");
            return (Criteria) this;
        }

        public Criteria andHobbytypeIsNull() {
            addCriterion("HobbyType is null");
            return (Criteria) this;
        }

        public Criteria andHobbytypeIsNotNull() {
            addCriterion("HobbyType is not null");
            return (Criteria) this;
        }

        public Criteria andHobbytypeEqualTo(String value) {
            addCriterion("HobbyType =", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeNotEqualTo(String value) {
            addCriterion("HobbyType <>", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeGreaterThan(String value) {
            addCriterion("HobbyType >", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeGreaterThanOrEqualTo(String value) {
            addCriterion("HobbyType >=", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeLessThan(String value) {
            addCriterion("HobbyType <", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeLessThanOrEqualTo(String value) {
            addCriterion("HobbyType <=", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeLike(String value) {
            addCriterion("HobbyType like", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeNotLike(String value) {
            addCriterion("HobbyType not like", value, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeIn(List<String> values) {
            addCriterion("HobbyType in", values, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeNotIn(List<String> values) {
            addCriterion("HobbyType not in", values, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeBetween(String value1, String value2) {
            addCriterion("HobbyType between", value1, value2, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbytypeNotBetween(String value1, String value2) {
            addCriterion("HobbyType not between", value1, value2, "hobbytype");
            return (Criteria) this;
        }

        public Criteria andHobbycontentIsNull() {
            addCriterion("HobbyContent is null");
            return (Criteria) this;
        }

        public Criteria andHobbycontentIsNotNull() {
            addCriterion("HobbyContent is not null");
            return (Criteria) this;
        }

        public Criteria andHobbycontentEqualTo(String value) {
            addCriterion("HobbyContent =", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentNotEqualTo(String value) {
            addCriterion("HobbyContent <>", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentGreaterThan(String value) {
            addCriterion("HobbyContent >", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentGreaterThanOrEqualTo(String value) {
            addCriterion("HobbyContent >=", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentLessThan(String value) {
            addCriterion("HobbyContent <", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentLessThanOrEqualTo(String value) {
            addCriterion("HobbyContent <=", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentLike(String value) {
            addCriterion("HobbyContent like", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentNotLike(String value) {
            addCriterion("HobbyContent not like", value, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentIn(List<String> values) {
            addCriterion("HobbyContent in", values, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentNotIn(List<String> values) {
            addCriterion("HobbyContent not in", values, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentBetween(String value1, String value2) {
            addCriterion("HobbyContent between", value1, value2, "hobbycontent");
            return (Criteria) this;
        }

        public Criteria andHobbycontentNotBetween(String value1, String value2) {
            addCriterion("HobbyContent not between", value1, value2, "hobbycontent");
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