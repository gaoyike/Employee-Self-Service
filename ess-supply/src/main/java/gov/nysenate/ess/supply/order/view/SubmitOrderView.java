package gov.nysenate.ess.supply.order.view;

import gov.nysenate.ess.core.client.view.base.ViewObject;
import gov.nysenate.ess.supply.item.view.LineItemView;

public class SubmitOrderView implements ViewObject {

    protected int customerId;
    protected LineItemView[] lineItems;

    public SubmitOrderView() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LineItemView[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItemView[] lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public String getViewType() {
        return "submit-order-view";
    }
}
