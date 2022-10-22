package com.dongdong.laborder.entity;

import java.util.ArrayList;
import java.util.List;

public class EquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipExample() {
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

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeIsNull() {
            addCriterion("equip_purpose is null");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeIsNotNull() {
            addCriterion("equip_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeEqualTo(String value) {
            addCriterion("equip_purpose =", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeNotEqualTo(String value) {
            addCriterion("equip_purpose <>", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeGreaterThan(String value) {
            addCriterion("equip_purpose >", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("equip_purpose >=", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeLessThan(String value) {
            addCriterion("equip_purpose <", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeLessThanOrEqualTo(String value) {
            addCriterion("equip_purpose <=", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeLike(String value) {
            addCriterion("equip_purpose like", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeNotLike(String value) {
            addCriterion("equip_purpose not like", value, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeIn(List<String> values) {
            addCriterion("equip_purpose in", values, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeNotIn(List<String> values) {
            addCriterion("equip_purpose not in", values, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeBetween(String value1, String value2) {
            addCriterion("equip_purpose between", value1, value2, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipPurposeNotBetween(String value1, String value2) {
            addCriterion("equip_purpose not between", value1, value2, "equipPurpose");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIsNull() {
            addCriterion("equip_brand is null");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIsNotNull() {
            addCriterion("equip_brand is not null");
            return (Criteria) this;
        }

        public Criteria andEquipBrandEqualTo(String value) {
            addCriterion("equip_brand =", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotEqualTo(String value) {
            addCriterion("equip_brand <>", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandGreaterThan(String value) {
            addCriterion("equip_brand >", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandGreaterThanOrEqualTo(String value) {
            addCriterion("equip_brand >=", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLessThan(String value) {
            addCriterion("equip_brand <", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLessThanOrEqualTo(String value) {
            addCriterion("equip_brand <=", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLike(String value) {
            addCriterion("equip_brand like", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotLike(String value) {
            addCriterion("equip_brand not like", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIn(List<String> values) {
            addCriterion("equip_brand in", values, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotIn(List<String> values) {
            addCriterion("equip_brand not in", values, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandBetween(String value1, String value2) {
            addCriterion("equip_brand between", value1, value2, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotBetween(String value1, String value2) {
            addCriterion("equip_brand not between", value1, value2, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipSellerIsNull() {
            addCriterion("equip_seller is null");
            return (Criteria) this;
        }

        public Criteria andEquipSellerIsNotNull() {
            addCriterion("equip_seller is not null");
            return (Criteria) this;
        }

        public Criteria andEquipSellerEqualTo(String value) {
            addCriterion("equip_seller =", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerNotEqualTo(String value) {
            addCriterion("equip_seller <>", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerGreaterThan(String value) {
            addCriterion("equip_seller >", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerGreaterThanOrEqualTo(String value) {
            addCriterion("equip_seller >=", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerLessThan(String value) {
            addCriterion("equip_seller <", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerLessThanOrEqualTo(String value) {
            addCriterion("equip_seller <=", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerLike(String value) {
            addCriterion("equip_seller like", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerNotLike(String value) {
            addCriterion("equip_seller not like", value, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerIn(List<String> values) {
            addCriterion("equip_seller in", values, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerNotIn(List<String> values) {
            addCriterion("equip_seller not in", values, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerBetween(String value1, String value2) {
            addCriterion("equip_seller between", value1, value2, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipSellerNotBetween(String value1, String value2) {
            addCriterion("equip_seller not between", value1, value2, "equipSeller");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIsNull() {
            addCriterion("equip_price is null");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIsNotNull() {
            addCriterion("equip_price is not null");
            return (Criteria) this;
        }

        public Criteria andEquipPriceEqualTo(Float value) {
            addCriterion("equip_price =", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotEqualTo(Float value) {
            addCriterion("equip_price <>", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceGreaterThan(Float value) {
            addCriterion("equip_price >", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("equip_price >=", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceLessThan(Float value) {
            addCriterion("equip_price <", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceLessThanOrEqualTo(Float value) {
            addCriterion("equip_price <=", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIn(List<Float> values) {
            addCriterion("equip_price in", values, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotIn(List<Float> values) {
            addCriterion("equip_price not in", values, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceBetween(Float value1, Float value2) {
            addCriterion("equip_price between", value1, value2, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotBetween(Float value1, Float value2) {
            addCriterion("equip_price not between", value1, value2, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipDetailIsNull() {
            addCriterion("equip_detail is null");
            return (Criteria) this;
        }

        public Criteria andEquipDetailIsNotNull() {
            addCriterion("equip_detail is not null");
            return (Criteria) this;
        }

        public Criteria andEquipDetailEqualTo(String value) {
            addCriterion("equip_detail =", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailNotEqualTo(String value) {
            addCriterion("equip_detail <>", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailGreaterThan(String value) {
            addCriterion("equip_detail >", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailGreaterThanOrEqualTo(String value) {
            addCriterion("equip_detail >=", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailLessThan(String value) {
            addCriterion("equip_detail <", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailLessThanOrEqualTo(String value) {
            addCriterion("equip_detail <=", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailLike(String value) {
            addCriterion("equip_detail like", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailNotLike(String value) {
            addCriterion("equip_detail not like", value, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailIn(List<String> values) {
            addCriterion("equip_detail in", values, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailNotIn(List<String> values) {
            addCriterion("equip_detail not in", values, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailBetween(String value1, String value2) {
            addCriterion("equip_detail between", value1, value2, "equipDetail");
            return (Criteria) this;
        }

        public Criteria andEquipDetailNotBetween(String value1, String value2) {
            addCriterion("equip_detail not between", value1, value2, "equipDetail");
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