package com.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailExample() {
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

        public Criteria andEmailidIsNull() {
            addCriterion("EmailId is null");
            return (Criteria) this;
        }

        public Criteria andEmailidIsNotNull() {
            addCriterion("EmailId is not null");
            return (Criteria) this;
        }

        public Criteria andEmailidEqualTo(Integer value) {
            addCriterion("EmailId =", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotEqualTo(Integer value) {
            addCriterion("EmailId <>", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThan(Integer value) {
            addCriterion("EmailId >", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmailId >=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThan(Integer value) {
            addCriterion("EmailId <", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThanOrEqualTo(Integer value) {
            addCriterion("EmailId <=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidIn(List<Integer> values) {
            addCriterion("EmailId in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotIn(List<Integer> values) {
            addCriterion("EmailId not in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidBetween(Integer value1, Integer value2) {
            addCriterion("EmailId between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmailId not between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailsenderIsNull() {
            addCriterion("EmailSender is null");
            return (Criteria) this;
        }

        public Criteria andEmailsenderIsNotNull() {
            addCriterion("EmailSender is not null");
            return (Criteria) this;
        }

        public Criteria andEmailsenderEqualTo(String value) {
            addCriterion("EmailSender =", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderNotEqualTo(String value) {
            addCriterion("EmailSender <>", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderGreaterThan(String value) {
            addCriterion("EmailSender >", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderGreaterThanOrEqualTo(String value) {
            addCriterion("EmailSender >=", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderLessThan(String value) {
            addCriterion("EmailSender <", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderLessThanOrEqualTo(String value) {
            addCriterion("EmailSender <=", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderLike(String value) {
            addCriterion("EmailSender like", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderNotLike(String value) {
            addCriterion("EmailSender not like", value, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderIn(List<String> values) {
            addCriterion("EmailSender in", values, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderNotIn(List<String> values) {
            addCriterion("EmailSender not in", values, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderBetween(String value1, String value2) {
            addCriterion("EmailSender between", value1, value2, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailsenderNotBetween(String value1, String value2) {
            addCriterion("EmailSender not between", value1, value2, "emailsender");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientIsNull() {
            addCriterion("EmailRecipient is null");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientIsNotNull() {
            addCriterion("EmailRecipient is not null");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientEqualTo(String value) {
            addCriterion("EmailRecipient =", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientNotEqualTo(String value) {
            addCriterion("EmailRecipient <>", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientGreaterThan(String value) {
            addCriterion("EmailRecipient >", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientGreaterThanOrEqualTo(String value) {
            addCriterion("EmailRecipient >=", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientLessThan(String value) {
            addCriterion("EmailRecipient <", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientLessThanOrEqualTo(String value) {
            addCriterion("EmailRecipient <=", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientLike(String value) {
            addCriterion("EmailRecipient like", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientNotLike(String value) {
            addCriterion("EmailRecipient not like", value, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientIn(List<String> values) {
            addCriterion("EmailRecipient in", values, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientNotIn(List<String> values) {
            addCriterion("EmailRecipient not in", values, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientBetween(String value1, String value2) {
            addCriterion("EmailRecipient between", value1, value2, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailrecipientNotBetween(String value1, String value2) {
            addCriterion("EmailRecipient not between", value1, value2, "emailrecipient");
            return (Criteria) this;
        }

        public Criteria andEmailthemeIsNull() {
            addCriterion("EmailTheme is null");
            return (Criteria) this;
        }

        public Criteria andEmailthemeIsNotNull() {
            addCriterion("EmailTheme is not null");
            return (Criteria) this;
        }

        public Criteria andEmailthemeEqualTo(String value) {
            addCriterion("EmailTheme =", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeNotEqualTo(String value) {
            addCriterion("EmailTheme <>", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeGreaterThan(String value) {
            addCriterion("EmailTheme >", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeGreaterThanOrEqualTo(String value) {
            addCriterion("EmailTheme >=", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeLessThan(String value) {
            addCriterion("EmailTheme <", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeLessThanOrEqualTo(String value) {
            addCriterion("EmailTheme <=", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeLike(String value) {
            addCriterion("EmailTheme like", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeNotLike(String value) {
            addCriterion("EmailTheme not like", value, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeIn(List<String> values) {
            addCriterion("EmailTheme in", values, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeNotIn(List<String> values) {
            addCriterion("EmailTheme not in", values, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeBetween(String value1, String value2) {
            addCriterion("EmailTheme between", value1, value2, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailthemeNotBetween(String value1, String value2) {
            addCriterion("EmailTheme not between", value1, value2, "emailtheme");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeIsNull() {
            addCriterion("EmailSendtime is null");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeIsNotNull() {
            addCriterion("EmailSendtime is not null");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeEqualTo(Date value) {
            addCriterion("EmailSendtime =", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeNotEqualTo(Date value) {
            addCriterion("EmailSendtime <>", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeGreaterThan(Date value) {
            addCriterion("EmailSendtime >", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EmailSendtime >=", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeLessThan(Date value) {
            addCriterion("EmailSendtime <", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeLessThanOrEqualTo(Date value) {
            addCriterion("EmailSendtime <=", value, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeIn(List<Date> values) {
            addCriterion("EmailSendtime in", values, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeNotIn(List<Date> values) {
            addCriterion("EmailSendtime not in", values, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeBetween(Date value1, Date value2) {
            addCriterion("EmailSendtime between", value1, value2, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailsendtimeNotBetween(Date value1, Date value2) {
            addCriterion("EmailSendtime not between", value1, value2, "emailsendtime");
            return (Criteria) this;
        }

        public Criteria andEmailcontentIsNull() {
            addCriterion("EmailContent is null");
            return (Criteria) this;
        }

        public Criteria andEmailcontentIsNotNull() {
            addCriterion("EmailContent is not null");
            return (Criteria) this;
        }

        public Criteria andEmailcontentEqualTo(String value) {
            addCriterion("EmailContent =", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentNotEqualTo(String value) {
            addCriterion("EmailContent <>", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentGreaterThan(String value) {
            addCriterion("EmailContent >", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentGreaterThanOrEqualTo(String value) {
            addCriterion("EmailContent >=", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentLessThan(String value) {
            addCriterion("EmailContent <", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentLessThanOrEqualTo(String value) {
            addCriterion("EmailContent <=", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentLike(String value) {
            addCriterion("EmailContent like", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentNotLike(String value) {
            addCriterion("EmailContent not like", value, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentIn(List<String> values) {
            addCriterion("EmailContent in", values, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentNotIn(List<String> values) {
            addCriterion("EmailContent not in", values, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentBetween(String value1, String value2) {
            addCriterion("EmailContent between", value1, value2, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailcontentNotBetween(String value1, String value2) {
            addCriterion("EmailContent not between", value1, value2, "emailcontent");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedIsNull() {
            addCriterion("EmailIfdeleted is null");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedIsNotNull() {
            addCriterion("EmailIfdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedEqualTo(String value) {
            addCriterion("EmailIfdeleted =", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedNotEqualTo(String value) {
            addCriterion("EmailIfdeleted <>", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedGreaterThan(String value) {
            addCriterion("EmailIfdeleted >", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("EmailIfdeleted >=", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedLessThan(String value) {
            addCriterion("EmailIfdeleted <", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedLessThanOrEqualTo(String value) {
            addCriterion("EmailIfdeleted <=", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedLike(String value) {
            addCriterion("EmailIfdeleted like", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedNotLike(String value) {
            addCriterion("EmailIfdeleted not like", value, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedIn(List<String> values) {
            addCriterion("EmailIfdeleted in", values, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedNotIn(List<String> values) {
            addCriterion("EmailIfdeleted not in", values, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedBetween(String value1, String value2) {
            addCriterion("EmailIfdeleted between", value1, value2, "emailifdeleted");
            return (Criteria) this;
        }

        public Criteria andEmailifdeletedNotBetween(String value1, String value2) {
            addCriterion("EmailIfdeleted not between", value1, value2, "emailifdeleted");
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