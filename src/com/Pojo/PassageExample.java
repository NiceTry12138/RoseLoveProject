package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PassageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassageExample() {
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

        public Criteria andPassageidIsNull() {
            addCriterion("PassageId is null");
            return (Criteria) this;
        }

        public Criteria andPassageidIsNotNull() {
            addCriterion("PassageId is not null");
            return (Criteria) this;
        }

        public Criteria andPassageidEqualTo(Integer value) {
            addCriterion("PassageId =", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidNotEqualTo(Integer value) {
            addCriterion("PassageId <>", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidGreaterThan(Integer value) {
            addCriterion("PassageId >", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PassageId >=", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidLessThan(Integer value) {
            addCriterion("PassageId <", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidLessThanOrEqualTo(Integer value) {
            addCriterion("PassageId <=", value, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidIn(List<Integer> values) {
            addCriterion("PassageId in", values, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidNotIn(List<Integer> values) {
            addCriterion("PassageId not in", values, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidBetween(Integer value1, Integer value2) {
            addCriterion("PassageId between", value1, value2, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageidNotBetween(Integer value1, Integer value2) {
            addCriterion("PassageId not between", value1, value2, "passageid");
            return (Criteria) this;
        }

        public Criteria andPassageusernameIsNull() {
            addCriterion("PassageUsername is null");
            return (Criteria) this;
        }

        public Criteria andPassageusernameIsNotNull() {
            addCriterion("PassageUsername is not null");
            return (Criteria) this;
        }

        public Criteria andPassageusernameEqualTo(String value) {
            addCriterion("PassageUsername =", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameNotEqualTo(String value) {
            addCriterion("PassageUsername <>", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameGreaterThan(String value) {
            addCriterion("PassageUsername >", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameGreaterThanOrEqualTo(String value) {
            addCriterion("PassageUsername >=", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameLessThan(String value) {
            addCriterion("PassageUsername <", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameLessThanOrEqualTo(String value) {
            addCriterion("PassageUsername <=", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameLike(String value) {
            addCriterion("PassageUsername like", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameNotLike(String value) {
            addCriterion("PassageUsername not like", value, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameIn(List<String> values) {
            addCriterion("PassageUsername in", values, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameNotIn(List<String> values) {
            addCriterion("PassageUsername not in", values, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameBetween(String value1, String value2) {
            addCriterion("PassageUsername between", value1, value2, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassageusernameNotBetween(String value1, String value2) {
            addCriterion("PassageUsername not between", value1, value2, "passageusername");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeIsNull() {
            addCriterion("PassageSendtime is null");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeIsNotNull() {
            addCriterion("PassageSendtime is not null");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeEqualTo(Date value) {
            addCriterion("PassageSendtime =", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeNotEqualTo(Date value) {
            addCriterion("PassageSendtime <>", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeGreaterThan(Date value) {
            addCriterion("PassageSendtime >", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PassageSendtime >=", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeLessThan(Date value) {
            addCriterion("PassageSendtime <", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeLessThanOrEqualTo(Date value) {
            addCriterion("PassageSendtime <=", value, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeIn(List<Date> values) {
            addCriterion("PassageSendtime in", values, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeNotIn(List<Date> values) {
            addCriterion("PassageSendtime not in", values, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeBetween(Date value1, Date value2) {
            addCriterion("PassageSendtime between", value1, value2, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagesendtimeNotBetween(Date value1, Date value2) {
            addCriterion("PassageSendtime not between", value1, value2, "passagesendtime");
            return (Criteria) this;
        }

        public Criteria andPassagestateIsNull() {
            addCriterion("PassageState is null");
            return (Criteria) this;
        }

        public Criteria andPassagestateIsNotNull() {
            addCriterion("PassageState is not null");
            return (Criteria) this;
        }

        public Criteria andPassagestateEqualTo(String value) {
            addCriterion("PassageState =", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateNotEqualTo(String value) {
            addCriterion("PassageState <>", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateGreaterThan(String value) {
            addCriterion("PassageState >", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateGreaterThanOrEqualTo(String value) {
            addCriterion("PassageState >=", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateLessThan(String value) {
            addCriterion("PassageState <", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateLessThanOrEqualTo(String value) {
            addCriterion("PassageState <=", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateLike(String value) {
            addCriterion("PassageState like", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateNotLike(String value) {
            addCriterion("PassageState not like", value, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateIn(List<String> values) {
            addCriterion("PassageState in", values, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateNotIn(List<String> values) {
            addCriterion("PassageState not in", values, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateBetween(String value1, String value2) {
            addCriterion("PassageState between", value1, value2, "passagestate");
            return (Criteria) this;
        }

        public Criteria andPassagestateNotBetween(String value1, String value2) {
            addCriterion("PassageState not between", value1, value2, "passagestate");
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

        public Criteria andPassagecontentIsNull() {
            addCriterion("PassageContent is null");
            return (Criteria) this;
        }

        public Criteria andPassagecontentIsNotNull() {
            addCriterion("PassageContent is not null");
            return (Criteria) this;
        }

        public Criteria andPassagecontentEqualTo(String value) {
            addCriterion("PassageContent =", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentNotEqualTo(String value) {
            addCriterion("PassageContent <>", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentGreaterThan(String value) {
            addCriterion("PassageContent >", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("PassageContent >=", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentLessThan(String value) {
            addCriterion("PassageContent <", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentLessThanOrEqualTo(String value) {
            addCriterion("PassageContent <=", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentLike(String value) {
            addCriterion("PassageContent like", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentNotLike(String value) {
            addCriterion("PassageContent not like", value, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentIn(List<String> values) {
            addCriterion("PassageContent in", values, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentNotIn(List<String> values) {
            addCriterion("PassageContent not in", values, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentBetween(String value1, String value2) {
            addCriterion("PassageContent between", value1, value2, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagecontentNotBetween(String value1, String value2) {
            addCriterion("PassageContent not between", value1, value2, "passagecontent");
            return (Criteria) this;
        }

        public Criteria andPassagenameIsNull() {
            addCriterion("PassageName is null");
            return (Criteria) this;
        }

        public Criteria andPassagenameIsNotNull() {
            addCriterion("PassageName is not null");
            return (Criteria) this;
        }

        public Criteria andPassagenameEqualTo(String value) {
            addCriterion("PassageName =", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameNotEqualTo(String value) {
            addCriterion("PassageName <>", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameGreaterThan(String value) {
            addCriterion("PassageName >", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameGreaterThanOrEqualTo(String value) {
            addCriterion("PassageName >=", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameLessThan(String value) {
            addCriterion("PassageName <", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameLessThanOrEqualTo(String value) {
            addCriterion("PassageName <=", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameLike(String value) {
            addCriterion("PassageName like", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameNotLike(String value) {
            addCriterion("PassageName not like", value, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameIn(List<String> values) {
            addCriterion("PassageName in", values, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameNotIn(List<String> values) {
            addCriterion("PassageName not in", values, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameBetween(String value1, String value2) {
            addCriterion("PassageName between", value1, value2, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassagenameNotBetween(String value1, String value2) {
            addCriterion("PassageName not between", value1, value2, "passagename");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedIsNull() {
            addCriterion("PassageIfdeleted is null");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedIsNotNull() {
            addCriterion("PassageIfdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedEqualTo(String value) {
            addCriterion("PassageIfdeleted =", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedNotEqualTo(String value) {
            addCriterion("PassageIfdeleted <>", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedGreaterThan(String value) {
            addCriterion("PassageIfdeleted >", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("PassageIfdeleted >=", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedLessThan(String value) {
            addCriterion("PassageIfdeleted <", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedLessThanOrEqualTo(String value) {
            addCriterion("PassageIfdeleted <=", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedLike(String value) {
            addCriterion("PassageIfdeleted like", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedNotLike(String value) {
            addCriterion("PassageIfdeleted not like", value, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedIn(List<String> values) {
            addCriterion("PassageIfdeleted in", values, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedNotIn(List<String> values) {
            addCriterion("PassageIfdeleted not in", values, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedBetween(String value1, String value2) {
            addCriterion("PassageIfdeleted between", value1, value2, "passageifdeleted");
            return (Criteria) this;
        }

        public Criteria andPassageifdeletedNotBetween(String value1, String value2) {
            addCriterion("PassageIfdeleted not between", value1, value2, "passageifdeleted");
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