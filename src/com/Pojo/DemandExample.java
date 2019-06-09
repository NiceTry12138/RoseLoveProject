package com.Pojo;

import java.util.ArrayList;
import java.util.List;

public class DemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemandExample() {
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

        public Criteria andDemandidIsNull() {
            addCriterion("DemandId is null");
            return (Criteria) this;
        }

        public Criteria andDemandidIsNotNull() {
            addCriterion("DemandId is not null");
            return (Criteria) this;
        }

        public Criteria andDemandidEqualTo(Integer value) {
            addCriterion("DemandId =", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidNotEqualTo(Integer value) {
            addCriterion("DemandId <>", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidGreaterThan(Integer value) {
            addCriterion("DemandId >", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DemandId >=", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidLessThan(Integer value) {
            addCriterion("DemandId <", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidLessThanOrEqualTo(Integer value) {
            addCriterion("DemandId <=", value, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidIn(List<Integer> values) {
            addCriterion("DemandId in", values, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidNotIn(List<Integer> values) {
            addCriterion("DemandId not in", values, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidBetween(Integer value1, Integer value2) {
            addCriterion("DemandId between", value1, value2, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandidNotBetween(Integer value1, Integer value2) {
            addCriterion("DemandId not between", value1, value2, "demandid");
            return (Criteria) this;
        }

        public Criteria andDemandsexIsNull() {
            addCriterion("DemandSex is null");
            return (Criteria) this;
        }

        public Criteria andDemandsexIsNotNull() {
            addCriterion("DemandSex is not null");
            return (Criteria) this;
        }

        public Criteria andDemandsexEqualTo(String value) {
            addCriterion("DemandSex =", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexNotEqualTo(String value) {
            addCriterion("DemandSex <>", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexGreaterThan(String value) {
            addCriterion("DemandSex >", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexGreaterThanOrEqualTo(String value) {
            addCriterion("DemandSex >=", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexLessThan(String value) {
            addCriterion("DemandSex <", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexLessThanOrEqualTo(String value) {
            addCriterion("DemandSex <=", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexLike(String value) {
            addCriterion("DemandSex like", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexNotLike(String value) {
            addCriterion("DemandSex not like", value, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexIn(List<String> values) {
            addCriterion("DemandSex in", values, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexNotIn(List<String> values) {
            addCriterion("DemandSex not in", values, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexBetween(String value1, String value2) {
            addCriterion("DemandSex between", value1, value2, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandsexNotBetween(String value1, String value2) {
            addCriterion("DemandSex not between", value1, value2, "demandsex");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateIsNull() {
            addCriterion("DemandMaritalstate is null");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateIsNotNull() {
            addCriterion("DemandMaritalstate is not null");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateEqualTo(String value) {
            addCriterion("DemandMaritalstate =", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateNotEqualTo(String value) {
            addCriterion("DemandMaritalstate <>", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateGreaterThan(String value) {
            addCriterion("DemandMaritalstate >", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateGreaterThanOrEqualTo(String value) {
            addCriterion("DemandMaritalstate >=", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateLessThan(String value) {
            addCriterion("DemandMaritalstate <", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateLessThanOrEqualTo(String value) {
            addCriterion("DemandMaritalstate <=", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateLike(String value) {
            addCriterion("DemandMaritalstate like", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateNotLike(String value) {
            addCriterion("DemandMaritalstate not like", value, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateIn(List<String> values) {
            addCriterion("DemandMaritalstate in", values, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateNotIn(List<String> values) {
            addCriterion("DemandMaritalstate not in", values, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateBetween(String value1, String value2) {
            addCriterion("DemandMaritalstate between", value1, value2, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandmaritalstateNotBetween(String value1, String value2) {
            addCriterion("DemandMaritalstate not between", value1, value2, "demandmaritalstate");
            return (Criteria) this;
        }

        public Criteria andDemandeducationIsNull() {
            addCriterion("DemandEducation is null");
            return (Criteria) this;
        }

        public Criteria andDemandeducationIsNotNull() {
            addCriterion("DemandEducation is not null");
            return (Criteria) this;
        }

        public Criteria andDemandeducationEqualTo(String value) {
            addCriterion("DemandEducation =", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationNotEqualTo(String value) {
            addCriterion("DemandEducation <>", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationGreaterThan(String value) {
            addCriterion("DemandEducation >", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationGreaterThanOrEqualTo(String value) {
            addCriterion("DemandEducation >=", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationLessThan(String value) {
            addCriterion("DemandEducation <", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationLessThanOrEqualTo(String value) {
            addCriterion("DemandEducation <=", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationLike(String value) {
            addCriterion("DemandEducation like", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationNotLike(String value) {
            addCriterion("DemandEducation not like", value, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationIn(List<String> values) {
            addCriterion("DemandEducation in", values, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationNotIn(List<String> values) {
            addCriterion("DemandEducation not in", values, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationBetween(String value1, String value2) {
            addCriterion("DemandEducation between", value1, value2, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andDemandeducationNotBetween(String value1, String value2) {
            addCriterion("DemandEducation not between", value1, value2, "demandeducation");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("AddressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("AddressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("AddressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("AddressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("AddressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("AddressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("AddressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("AddressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("AddressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("AddressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("AddressId not between", value1, value2, "addressid");
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

        public Criteria andDemandminageIsNull() {
            addCriterion("DemandMinage is null");
            return (Criteria) this;
        }

        public Criteria andDemandminageIsNotNull() {
            addCriterion("DemandMinage is not null");
            return (Criteria) this;
        }

        public Criteria andDemandminageEqualTo(Integer value) {
            addCriterion("DemandMinage =", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageNotEqualTo(Integer value) {
            addCriterion("DemandMinage <>", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageGreaterThan(Integer value) {
            addCriterion("DemandMinage >", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageGreaterThanOrEqualTo(Integer value) {
            addCriterion("DemandMinage >=", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageLessThan(Integer value) {
            addCriterion("DemandMinage <", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageLessThanOrEqualTo(Integer value) {
            addCriterion("DemandMinage <=", value, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageIn(List<Integer> values) {
            addCriterion("DemandMinage in", values, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageNotIn(List<Integer> values) {
            addCriterion("DemandMinage not in", values, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageBetween(Integer value1, Integer value2) {
            addCriterion("DemandMinage between", value1, value2, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandminageNotBetween(Integer value1, Integer value2) {
            addCriterion("DemandMinage not between", value1, value2, "demandminage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageIsNull() {
            addCriterion("DemandMaxage is null");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageIsNotNull() {
            addCriterion("DemandMaxage is not null");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageEqualTo(Integer value) {
            addCriterion("DemandMaxage =", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageNotEqualTo(Integer value) {
            addCriterion("DemandMaxage <>", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageGreaterThan(Integer value) {
            addCriterion("DemandMaxage >", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageGreaterThanOrEqualTo(Integer value) {
            addCriterion("DemandMaxage >=", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageLessThan(Integer value) {
            addCriterion("DemandMaxage <", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageLessThanOrEqualTo(Integer value) {
            addCriterion("DemandMaxage <=", value, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageIn(List<Integer> values) {
            addCriterion("DemandMaxage in", values, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageNotIn(List<Integer> values) {
            addCriterion("DemandMaxage not in", values, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageBetween(Integer value1, Integer value2) {
            addCriterion("DemandMaxage between", value1, value2, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandmaxageNotBetween(Integer value1, Integer value2) {
            addCriterion("DemandMaxage not between", value1, value2, "demandmaxage");
            return (Criteria) this;
        }

        public Criteria andDemandheightIsNull() {
            addCriterion("DemandHeight is null");
            return (Criteria) this;
        }

        public Criteria andDemandheightIsNotNull() {
            addCriterion("DemandHeight is not null");
            return (Criteria) this;
        }

        public Criteria andDemandheightEqualTo(Float value) {
            addCriterion("DemandHeight =", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightNotEqualTo(Float value) {
            addCriterion("DemandHeight <>", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightGreaterThan(Float value) {
            addCriterion("DemandHeight >", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightGreaterThanOrEqualTo(Float value) {
            addCriterion("DemandHeight >=", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightLessThan(Float value) {
            addCriterion("DemandHeight <", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightLessThanOrEqualTo(Float value) {
            addCriterion("DemandHeight <=", value, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightIn(List<Float> values) {
            addCriterion("DemandHeight in", values, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightNotIn(List<Float> values) {
            addCriterion("DemandHeight not in", values, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightBetween(Float value1, Float value2) {
            addCriterion("DemandHeight between", value1, value2, "demandheight");
            return (Criteria) this;
        }

        public Criteria andDemandheightNotBetween(Float value1, Float value2) {
            addCriterion("DemandHeight not between", value1, value2, "demandheight");
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