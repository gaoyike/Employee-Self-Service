package gov.nysenate.ess.seta.client.response;

import gov.nysenate.ess.core.client.view.base.MapView;
import gov.nysenate.ess.core.client.view.base.ViewObject;
import gov.nysenate.ess.seta.client.view.TimeRecordErrorView;
import gov.nysenate.ess.seta.client.view.TimeRecordView;
import gov.nysenate.ess.seta.service.attendance.validation.TimeRecordErrorCode;
import gov.nysenate.ess.core.client.response.error.ErrorCode;
import gov.nysenate.ess.core.client.response.error.ErrorResponse;

import java.util.Map;
import java.util.stream.Collectors;

public class InvalidTimeRecordResponse extends ErrorResponse
{

    protected TimeRecordView timeRecord;
    protected MapView<Integer, TimeRecordErrorView> errorData;

    public InvalidTimeRecordResponse(TimeRecordView timeRecord, Map<TimeRecordErrorCode, ViewObject> errorData) {
        super(ErrorCode.INVALID_TIME_RECORD);
        this.timeRecord = timeRecord;
        this.errorData = MapView.of(
                errorData.entrySet().stream().collect(Collectors.toMap(
                        entry -> entry.getKey().getCode(),
                        entry -> new TimeRecordErrorView(entry.getKey(), entry.getValue()))) );
        this.responseType = "invalid time record";
    }

    public TimeRecordView getTimeRecord() {
        return timeRecord;
    }

    public MapView<Integer, TimeRecordErrorView> getErrorData() {
        return errorData;
    }
}
