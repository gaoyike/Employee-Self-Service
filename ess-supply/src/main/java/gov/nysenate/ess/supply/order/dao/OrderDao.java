package gov.nysenate.ess.supply.order.dao;

import com.google.common.collect.Range;
import gov.nysenate.ess.core.model.personnel.Employee;
import gov.nysenate.ess.core.model.unit.Location;
import gov.nysenate.ess.core.util.LimitOffset;
import gov.nysenate.ess.supply.order.Order;
import gov.nysenate.ess.supply.order.OrderStatus;

import java.time.LocalDate;
import java.util.EnumSet;
import java.util.List;

public interface OrderDao {

    int getUniqueId();

    void saveOrder(Order order);

    /**
     * Get orders by location code, location type, issuer, statuses, and date range.
     * @param locCode If 'all', search by all location codes.
     * @param locType If 'all', search by all location types.
     * @param issuerEmpId If 'all', search by all issuer id's.
     * @param statuses
     * @param dateRange
     * @param limOff
     * @return
     */
    List<Order> getOrders(String locCode, String locType, String issuerEmpId, EnumSet<OrderStatus> statuses,
                             Range<LocalDate> dateRange, LimitOffset limOff);

    Order getOrderById(int orderId);

    void undoCompletion(Order order);


}
