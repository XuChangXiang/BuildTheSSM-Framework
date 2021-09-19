package com.laoxu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andApartment1IsNull() {
            addCriterion("apartment1 is null");
            return (Criteria) this;
        }

        public Criteria andApartment1IsNotNull() {
            addCriterion("apartment1 is not null");
            return (Criteria) this;
        }

        public Criteria andApartment1EqualTo(Integer value) {
            addCriterion("apartment1 =", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1NotEqualTo(Integer value) {
            addCriterion("apartment1 <>", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1GreaterThan(Integer value) {
            addCriterion("apartment1 >", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1GreaterThanOrEqualTo(Integer value) {
            addCriterion("apartment1 >=", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1LessThan(Integer value) {
            addCriterion("apartment1 <", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1LessThanOrEqualTo(Integer value) {
            addCriterion("apartment1 <=", value, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1In(List<Integer> values) {
            addCriterion("apartment1 in", values, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1NotIn(List<Integer> values) {
            addCriterion("apartment1 not in", values, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1Between(Integer value1, Integer value2) {
            addCriterion("apartment1 between", value1, value2, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment1NotBetween(Integer value1, Integer value2) {
            addCriterion("apartment1 not between", value1, value2, "apartment1");
            return (Criteria) this;
        }

        public Criteria andApartment2IsNull() {
            addCriterion("apartment2 is null");
            return (Criteria) this;
        }

        public Criteria andApartment2IsNotNull() {
            addCriterion("apartment2 is not null");
            return (Criteria) this;
        }

        public Criteria andApartment2EqualTo(Integer value) {
            addCriterion("apartment2 =", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2NotEqualTo(Integer value) {
            addCriterion("apartment2 <>", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2GreaterThan(Integer value) {
            addCriterion("apartment2 >", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2GreaterThanOrEqualTo(Integer value) {
            addCriterion("apartment2 >=", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2LessThan(Integer value) {
            addCriterion("apartment2 <", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2LessThanOrEqualTo(Integer value) {
            addCriterion("apartment2 <=", value, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2In(List<Integer> values) {
            addCriterion("apartment2 in", values, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2NotIn(List<Integer> values) {
            addCriterion("apartment2 not in", values, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2Between(Integer value1, Integer value2) {
            addCriterion("apartment2 between", value1, value2, "apartment2");
            return (Criteria) this;
        }

        public Criteria andApartment2NotBetween(Integer value1, Integer value2) {
            addCriterion("apartment2 not between", value1, value2, "apartment2");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAddr1IsNull() {
            addCriterion("addr1 is null");
            return (Criteria) this;
        }

        public Criteria andAddr1IsNotNull() {
            addCriterion("addr1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr1EqualTo(String value) {
            addCriterion("addr1 =", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotEqualTo(String value) {
            addCriterion("addr1 <>", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1GreaterThan(String value) {
            addCriterion("addr1 >", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("addr1 >=", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1LessThan(String value) {
            addCriterion("addr1 <", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1LessThanOrEqualTo(String value) {
            addCriterion("addr1 <=", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1Like(String value) {
            addCriterion("addr1 like", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotLike(String value) {
            addCriterion("addr1 not like", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1In(List<String> values) {
            addCriterion("addr1 in", values, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotIn(List<String> values) {
            addCriterion("addr1 not in", values, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1Between(String value1, String value2) {
            addCriterion("addr1 between", value1, value2, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotBetween(String value1, String value2) {
            addCriterion("addr1 not between", value1, value2, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr2IsNull() {
            addCriterion("addr2 is null");
            return (Criteria) this;
        }

        public Criteria andAddr2IsNotNull() {
            addCriterion("addr2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr2EqualTo(String value) {
            addCriterion("addr2 =", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotEqualTo(String value) {
            addCriterion("addr2 <>", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2GreaterThan(String value) {
            addCriterion("addr2 >", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("addr2 >=", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2LessThan(String value) {
            addCriterion("addr2 <", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2LessThanOrEqualTo(String value) {
            addCriterion("addr2 <=", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2Like(String value) {
            addCriterion("addr2 like", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotLike(String value) {
            addCriterion("addr2 not like", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2In(List<String> values) {
            addCriterion("addr2 in", values, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotIn(List<String> values) {
            addCriterion("addr2 not in", values, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2Between(String value1, String value2) {
            addCriterion("addr2 between", value1, value2, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotBetween(String value1, String value2) {
            addCriterion("addr2 not between", value1, value2, "addr2");
            return (Criteria) this;
        }

        public Criteria andCreationIsNull() {
            addCriterion("creation is null");
            return (Criteria) this;
        }

        public Criteria andCreationIsNotNull() {
            addCriterion("creation is not null");
            return (Criteria) this;
        }

        public Criteria andCreationEqualTo(Date value) {
            addCriterion("creation =", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationNotEqualTo(Date value) {
            addCriterion("creation <>", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationGreaterThan(Date value) {
            addCriterion("creation >", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationGreaterThanOrEqualTo(Date value) {
            addCriterion("creation >=", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationLessThan(Date value) {
            addCriterion("creation <", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationLessThanOrEqualTo(Date value) {
            addCriterion("creation <=", value, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationIn(List<Date> values) {
            addCriterion("creation in", values, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationNotIn(List<Date> values) {
            addCriterion("creation not in", values, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationBetween(Date value1, Date value2) {
            addCriterion("creation between", value1, value2, "creation");
            return (Criteria) this;
        }

        public Criteria andCreationNotBetween(Date value1, Date value2) {
            addCriterion("creation not between", value1, value2, "creation");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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