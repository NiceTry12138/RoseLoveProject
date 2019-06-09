package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNull() {
            addCriterion("CommentContent is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("CommentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("CommentContent =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("CommentContent <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("CommentContent >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CommentContent >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("CommentContent <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("CommentContent <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("CommentContent like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("CommentContent not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("CommentContent in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("CommentContent not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("CommentContent between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("CommentContent not between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("CommentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("CommentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("CommentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("CommentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("CommentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CommentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("CommentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("CommentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("CommentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("CommentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("CommentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("CommentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameIsNull() {
            addCriterion("CommentPeoplename is null");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameIsNotNull() {
            addCriterion("CommentPeoplename is not null");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameEqualTo(String value) {
            addCriterion("CommentPeoplename =", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameNotEqualTo(String value) {
            addCriterion("CommentPeoplename <>", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameGreaterThan(String value) {
            addCriterion("CommentPeoplename >", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameGreaterThanOrEqualTo(String value) {
            addCriterion("CommentPeoplename >=", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameLessThan(String value) {
            addCriterion("CommentPeoplename <", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameLessThanOrEqualTo(String value) {
            addCriterion("CommentPeoplename <=", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameLike(String value) {
            addCriterion("CommentPeoplename like", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameNotLike(String value) {
            addCriterion("CommentPeoplename not like", value, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameIn(List<String> values) {
            addCriterion("CommentPeoplename in", values, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameNotIn(List<String> values) {
            addCriterion("CommentPeoplename not in", values, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameBetween(String value1, String value2) {
            addCriterion("CommentPeoplename between", value1, value2, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentpeoplenameNotBetween(String value1, String value2) {
            addCriterion("CommentPeoplename not between", value1, value2, "commentpeoplename");
            return (Criteria) this;
        }

        public Criteria andCommentstateIsNull() {
            addCriterion("CommentState is null");
            return (Criteria) this;
        }

        public Criteria andCommentstateIsNotNull() {
            addCriterion("CommentState is not null");
            return (Criteria) this;
        }

        public Criteria andCommentstateEqualTo(String value) {
            addCriterion("CommentState =", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotEqualTo(String value) {
            addCriterion("CommentState <>", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateGreaterThan(String value) {
            addCriterion("CommentState >", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateGreaterThanOrEqualTo(String value) {
            addCriterion("CommentState >=", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateLessThan(String value) {
            addCriterion("CommentState <", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateLessThanOrEqualTo(String value) {
            addCriterion("CommentState <=", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateLike(String value) {
            addCriterion("CommentState like", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotLike(String value) {
            addCriterion("CommentState not like", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateIn(List<String> values) {
            addCriterion("CommentState in", values, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotIn(List<String> values) {
            addCriterion("CommentState not in", values, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateBetween(String value1, String value2) {
            addCriterion("CommentState between", value1, value2, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotBetween(String value1, String value2) {
            addCriterion("CommentState not between", value1, value2, "commentstate");
            return (Criteria) this;
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

        public Criteria andCommentifdeletedIsNull() {
            addCriterion("CommentIfdeleted is null");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedIsNotNull() {
            addCriterion("CommentIfdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedEqualTo(String value) {
            addCriterion("CommentIfdeleted =", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedNotEqualTo(String value) {
            addCriterion("CommentIfdeleted <>", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedGreaterThan(String value) {
            addCriterion("CommentIfdeleted >", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("CommentIfdeleted >=", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedLessThan(String value) {
            addCriterion("CommentIfdeleted <", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedLessThanOrEqualTo(String value) {
            addCriterion("CommentIfdeleted <=", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedLike(String value) {
            addCriterion("CommentIfdeleted like", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedNotLike(String value) {
            addCriterion("CommentIfdeleted not like", value, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedIn(List<String> values) {
            addCriterion("CommentIfdeleted in", values, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedNotIn(List<String> values) {
            addCriterion("CommentIfdeleted not in", values, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedBetween(String value1, String value2) {
            addCriterion("CommentIfdeleted between", value1, value2, "commentifdeleted");
            return (Criteria) this;
        }

        public Criteria andCommentifdeletedNotBetween(String value1, String value2) {
            addCriterion("CommentIfdeleted not between", value1, value2, "commentifdeleted");
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