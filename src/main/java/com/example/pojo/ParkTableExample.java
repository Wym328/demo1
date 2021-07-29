package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkTableExample() {
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

        public Criteria andParkNameIsNull() {
            addCriterion("park_name is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("park_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("park_name =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("park_name <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("park_name >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("park_name >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("park_name <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("park_name <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("park_name like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("park_name not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("park_name in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("park_name not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("park_name between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("park_name not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkFileIsNull() {
            addCriterion("park_file is null");
            return (Criteria) this;
        }

        public Criteria andParkFileIsNotNull() {
            addCriterion("park_file is not null");
            return (Criteria) this;
        }

        public Criteria andParkFileEqualTo(String value) {
            addCriterion("park_file =", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileNotEqualTo(String value) {
            addCriterion("park_file <>", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileGreaterThan(String value) {
            addCriterion("park_file >", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileGreaterThanOrEqualTo(String value) {
            addCriterion("park_file >=", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileLessThan(String value) {
            addCriterion("park_file <", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileLessThanOrEqualTo(String value) {
            addCriterion("park_file <=", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileLike(String value) {
            addCriterion("park_file like", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileNotLike(String value) {
            addCriterion("park_file not like", value, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileIn(List<String> values) {
            addCriterion("park_file in", values, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileNotIn(List<String> values) {
            addCriterion("park_file not in", values, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileBetween(String value1, String value2) {
            addCriterion("park_file between", value1, value2, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkFileNotBetween(String value1, String value2) {
            addCriterion("park_file not between", value1, value2, "parkFile");
            return (Criteria) this;
        }

        public Criteria andParkHotIsNull() {
            addCriterion("park_hot is null");
            return (Criteria) this;
        }

        public Criteria andParkHotIsNotNull() {
            addCriterion("park_hot is not null");
            return (Criteria) this;
        }

        public Criteria andParkHotEqualTo(Integer value) {
            addCriterion("park_hot =", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotNotEqualTo(Integer value) {
            addCriterion("park_hot <>", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotGreaterThan(Integer value) {
            addCriterion("park_hot >", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_hot >=", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotLessThan(Integer value) {
            addCriterion("park_hot <", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotLessThanOrEqualTo(Integer value) {
            addCriterion("park_hot <=", value, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotIn(List<Integer> values) {
            addCriterion("park_hot in", values, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotNotIn(List<Integer> values) {
            addCriterion("park_hot not in", values, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotBetween(Integer value1, Integer value2) {
            addCriterion("park_hot between", value1, value2, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkHotNotBetween(Integer value1, Integer value2) {
            addCriterion("park_hot not between", value1, value2, "parkHot");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeIsNull() {
            addCriterion("park_longitude is null");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeIsNotNull() {
            addCriterion("park_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeEqualTo(Double value) {
            addCriterion("park_longitude =", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeNotEqualTo(Double value) {
            addCriterion("park_longitude <>", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeGreaterThan(Double value) {
            addCriterion("park_longitude >", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("park_longitude >=", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeLessThan(Double value) {
            addCriterion("park_longitude <", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("park_longitude <=", value, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeIn(List<Double> values) {
            addCriterion("park_longitude in", values, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeNotIn(List<Double> values) {
            addCriterion("park_longitude not in", values, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeBetween(Double value1, Double value2) {
            addCriterion("park_longitude between", value1, value2, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("park_longitude not between", value1, value2, "parkLongitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeIsNull() {
            addCriterion("park_latitude is null");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeIsNotNull() {
            addCriterion("park_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeEqualTo(Double value) {
            addCriterion("park_latitude =", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeNotEqualTo(Double value) {
            addCriterion("park_latitude <>", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeGreaterThan(Double value) {
            addCriterion("park_latitude >", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("park_latitude >=", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeLessThan(Double value) {
            addCriterion("park_latitude <", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("park_latitude <=", value, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeIn(List<Double> values) {
            addCriterion("park_latitude in", values, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeNotIn(List<Double> values) {
            addCriterion("park_latitude not in", values, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeBetween(Double value1, Double value2) {
            addCriterion("park_latitude between", value1, value2, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("park_latitude not between", value1, value2, "parkLatitude");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleIsNull() {
            addCriterion("park_maxpeople is null");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleIsNotNull() {
            addCriterion("park_maxpeople is not null");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleEqualTo(Integer value) {
            addCriterion("park_maxpeople =", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleNotEqualTo(Integer value) {
            addCriterion("park_maxpeople <>", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleGreaterThan(Integer value) {
            addCriterion("park_maxpeople >", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_maxpeople >=", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleLessThan(Integer value) {
            addCriterion("park_maxpeople <", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("park_maxpeople <=", value, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleIn(List<Integer> values) {
            addCriterion("park_maxpeople in", values, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleNotIn(List<Integer> values) {
            addCriterion("park_maxpeople not in", values, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleBetween(Integer value1, Integer value2) {
            addCriterion("park_maxpeople between", value1, value2, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkMaxpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("park_maxpeople not between", value1, value2, "parkMaxpeople");
            return (Criteria) this;
        }

        public Criteria andParkIntimeIsNull() {
            addCriterion("park_intime is null");
            return (Criteria) this;
        }

        public Criteria andParkIntimeIsNotNull() {
            addCriterion("park_intime is not null");
            return (Criteria) this;
        }

        public Criteria andParkIntimeEqualTo(String value) {
            addCriterion("park_intime =", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeNotEqualTo(String value) {
            addCriterion("park_intime <>", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeGreaterThan(String value) {
            addCriterion("park_intime >", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeGreaterThanOrEqualTo(String value) {
            addCriterion("park_intime >=", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeLessThan(String value) {
            addCriterion("park_intime <", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeLessThanOrEqualTo(String value) {
            addCriterion("park_intime <=", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeLike(String value) {
            addCriterion("park_intime like", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeNotLike(String value) {
            addCriterion("park_intime not like", value, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeIn(List<String> values) {
            addCriterion("park_intime in", values, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeNotIn(List<String> values) {
            addCriterion("park_intime not in", values, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeBetween(String value1, String value2) {
            addCriterion("park_intime between", value1, value2, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkIntimeNotBetween(String value1, String value2) {
            addCriterion("park_intime not between", value1, value2, "parkIntime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeIsNull() {
            addCriterion("park_outtime is null");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeIsNotNull() {
            addCriterion("park_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeEqualTo(String value) {
            addCriterion("park_outtime =", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeNotEqualTo(String value) {
            addCriterion("park_outtime <>", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeGreaterThan(String value) {
            addCriterion("park_outtime >", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeGreaterThanOrEqualTo(String value) {
            addCriterion("park_outtime >=", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeLessThan(String value) {
            addCriterion("park_outtime <", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeLessThanOrEqualTo(String value) {
            addCriterion("park_outtime <=", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeLike(String value) {
            addCriterion("park_outtime like", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeNotLike(String value) {
            addCriterion("park_outtime not like", value, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeIn(List<String> values) {
            addCriterion("park_outtime in", values, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeNotIn(List<String> values) {
            addCriterion("park_outtime not in", values, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeBetween(String value1, String value2) {
            addCriterion("park_outtime between", value1, value2, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkOuttimeNotBetween(String value1, String value2) {
            addCriterion("park_outtime not between", value1, value2, "parkOuttime");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleIsNull() {
            addCriterion("park_newpeople is null");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleIsNotNull() {
            addCriterion("park_newpeople is not null");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleEqualTo(Integer value) {
            addCriterion("park_newpeople =", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleNotEqualTo(Integer value) {
            addCriterion("park_newpeople <>", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleGreaterThan(Integer value) {
            addCriterion("park_newpeople >", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_newpeople >=", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleLessThan(Integer value) {
            addCriterion("park_newpeople <", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("park_newpeople <=", value, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleIn(List<Integer> values) {
            addCriterion("park_newpeople in", values, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleNotIn(List<Integer> values) {
            addCriterion("park_newpeople not in", values, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleBetween(Integer value1, Integer value2) {
            addCriterion("park_newpeople between", value1, value2, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkNewpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("park_newpeople not between", value1, value2, "parkNewpeople");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeIsNull() {
            addCriterion("park_waittime is null");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeIsNotNull() {
            addCriterion("park_waittime is not null");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeEqualTo(Integer value) {
            addCriterion("park_waittime =", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeNotEqualTo(Integer value) {
            addCriterion("park_waittime <>", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeGreaterThan(Integer value) {
            addCriterion("park_waittime >", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_waittime >=", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeLessThan(Integer value) {
            addCriterion("park_waittime <", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeLessThanOrEqualTo(Integer value) {
            addCriterion("park_waittime <=", value, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeIn(List<Integer> values) {
            addCriterion("park_waittime in", values, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeNotIn(List<Integer> values) {
            addCriterion("park_waittime not in", values, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeBetween(Integer value1, Integer value2) {
            addCriterion("park_waittime between", value1, value2, "parkWaittime");
            return (Criteria) this;
        }

        public Criteria andParkWaittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_waittime not between", value1, value2, "parkWaittime");
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