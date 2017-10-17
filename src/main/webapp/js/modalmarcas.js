var app = angular.module ('modal');
                .controller('marcasmodal',function($scope,$http,$modal){
                    $http.get('http://localhost:8090/marcas').success(function(data){
                       $scope.marcas =data
                          })
                            $scope.gridOptions={
                                  data:'marcas',
                                       showGroupPanel:true,
                                              $scope.showModal = function (){
                                                 $scope.marcas={};
                                  var modalInstance = $modal.open,
                                      .controller:'SelectedMarcas',
                                         resolve:{
                                   modalInstance:function(){
                                        return $scope.modalInstance;
                                           }
                                              }
                                                 });
                                                modalInstance.result.then(function(selectedItem){
                                                       $scope.marcas.push({
                                                   checkbox.selected;
                                                        }
                                                             }
                                               }
                                               .controller('SelectedMarcas,function($scope,$modalInstance){
                                                     $scope.cancel = function(){
                                                        $modalInstance.dismiss('cancel');
                                                      });
                                               }
                               });
