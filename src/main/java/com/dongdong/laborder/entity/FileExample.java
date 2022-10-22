package com.dongdong.laborder.entity;

import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
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

        public Criteria andFileStIsNull() {
            addCriterion("file_ST is null");
            return (Criteria) this;
        }

        public Criteria andFileStIsNotNull() {
            addCriterion("file_ST is not null");
            return (Criteria) this;
        }

        public Criteria andFileStEqualTo(String value) {
            addCriterion("file_ST =", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStNotEqualTo(String value) {
            addCriterion("file_ST <>", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStGreaterThan(String value) {
            addCriterion("file_ST >", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStGreaterThanOrEqualTo(String value) {
            addCriterion("file_ST >=", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStLessThan(String value) {
            addCriterion("file_ST <", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStLessThanOrEqualTo(String value) {
            addCriterion("file_ST <=", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStLike(String value) {
            addCriterion("file_ST like", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStNotLike(String value) {
            addCriterion("file_ST not like", value, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStIn(List<String> values) {
            addCriterion("file_ST in", values, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStNotIn(List<String> values) {
            addCriterion("file_ST not in", values, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStBetween(String value1, String value2) {
            addCriterion("file_ST between", value1, value2, "fileSt");
            return (Criteria) this;
        }

        public Criteria andFileStNotBetween(String value1, String value2) {
            addCriterion("file_ST not between", value1, value2, "fileSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStIsNull() {
            addCriterion("receipt_ST is null");
            return (Criteria) this;
        }

        public Criteria andReceiptStIsNotNull() {
            addCriterion("receipt_ST is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptStEqualTo(String value) {
            addCriterion("receipt_ST =", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStNotEqualTo(String value) {
            addCriterion("receipt_ST <>", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStGreaterThan(String value) {
            addCriterion("receipt_ST >", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_ST >=", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStLessThan(String value) {
            addCriterion("receipt_ST <", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStLessThanOrEqualTo(String value) {
            addCriterion("receipt_ST <=", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStLike(String value) {
            addCriterion("receipt_ST like", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStNotLike(String value) {
            addCriterion("receipt_ST not like", value, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStIn(List<String> values) {
            addCriterion("receipt_ST in", values, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStNotIn(List<String> values) {
            addCriterion("receipt_ST not in", values, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStBetween(String value1, String value2) {
            addCriterion("receipt_ST between", value1, value2, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReceiptStNotBetween(String value1, String value2) {
            addCriterion("receipt_ST not between", value1, value2, "receiptSt");
            return (Criteria) this;
        }

        public Criteria andReimbStIsNull() {
            addCriterion("reimb_ST is null");
            return (Criteria) this;
        }

        public Criteria andReimbStIsNotNull() {
            addCriterion("reimb_ST is not null");
            return (Criteria) this;
        }

        public Criteria andReimbStEqualTo(String value) {
            addCriterion("reimb_ST =", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStNotEqualTo(String value) {
            addCriterion("reimb_ST <>", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStGreaterThan(String value) {
            addCriterion("reimb_ST >", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStGreaterThanOrEqualTo(String value) {
            addCriterion("reimb_ST >=", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStLessThan(String value) {
            addCriterion("reimb_ST <", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStLessThanOrEqualTo(String value) {
            addCriterion("reimb_ST <=", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStLike(String value) {
            addCriterion("reimb_ST like", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStNotLike(String value) {
            addCriterion("reimb_ST not like", value, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStIn(List<String> values) {
            addCriterion("reimb_ST in", values, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStNotIn(List<String> values) {
            addCriterion("reimb_ST not in", values, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStBetween(String value1, String value2) {
            addCriterion("reimb_ST between", value1, value2, "reimbSt");
            return (Criteria) this;
        }

        public Criteria andReimbStNotBetween(String value1, String value2) {
            addCriterion("reimb_ST not between", value1, value2, "reimbSt");
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