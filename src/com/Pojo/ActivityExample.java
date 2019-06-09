package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActivityidIsNull() {
            addCriterion("ActivityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("ActivityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("ActivityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("ActivityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("ActivityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("ActivityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("ActivityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("ActivityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("ActivityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityId not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNull() {
            addCriterion("ActivityName is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("ActivityName is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("ActivityName =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("ActivityName <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("ActivityName >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityName >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("ActivityName <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("ActivityName <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("ActivityName like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("ActivityName not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("ActivityName in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("ActivityName not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("ActivityName between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("ActivityName not between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIsNull() {
            addCriterion("ActivityStarttime is null");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIsNotNull() {
            addCriterion("ActivityStarttime is not null");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeEqualTo(Date value) {
            addCriterion("ActivityStarttime =", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotEqualTo(Date value) {
            addCriterion("ActivityStarttime <>", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeGreaterThan(Date value) {
            addCriterion("ActivityStarttime >", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ActivityStarttime >=", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeLessThan(Date value) {
            addCriterion("ActivityStarttime <", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ActivityStarttime <=", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIn(List<Date> values) {
            addCriterion("ActivityStarttime in", values, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotIn(List<Date> values) {
            addCriterion("ActivityStarttime not in", values, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeBetween(Date value1, Date value2) {
            addCriterion("ActivityStarttime between", value1, value2, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ActivityStarttime not between", value1, value2, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeIsNull() {
            addCriterion("ActivityEndtime is null");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeIsNotNull() {
            addCriterion("ActivityEndtime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeEqualTo(Date value) {
            addCriterion("ActivityEndtime =", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeNotEqualTo(Date value) {
            addCriterion("ActivityEndtime <>", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeGreaterThan(Date value) {
            addCriterion("ActivityEndtime >", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ActivityEndtime >=", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeLessThan(Date value) {
            addCriterion("ActivityEndtime <", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeLessThanOrEqualTo(Date value) {
            addCriterion("ActivityEndtime <=", value, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeIn(List<Date> values) {
            addCriterion("ActivityEndtime in", values, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeNotIn(List<Date> values) {
            addCriterion("ActivityEndtime not in", values, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeBetween(Date value1, Date value2) {
            addCriterion("ActivityEndtime between", value1, value2, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityendtimeNotBetween(Date value1, Date value2) {
            addCriterion("ActivityEndtime not between", value1, value2, "activityendtime");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNull() {
            addCriterion("ActivityAddress is null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNotNull() {
            addCriterion("ActivityAddress is not null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressEqualTo(String value) {
            addCriterion("ActivityAddress =", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotEqualTo(String value) {
            addCriterion("ActivityAddress <>", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThan(String value) {
            addCriterion("ActivityAddress >", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityAddress >=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThan(String value) {
            addCriterion("ActivityAddress <", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThanOrEqualTo(String value) {
            addCriterion("ActivityAddress <=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLike(String value) {
            addCriterion("ActivityAddress like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotLike(String value) {
            addCriterion("ActivityAddress not like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIn(List<String> values) {
            addCriterion("ActivityAddress in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotIn(List<String> values) {
            addCriterion("ActivityAddress not in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressBetween(String value1, String value2) {
            addCriterion("ActivityAddress between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotBetween(String value1, String value2) {
            addCriterion("ActivityAddress not between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("ActivityType is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("ActivityType is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(String value) {
            addCriterion("ActivityType =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(String value) {
            addCriterion("ActivityType <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(String value) {
            addCriterion("ActivityType >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityType >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(String value) {
            addCriterion("ActivityType <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(String value) {
            addCriterion("ActivityType <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLike(String value) {
            addCriterion("ActivityType like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotLike(String value) {
            addCriterion("ActivityType not like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<String> values) {
            addCriterion("ActivityType in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<String> values) {
            addCriterion("ActivityType not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(String value1, String value2) {
            addCriterion("ActivityType between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(String value1, String value2) {
            addCriterion("ActivityType not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeIsNull() {
            addCriterion("ActivityDescribe is null");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeIsNotNull() {
            addCriterion("ActivityDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeEqualTo(String value) {
            addCriterion("ActivityDescribe =", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeNotEqualTo(String value) {
            addCriterion("ActivityDescribe <>", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeGreaterThan(String value) {
            addCriterion("ActivityDescribe >", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityDescribe >=", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeLessThan(String value) {
            addCriterion("ActivityDescribe <", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeLessThanOrEqualTo(String value) {
            addCriterion("ActivityDescribe <=", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeLike(String value) {
            addCriterion("ActivityDescribe like", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeNotLike(String value) {
            addCriterion("ActivityDescribe not like", value, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeIn(List<String> values) {
            addCriterion("ActivityDescribe in", values, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeNotIn(List<String> values) {
            addCriterion("ActivityDescribe not in", values, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeBetween(String value1, String value2) {
            addCriterion("ActivityDescribe between", value1, value2, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitydescribeNotBetween(String value1, String value2) {
            addCriterion("ActivityDescribe not between", value1, value2, "activitydescribe");
            return (Criteria) this;
        }

        public Criteria andActivitycostIsNull() {
            addCriterion("ActivityCost is null");
            return (Criteria) this;
        }

        public Criteria andActivitycostIsNotNull() {
            addCriterion("ActivityCost is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycostEqualTo(Integer value) {
            addCriterion("ActivityCost =", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostNotEqualTo(Integer value) {
            addCriterion("ActivityCost <>", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostGreaterThan(Integer value) {
            addCriterion("ActivityCost >", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityCost >=", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostLessThan(Integer value) {
            addCriterion("ActivityCost <", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityCost <=", value, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostIn(List<Integer> values) {
            addCriterion("ActivityCost in", values, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostNotIn(List<Integer> values) {
            addCriterion("ActivityCost not in", values, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostBetween(Integer value1, Integer value2) {
            addCriterion("ActivityCost between", value1, value2, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityCost not between", value1, value2, "activitycost");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainIsNull() {
            addCriterion("ActivityCostexplain is null");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainIsNotNull() {
            addCriterion("ActivityCostexplain is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainEqualTo(String value) {
            addCriterion("ActivityCostexplain =", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainNotEqualTo(String value) {
            addCriterion("ActivityCostexplain <>", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainGreaterThan(String value) {
            addCriterion("ActivityCostexplain >", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityCostexplain >=", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainLessThan(String value) {
            addCriterion("ActivityCostexplain <", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainLessThanOrEqualTo(String value) {
            addCriterion("ActivityCostexplain <=", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainLike(String value) {
            addCriterion("ActivityCostexplain like", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainNotLike(String value) {
            addCriterion("ActivityCostexplain not like", value, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainIn(List<String> values) {
            addCriterion("ActivityCostexplain in", values, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainNotIn(List<String> values) {
            addCriterion("ActivityCostexplain not in", values, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainBetween(String value1, String value2) {
            addCriterion("ActivityCostexplain between", value1, value2, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycostexplainNotBetween(String value1, String value2) {
            addCriterion("ActivityCostexplain not between", value1, value2, "activitycostexplain");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberIsNull() {
            addCriterion("ActivityCallnumber is null");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberIsNotNull() {
            addCriterion("ActivityCallnumber is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberEqualTo(String value) {
            addCriterion("ActivityCallnumber =", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberNotEqualTo(String value) {
            addCriterion("ActivityCallnumber <>", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberGreaterThan(String value) {
            addCriterion("ActivityCallnumber >", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityCallnumber >=", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberLessThan(String value) {
            addCriterion("ActivityCallnumber <", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberLessThanOrEqualTo(String value) {
            addCriterion("ActivityCallnumber <=", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberLike(String value) {
            addCriterion("ActivityCallnumber like", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberNotLike(String value) {
            addCriterion("ActivityCallnumber not like", value, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberIn(List<String> values) {
            addCriterion("ActivityCallnumber in", values, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberNotIn(List<String> values) {
            addCriterion("ActivityCallnumber not in", values, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberBetween(String value1, String value2) {
            addCriterion("ActivityCallnumber between", value1, value2, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitycallnumberNotBetween(String value1, String value2) {
            addCriterion("ActivityCallnumber not between", value1, value2, "activitycallnumber");
            return (Criteria) this;
        }

        public Criteria andActivitystateIsNull() {
            addCriterion("ActivityState is null");
            return (Criteria) this;
        }

        public Criteria andActivitystateIsNotNull() {
            addCriterion("ActivityState is not null");
            return (Criteria) this;
        }

        public Criteria andActivitystateEqualTo(String value) {
            addCriterion("ActivityState =", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateNotEqualTo(String value) {
            addCriterion("ActivityState <>", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateGreaterThan(String value) {
            addCriterion("ActivityState >", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityState >=", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateLessThan(String value) {
            addCriterion("ActivityState <", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateLessThanOrEqualTo(String value) {
            addCriterion("ActivityState <=", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateLike(String value) {
            addCriterion("ActivityState like", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateNotLike(String value) {
            addCriterion("ActivityState not like", value, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateIn(List<String> values) {
            addCriterion("ActivityState in", values, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateNotIn(List<String> values) {
            addCriterion("ActivityState not in", values, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateBetween(String value1, String value2) {
            addCriterion("ActivityState between", value1, value2, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivitystateNotBetween(String value1, String value2) {
            addCriterion("ActivityState not between", value1, value2, "activitystate");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedIsNull() {
            addCriterion("ActivityIfdeleted is null");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedIsNotNull() {
            addCriterion("ActivityIfdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedEqualTo(String value) {
            addCriterion("ActivityIfdeleted =", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedNotEqualTo(String value) {
            addCriterion("ActivityIfdeleted <>", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedGreaterThan(String value) {
            addCriterion("ActivityIfdeleted >", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityIfdeleted >=", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedLessThan(String value) {
            addCriterion("ActivityIfdeleted <", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedLessThanOrEqualTo(String value) {
            addCriterion("ActivityIfdeleted <=", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedLike(String value) {
            addCriterion("ActivityIfdeleted like", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedNotLike(String value) {
            addCriterion("ActivityIfdeleted not like", value, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedIn(List<String> values) {
            addCriterion("ActivityIfdeleted in", values, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedNotIn(List<String> values) {
            addCriterion("ActivityIfdeleted not in", values, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedBetween(String value1, String value2) {
            addCriterion("ActivityIfdeleted between", value1, value2, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityifdeletedNotBetween(String value1, String value2) {
            addCriterion("ActivityIfdeleted not between", value1, value2, "activityifdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitIsNull() {
            addCriterion("ActivityBoylimit is null");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitIsNotNull() {
            addCriterion("ActivityBoylimit is not null");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitEqualTo(Integer value) {
            addCriterion("ActivityBoylimit =", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitNotEqualTo(Integer value) {
            addCriterion("ActivityBoylimit <>", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitGreaterThan(Integer value) {
            addCriterion("ActivityBoylimit >", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityBoylimit >=", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitLessThan(Integer value) {
            addCriterion("ActivityBoylimit <", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityBoylimit <=", value, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitIn(List<Integer> values) {
            addCriterion("ActivityBoylimit in", values, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitNotIn(List<Integer> values) {
            addCriterion("ActivityBoylimit not in", values, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitBetween(Integer value1, Integer value2) {
            addCriterion("ActivityBoylimit between", value1, value2, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivityboylimitNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityBoylimit not between", value1, value2, "activityboylimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitIsNull() {
            addCriterion("ActivityGirllimit is null");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitIsNotNull() {
            addCriterion("ActivityGirllimit is not null");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitEqualTo(Integer value) {
            addCriterion("ActivityGirllimit =", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitNotEqualTo(Integer value) {
            addCriterion("ActivityGirllimit <>", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitGreaterThan(Integer value) {
            addCriterion("ActivityGirllimit >", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityGirllimit >=", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitLessThan(Integer value) {
            addCriterion("ActivityGirllimit <", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityGirllimit <=", value, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitIn(List<Integer> values) {
            addCriterion("ActivityGirllimit in", values, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitNotIn(List<Integer> values) {
            addCriterion("ActivityGirllimit not in", values, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitBetween(Integer value1, Integer value2) {
            addCriterion("ActivityGirllimit between", value1, value2, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivitygirllimitNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityGirllimit not between", value1, value2, "activitygirllimit");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerIsNull() {
            addCriterion("ActivityOrganizer is null");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerIsNotNull() {
            addCriterion("ActivityOrganizer is not null");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerEqualTo(String value) {
            addCriterion("ActivityOrganizer =", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerNotEqualTo(String value) {
            addCriterion("ActivityOrganizer <>", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerGreaterThan(String value) {
            addCriterion("ActivityOrganizer >", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityOrganizer >=", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerLessThan(String value) {
            addCriterion("ActivityOrganizer <", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerLessThanOrEqualTo(String value) {
            addCriterion("ActivityOrganizer <=", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerLike(String value) {
            addCriterion("ActivityOrganizer like", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerNotLike(String value) {
            addCriterion("ActivityOrganizer not like", value, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerIn(List<String> values) {
            addCriterion("ActivityOrganizer in", values, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerNotIn(List<String> values) {
            addCriterion("ActivityOrganizer not in", values, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerBetween(String value1, String value2) {
            addCriterion("ActivityOrganizer between", value1, value2, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizerNotBetween(String value1, String value2) {
            addCriterion("ActivityOrganizer not between", value1, value2, "activityorganizer");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailIsNull() {
            addCriterion("ActivityOrganizerEmail is null");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailIsNotNull() {
            addCriterion("ActivityOrganizerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailEqualTo(String value) {
            addCriterion("ActivityOrganizerEmail =", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailNotEqualTo(String value) {
            addCriterion("ActivityOrganizerEmail <>", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailGreaterThan(String value) {
            addCriterion("ActivityOrganizerEmail >", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityOrganizerEmail >=", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailLessThan(String value) {
            addCriterion("ActivityOrganizerEmail <", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailLessThanOrEqualTo(String value) {
            addCriterion("ActivityOrganizerEmail <=", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailLike(String value) {
            addCriterion("ActivityOrganizerEmail like", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailNotLike(String value) {
            addCriterion("ActivityOrganizerEmail not like", value, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailIn(List<String> values) {
            addCriterion("ActivityOrganizerEmail in", values, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailNotIn(List<String> values) {
            addCriterion("ActivityOrganizerEmail not in", values, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailBetween(String value1, String value2) {
            addCriterion("ActivityOrganizerEmail between", value1, value2, "activityorganizeremail");
            return (Criteria) this;
        }

        public Criteria andActivityorganizeremailNotBetween(String value1, String value2) {
            addCriterion("ActivityOrganizerEmail not between", value1, value2, "activityorganizeremail");
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