package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsrsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUsridIsNull() {
            addCriterion("UsrId is null");
            return (Criteria) this;
        }

        public Criteria andUsridIsNotNull() {
            addCriterion("UsrId is not null");
            return (Criteria) this;
        }

        public Criteria andUsridEqualTo(Integer value) {
            addCriterion("UsrId =", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotEqualTo(Integer value) {
            addCriterion("UsrId <>", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridGreaterThan(Integer value) {
            addCriterion("UsrId >", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsrId >=", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridLessThan(Integer value) {
            addCriterion("UsrId <", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridLessThanOrEqualTo(Integer value) {
            addCriterion("UsrId <=", value, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridIn(List<Integer> values) {
            addCriterion("UsrId in", values, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotIn(List<Integer> values) {
            addCriterion("UsrId not in", values, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridBetween(Integer value1, Integer value2) {
            addCriterion("UsrId between", value1, value2, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsridNotBetween(Integer value1, Integer value2) {
            addCriterion("UsrId not between", value1, value2, "usrid");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNull() {
            addCriterion("UsrName is null");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNotNull() {
            addCriterion("UsrName is not null");
            return (Criteria) this;
        }

        public Criteria andUsrnameEqualTo(String value) {
            addCriterion("UsrName =", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotEqualTo(String value) {
            addCriterion("UsrName <>", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThan(String value) {
            addCriterion("UsrName >", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("UsrName >=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThan(String value) {
            addCriterion("UsrName <", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThanOrEqualTo(String value) {
            addCriterion("UsrName <=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLike(String value) {
            addCriterion("UsrName like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotLike(String value) {
            addCriterion("UsrName not like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameIn(List<String> values) {
            addCriterion("UsrName in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotIn(List<String> values) {
            addCriterion("UsrName not in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameBetween(String value1, String value2) {
            addCriterion("UsrName between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotBetween(String value1, String value2) {
            addCriterion("UsrName not between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrsexIsNull() {
            addCriterion("UsrSex is null");
            return (Criteria) this;
        }

        public Criteria andUsrsexIsNotNull() {
            addCriterion("UsrSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsrsexEqualTo(String value) {
            addCriterion("UsrSex =", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexNotEqualTo(String value) {
            addCriterion("UsrSex <>", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexGreaterThan(String value) {
            addCriterion("UsrSex >", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexGreaterThanOrEqualTo(String value) {
            addCriterion("UsrSex >=", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexLessThan(String value) {
            addCriterion("UsrSex <", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexLessThanOrEqualTo(String value) {
            addCriterion("UsrSex <=", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexLike(String value) {
            addCriterion("UsrSex like", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexNotLike(String value) {
            addCriterion("UsrSex not like", value, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexIn(List<String> values) {
            addCriterion("UsrSex in", values, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexNotIn(List<String> values) {
            addCriterion("UsrSex not in", values, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexBetween(String value1, String value2) {
            addCriterion("UsrSex between", value1, value2, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrsexNotBetween(String value1, String value2) {
            addCriterion("UsrSex not between", value1, value2, "usrsex");
            return (Criteria) this;
        }

        public Criteria andUsrbirthIsNull() {
            addCriterion("UsrBirth is null");
            return (Criteria) this;
        }

        public Criteria andUsrbirthIsNotNull() {
            addCriterion("UsrBirth is not null");
            return (Criteria) this;
        }

        public Criteria andUsrbirthEqualTo(Date value) {
            addCriterionForJDBCDate("UsrBirth =", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("UsrBirth <>", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("UsrBirth >", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UsrBirth >=", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthLessThan(Date value) {
            addCriterionForJDBCDate("UsrBirth <", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UsrBirth <=", value, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthIn(List<Date> values) {
            addCriterionForJDBCDate("UsrBirth in", values, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("UsrBirth not in", values, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UsrBirth between", value1, value2, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UsrBirth not between", value1, value2, "usrbirth");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationIsNull() {
            addCriterion("UsrConstellation is null");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationIsNotNull() {
            addCriterion("UsrConstellation is not null");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationEqualTo(String value) {
            addCriterion("UsrConstellation =", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationNotEqualTo(String value) {
            addCriterion("UsrConstellation <>", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationGreaterThan(String value) {
            addCriterion("UsrConstellation >", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationGreaterThanOrEqualTo(String value) {
            addCriterion("UsrConstellation >=", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationLessThan(String value) {
            addCriterion("UsrConstellation <", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationLessThanOrEqualTo(String value) {
            addCriterion("UsrConstellation <=", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationLike(String value) {
            addCriterion("UsrConstellation like", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationNotLike(String value) {
            addCriterion("UsrConstellation not like", value, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationIn(List<String> values) {
            addCriterion("UsrConstellation in", values, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationNotIn(List<String> values) {
            addCriterion("UsrConstellation not in", values, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationBetween(String value1, String value2) {
            addCriterion("UsrConstellation between", value1, value2, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrconstellationNotBetween(String value1, String value2) {
            addCriterion("UsrConstellation not between", value1, value2, "usrconstellation");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateIsNull() {
            addCriterion("UsrMaritalstate is null");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateIsNotNull() {
            addCriterion("UsrMaritalstate is not null");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateEqualTo(String value) {
            addCriterion("UsrMaritalstate =", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateNotEqualTo(String value) {
            addCriterion("UsrMaritalstate <>", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateGreaterThan(String value) {
            addCriterion("UsrMaritalstate >", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateGreaterThanOrEqualTo(String value) {
            addCriterion("UsrMaritalstate >=", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateLessThan(String value) {
            addCriterion("UsrMaritalstate <", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateLessThanOrEqualTo(String value) {
            addCriterion("UsrMaritalstate <=", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateLike(String value) {
            addCriterion("UsrMaritalstate like", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateNotLike(String value) {
            addCriterion("UsrMaritalstate not like", value, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateIn(List<String> values) {
            addCriterion("UsrMaritalstate in", values, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateNotIn(List<String> values) {
            addCriterion("UsrMaritalstate not in", values, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateBetween(String value1, String value2) {
            addCriterion("UsrMaritalstate between", value1, value2, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrmaritalstateNotBetween(String value1, String value2) {
            addCriterion("UsrMaritalstate not between", value1, value2, "usrmaritalstate");
            return (Criteria) this;
        }

        public Criteria andUsrheightIsNull() {
            addCriterion("UsrHeight is null");
            return (Criteria) this;
        }

        public Criteria andUsrheightIsNotNull() {
            addCriterion("UsrHeight is not null");
            return (Criteria) this;
        }

        public Criteria andUsrheightEqualTo(Float value) {
            addCriterion("UsrHeight =", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightNotEqualTo(Float value) {
            addCriterion("UsrHeight <>", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightGreaterThan(Float value) {
            addCriterion("UsrHeight >", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightGreaterThanOrEqualTo(Float value) {
            addCriterion("UsrHeight >=", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightLessThan(Float value) {
            addCriterion("UsrHeight <", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightLessThanOrEqualTo(Float value) {
            addCriterion("UsrHeight <=", value, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightIn(List<Float> values) {
            addCriterion("UsrHeight in", values, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightNotIn(List<Float> values) {
            addCriterion("UsrHeight not in", values, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightBetween(Float value1, Float value2) {
            addCriterion("UsrHeight between", value1, value2, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsrheightNotBetween(Float value1, Float value2) {
            addCriterion("UsrHeight not between", value1, value2, "usrheight");
            return (Criteria) this;
        }

        public Criteria andUsreducationIsNull() {
            addCriterion("UsrEducation is null");
            return (Criteria) this;
        }

        public Criteria andUsreducationIsNotNull() {
            addCriterion("UsrEducation is not null");
            return (Criteria) this;
        }

        public Criteria andUsreducationEqualTo(String value) {
            addCriterion("UsrEducation =", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationNotEqualTo(String value) {
            addCriterion("UsrEducation <>", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationGreaterThan(String value) {
            addCriterion("UsrEducation >", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationGreaterThanOrEqualTo(String value) {
            addCriterion("UsrEducation >=", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationLessThan(String value) {
            addCriterion("UsrEducation <", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationLessThanOrEqualTo(String value) {
            addCriterion("UsrEducation <=", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationLike(String value) {
            addCriterion("UsrEducation like", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationNotLike(String value) {
            addCriterion("UsrEducation not like", value, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationIn(List<String> values) {
            addCriterion("UsrEducation in", values, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationNotIn(List<String> values) {
            addCriterion("UsrEducation not in", values, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationBetween(String value1, String value2) {
            addCriterion("UsrEducation between", value1, value2, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsreducationNotBetween(String value1, String value2) {
            addCriterion("UsrEducation not between", value1, value2, "usreducation");
            return (Criteria) this;
        }

        public Criteria andUsrincomeIsNull() {
            addCriterion("UsrIncome is null");
            return (Criteria) this;
        }

        public Criteria andUsrincomeIsNotNull() {
            addCriterion("UsrIncome is not null");
            return (Criteria) this;
        }

        public Criteria andUsrincomeEqualTo(Integer value) {
            addCriterion("UsrIncome =", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeNotEqualTo(Integer value) {
            addCriterion("UsrIncome <>", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeGreaterThan(Integer value) {
            addCriterion("UsrIncome >", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsrIncome >=", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeLessThan(Integer value) {
            addCriterion("UsrIncome <", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeLessThanOrEqualTo(Integer value) {
            addCriterion("UsrIncome <=", value, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeIn(List<Integer> values) {
            addCriterion("UsrIncome in", values, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeNotIn(List<Integer> values) {
            addCriterion("UsrIncome not in", values, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeBetween(Integer value1, Integer value2) {
            addCriterion("UsrIncome between", value1, value2, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsrincomeNotBetween(Integer value1, Integer value2) {
            addCriterion("UsrIncome not between", value1, value2, "usrincome");
            return (Criteria) this;
        }

        public Criteria andUsroccupationIsNull() {
            addCriterion("UsrOccupation is null");
            return (Criteria) this;
        }

        public Criteria andUsroccupationIsNotNull() {
            addCriterion("UsrOccupation is not null");
            return (Criteria) this;
        }

        public Criteria andUsroccupationEqualTo(String value) {
            addCriterion("UsrOccupation =", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationNotEqualTo(String value) {
            addCriterion("UsrOccupation <>", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationGreaterThan(String value) {
            addCriterion("UsrOccupation >", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationGreaterThanOrEqualTo(String value) {
            addCriterion("UsrOccupation >=", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationLessThan(String value) {
            addCriterion("UsrOccupation <", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationLessThanOrEqualTo(String value) {
            addCriterion("UsrOccupation <=", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationLike(String value) {
            addCriterion("UsrOccupation like", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationNotLike(String value) {
            addCriterion("UsrOccupation not like", value, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationIn(List<String> values) {
            addCriterion("UsrOccupation in", values, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationNotIn(List<String> values) {
            addCriterion("UsrOccupation not in", values, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationBetween(String value1, String value2) {
            addCriterion("UsrOccupation between", value1, value2, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsroccupationNotBetween(String value1, String value2) {
            addCriterion("UsrOccupation not between", value1, value2, "usroccupation");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateIsNull() {
            addCriterion("UsrPhotostate is null");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateIsNotNull() {
            addCriterion("UsrPhotostate is not null");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateEqualTo(String value) {
            addCriterion("UsrPhotostate =", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateNotEqualTo(String value) {
            addCriterion("UsrPhotostate <>", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateGreaterThan(String value) {
            addCriterion("UsrPhotostate >", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateGreaterThanOrEqualTo(String value) {
            addCriterion("UsrPhotostate >=", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateLessThan(String value) {
            addCriterion("UsrPhotostate <", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateLessThanOrEqualTo(String value) {
            addCriterion("UsrPhotostate <=", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateLike(String value) {
            addCriterion("UsrPhotostate like", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateNotLike(String value) {
            addCriterion("UsrPhotostate not like", value, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateIn(List<String> values) {
            addCriterion("UsrPhotostate in", values, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateNotIn(List<String> values) {
            addCriterion("UsrPhotostate not in", values, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateBetween(String value1, String value2) {
            addCriterion("UsrPhotostate between", value1, value2, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrphotostateNotBetween(String value1, String value2) {
            addCriterion("UsrPhotostate not between", value1, value2, "usrphotostate");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidIsNull() {
            addCriterion("UsrHeadsculptureId is null");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidIsNotNull() {
            addCriterion("UsrHeadsculptureId is not null");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidEqualTo(Integer value) {
            addCriterion("UsrHeadsculptureId =", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidNotEqualTo(Integer value) {
            addCriterion("UsrHeadsculptureId <>", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidGreaterThan(Integer value) {
            addCriterion("UsrHeadsculptureId >", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsrHeadsculptureId >=", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidLessThan(Integer value) {
            addCriterion("UsrHeadsculptureId <", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidLessThanOrEqualTo(Integer value) {
            addCriterion("UsrHeadsculptureId <=", value, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidIn(List<Integer> values) {
            addCriterion("UsrHeadsculptureId in", values, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidNotIn(List<Integer> values) {
            addCriterion("UsrHeadsculptureId not in", values, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidBetween(Integer value1, Integer value2) {
            addCriterion("UsrHeadsculptureId between", value1, value2, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrheadsculptureidNotBetween(Integer value1, Integer value2) {
            addCriterion("UsrHeadsculptureId not between", value1, value2, "usrheadsculptureid");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitIsNull() {
            addCriterion("UsrIfprohibit is null");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitIsNotNull() {
            addCriterion("UsrIfprohibit is not null");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitEqualTo(String value) {
            addCriterion("UsrIfprohibit =", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitNotEqualTo(String value) {
            addCriterion("UsrIfprohibit <>", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitGreaterThan(String value) {
            addCriterion("UsrIfprohibit >", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitGreaterThanOrEqualTo(String value) {
            addCriterion("UsrIfprohibit >=", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitLessThan(String value) {
            addCriterion("UsrIfprohibit <", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitLessThanOrEqualTo(String value) {
            addCriterion("UsrIfprohibit <=", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitLike(String value) {
            addCriterion("UsrIfprohibit like", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitNotLike(String value) {
            addCriterion("UsrIfprohibit not like", value, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitIn(List<String> values) {
            addCriterion("UsrIfprohibit in", values, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitNotIn(List<String> values) {
            addCriterion("UsrIfprohibit not in", values, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitBetween(String value1, String value2) {
            addCriterion("UsrIfprohibit between", value1, value2, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrifprohibitNotBetween(String value1, String value2) {
            addCriterion("UsrIfprohibit not between", value1, value2, "usrifprohibit");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordIsNull() {
            addCriterion("UsrsPassword is null");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordIsNotNull() {
            addCriterion("UsrsPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordEqualTo(String value) {
            addCriterion("UsrsPassword =", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordNotEqualTo(String value) {
            addCriterion("UsrsPassword <>", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordGreaterThan(String value) {
            addCriterion("UsrsPassword >", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UsrsPassword >=", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordLessThan(String value) {
            addCriterion("UsrsPassword <", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordLessThanOrEqualTo(String value) {
            addCriterion("UsrsPassword <=", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordLike(String value) {
            addCriterion("UsrsPassword like", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordNotLike(String value) {
            addCriterion("UsrsPassword not like", value, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordIn(List<String> values) {
            addCriterion("UsrsPassword in", values, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordNotIn(List<String> values) {
            addCriterion("UsrsPassword not in", values, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordBetween(String value1, String value2) {
            addCriterion("UsrsPassword between", value1, value2, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrspasswordNotBetween(String value1, String value2) {
            addCriterion("UsrsPassword not between", value1, value2, "usrspassword");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureIsNull() {
            addCriterion("UsrsSignature is null");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureIsNotNull() {
            addCriterion("UsrsSignature is not null");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureEqualTo(String value) {
            addCriterion("UsrsSignature =", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureNotEqualTo(String value) {
            addCriterion("UsrsSignature <>", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureGreaterThan(String value) {
            addCriterion("UsrsSignature >", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureGreaterThanOrEqualTo(String value) {
            addCriterion("UsrsSignature >=", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureLessThan(String value) {
            addCriterion("UsrsSignature <", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureLessThanOrEqualTo(String value) {
            addCriterion("UsrsSignature <=", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureLike(String value) {
            addCriterion("UsrsSignature like", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureNotLike(String value) {
            addCriterion("UsrsSignature not like", value, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureIn(List<String> values) {
            addCriterion("UsrsSignature in", values, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureNotIn(List<String> values) {
            addCriterion("UsrsSignature not in", values, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureBetween(String value1, String value2) {
            addCriterion("UsrsSignature between", value1, value2, "usrssignature");
            return (Criteria) this;
        }

        public Criteria andUsrssignatureNotBetween(String value1, String value2) {
            addCriterion("UsrsSignature not between", value1, value2, "usrssignature");
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