var essApi = angular.module('essApi');

/** --- Pay Period API --- */

essApi.factory('PayPeriodApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/periods/:periodType');
}]);

/** --- Holiday API --- */

essApi.factory('HolidayApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/holidays');
}]);

/** --- Time Record API --- */

essApi.factory('TimeRecordsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/timerecords');
}]);

essApi.factory('ActiveTimeRecordsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/timerecords/active');
}]);

essApi.factory('ActiveYearsTimeRecordsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/timerecords/activeYears');
}]);

essApi.factory('SupervisorTimeRecordsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/timerecords/supervisor');
}]);

essApi.factory('SupervisorTimeRecordCountsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/timerecords/supervisor/count');
}]);

/** --- Supervisor API --- */

essApi.factory('SupervisorEmployeesApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/supervisor/employees');
}]);

essApi.factory('SupervisorChainApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/supervisor/chain');
}]);

essApi.factory('SupervisorOverridesApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/supervisor/overrides');
}]);

essApi.factory('SupervisorGrantsApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/supervisor/grants');
}]);


/** --- Accrual API --- */

essApi.factory('AccrualPeriodApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/accruals');
}]);

essApi.factory('AccrualHistoryApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/accruals/history');
}]);

/** --- Employee API --- */

essApi.factory('EmpInfoApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/employees.json');
}]);

essApi.factory('EmpActiveYearsApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/employees/activeYears');
}]);

/** --- Transaction API --- */

essApi.factory('EmpTransactionsApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/empTransactions/')
}]);

essApi.factory('EmpTransactionSnapshotApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/empTransactions/snapshot')
}]);

essApi.factory('EmpTransactionTimelineApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/empTransactions/timeline')
}]);

/** --- Allowance API --- */

essApi.factory('AllowanceApi', ['$resource', 'appProps', function ($resource, appProps) {
    return $resource(appProps.apiPath + '/allowances');
}]);

/** --- Paycheck History API --- */

essApi.factory('EmpCheckHistoryApi',  ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/paychecks.json')
}]);

/** --- Supply Item API --- */

essApi.factory('SupplyItemApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyItems.json')
}]);

/** --- Supply Order API --- */

essApi.factory('SupplyAllOrdersApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders.json')
}]);

essApi.factory('SupplySubmitOrderApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/submitOrder')
}]);

essApi.factory('SupplyGetPendingOrdersApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/getPending.json')
}]);

essApi.factory('SupplyGetProcessingOrdersApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/getProcessing.json')
}]);

essApi.factory('SupplyGetCompletedOrdersApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/getCompleted.json')
}]);

essApi.factory('SupplyProcessOrderApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/process')
}]);

essApi.factory('SupplyCompleteOrderApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/complete')
}]);

essApi.factory('SupplyRejectOrderApi', ['$resource', 'appProps', function($resource, appProps) {
    return $resource(appProps.apiPath + '/supplyOrders/reject')
}]);