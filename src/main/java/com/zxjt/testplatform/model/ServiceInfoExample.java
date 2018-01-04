package com.zxjt.testplatform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceInfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("SERVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("SERVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("SERVICE_TYPE =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("SERVICE_TYPE <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("SERVICE_TYPE >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("SERVICE_TYPE <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("SERVICE_TYPE like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("SERVICE_TYPE not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("SERVICE_TYPE in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("SERVICE_TYPE not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdIsNull() {
            addCriterion("SERVICE_FUNCTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdIsNotNull() {
            addCriterion("SERVICE_FUNCTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdEqualTo(String value) {
            addCriterion("SERVICE_FUNCTION_ID =", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdNotEqualTo(String value) {
            addCriterion("SERVICE_FUNCTION_ID <>", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdGreaterThan(String value) {
            addCriterion("SERVICE_FUNCTION_ID >", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_FUNCTION_ID >=", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdLessThan(String value) {
            addCriterion("SERVICE_FUNCTION_ID <", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_FUNCTION_ID <=", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdLike(String value) {
            addCriterion("SERVICE_FUNCTION_ID like", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdNotLike(String value) {
            addCriterion("SERVICE_FUNCTION_ID not like", value, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdIn(List<String> values) {
            addCriterion("SERVICE_FUNCTION_ID in", values, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdNotIn(List<String> values) {
            addCriterion("SERVICE_FUNCTION_ID not in", values, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdBetween(String value1, String value2) {
            addCriterion("SERVICE_FUNCTION_ID between", value1, value2, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceFunctionIdNotBetween(String value1, String value2) {
            addCriterion("SERVICE_FUNCTION_ID not between", value1, value2, "serviceFunctionId");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("SERVICE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("SERVICE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("SERVICE_DESC =", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("SERVICE_DESC <>", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("SERVICE_DESC >", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_DESC >=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("SERVICE_DESC <", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_DESC <=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("SERVICE_DESC like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("SERVICE_DESC not like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("SERVICE_DESC in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("SERVICE_DESC not in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("SERVICE_DESC between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("SERVICE_DESC not between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebIsNull() {
            addCriterion("ALLOW_OUTWEB is null");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebIsNotNull() {
            addCriterion("ALLOW_OUTWEB is not null");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebEqualTo(String value) {
            addCriterion("ALLOW_OUTWEB =", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebNotEqualTo(String value) {
            addCriterion("ALLOW_OUTWEB <>", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebGreaterThan(String value) {
            addCriterion("ALLOW_OUTWEB >", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_OUTWEB >=", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebLessThan(String value) {
            addCriterion("ALLOW_OUTWEB <", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_OUTWEB <=", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebLike(String value) {
            addCriterion("ALLOW_OUTWEB like", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebNotLike(String value) {
            addCriterion("ALLOW_OUTWEB not like", value, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebIn(List<String> values) {
            addCriterion("ALLOW_OUTWEB in", values, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebNotIn(List<String> values) {
            addCriterion("ALLOW_OUTWEB not in", values, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebBetween(String value1, String value2) {
            addCriterion("ALLOW_OUTWEB between", value1, value2, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andAllowOutwebNotBetween(String value1, String value2) {
            addCriterion("ALLOW_OUTWEB not between", value1, value2, "allowOutweb");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeIsNull() {
            addCriterion("REC_GEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeIsNotNull() {
            addCriterion("REC_GEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeEqualTo(Date value) {
            addCriterion("REC_GEN_TIME =", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeNotEqualTo(Date value) {
            addCriterion("REC_GEN_TIME <>", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeGreaterThan(Date value) {
            addCriterion("REC_GEN_TIME >", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_GEN_TIME >=", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeLessThan(Date value) {
            addCriterion("REC_GEN_TIME <", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeLessThanOrEqualTo(Date value) {
            addCriterion("REC_GEN_TIME <=", value, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeIn(List<Date> values) {
            addCriterion("REC_GEN_TIME in", values, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeNotIn(List<Date> values) {
            addCriterion("REC_GEN_TIME not in", values, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeBetween(Date value1, Date value2) {
            addCriterion("REC_GEN_TIME between", value1, value2, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecGenTimeNotBetween(Date value1, Date value2) {
            addCriterion("REC_GEN_TIME not between", value1, value2, "recGenTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeIsNull() {
            addCriterion("REC_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeIsNotNull() {
            addCriterion("REC_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeEqualTo(Date value) {
            addCriterion("REC_UPD_TIME =", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeNotEqualTo(Date value) {
            addCriterion("REC_UPD_TIME <>", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeGreaterThan(Date value) {
            addCriterion("REC_UPD_TIME >", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TIME >=", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeLessThan(Date value) {
            addCriterion("REC_UPD_TIME <", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TIME <=", value, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeIn(List<Date> values) {
            addCriterion("REC_UPD_TIME in", values, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeNotIn(List<Date> values) {
            addCriterion("REC_UPD_TIME not in", values, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TIME between", value1, value2, "recUpdTime");
            return (Criteria) this;
        }

        public Criteria andRecUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TIME not between", value1, value2, "recUpdTime");
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