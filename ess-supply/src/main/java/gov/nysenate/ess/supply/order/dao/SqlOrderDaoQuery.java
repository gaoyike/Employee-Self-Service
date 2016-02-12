package gov.nysenate.ess.supply.order.dao;

import gov.nysenate.ess.core.dao.base.BasicSqlQuery;
import gov.nysenate.ess.core.dao.base.DbVendor;

public enum SqlOrderDaoQuery implements BasicSqlQuery {

    INSERT_ORDER(
            "Insert into supply.order(status, customer_id, location_code, location_type, \n" +
            "order_date_time, modified_date_time, modified_emp_id) \n" +
            "Values(:status::supply.order_status, :customerId, :locCode, :locType, \n" +
            ":orderDateTime, :modifiedDateTime, :modifiedEmpId)"
    ),
    INSERT_LINE_ITEMS(
            "Insert into supply.line_item(order_id, item_id, quantity, modified_date_time, modified_emp_id) \n" +
            "Values(:orderId, :itemId, :quantity, :modifiedDateTime, :modifiedEmpId)"
    ),
    UPDATE_LINE_ITEMS(
            "Update supply.line_item Set quantity = :quantity, modified_date_time = :modifiedDateTime, \n" +
            "modified_emp_id = :modifiedEmpId \n" +
            "Where order_id = :orderId And item_id = :itemId"
    ),
    UPDATE_ORDER(
            "Update supply.order Set status = :status::supply.order_status, customer_id = :customerId, \n" +
            "location_code = :locCode, location_type = :locType, issue_emp_id = :issueEmpId, approve_emp_id = :approveEmpId, \n" +
            "order_date_time = :orderDateTime, process_date_time = :processDateTime, complete_date_time = :completeDateTime, \n" +
            "modified_date_time = :modifiedDateTime, modified_emp_id = :modifiedEmpId \n" +
            "Where order_id = :orderId"
    ),
    GET_ORDER_BY_ID(
            "Select o.order_id, o.status, o.customer_id, o.location_code, o.location_type, \n" +
            "o.issue_emp_id, o.approve_emp_id, o.order_date_time, o.process_date_time, o.complete_date_time, \n" +
            "o.modified_date_time, o.modified_emp_id, i.item_id, i.quantity \n" +
            "From supply.order o Left Outer Join supply.line_item i On o.order_id = i.order_id \n" +
            "Where o.order_id = :orderId"
    );

    SqlOrderDaoQuery(String sql) {
        this.sql = sql;
    }

    private String sql;

    @Override
    public String getSql() {
        return sql;
    }

    @Override
    public DbVendor getVendor() {
        return DbVendor.POSTGRES;
    }
}
