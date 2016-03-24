var essSupply = angular.module('essSupply').controller('SupplyNavigationController',
    ['$scope', 'appProps', 'SupplyCategoryService', supplyNavigationController]);

function supplyNavigationController($scope, appProps, SupplyCategoryService) {

    $scope.categories = null;
    $scope.displayCategoryNavigation = null;

    $scope.init = function() {
        $scope.categories = SupplyCategoryService.getCategories();
    };

    /** Only display the categories sidebar if on requisition order page. */
    $scope.$on('$locationChangeStart', function(event, newUrl) {
        $scope.displayCategoryNavigation = isRequisitionOrderPage(newUrl);
    });

    function isRequisitionOrderPage(url) {
        return url.indexOf(appProps.ctxPath + "/supply/order/order") > -1;
    }

    $scope.init();
}