/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
    Created on : Nov 11, 2017, 9:38:05 AM
    Author     : HUNGCUONG
*/
function searchAllDisplay(keyword) {
	var filter = keyword.toUpperCase();
	searchInputTableWithFilter('input-room', 'table-rooms', filter);
	searchInputTableWithFilter('input-item', 'table-restaurant', filter);
	searchInputTableWithFilter('input-user', 'table-users', filter);
	searchInputTableWithFilter('cdc-input', 'cdc-table', filter);
	searchInputTableWithFilter('ip-stat-input', 'ip-stat-table', filter);
	searchInputTableWithFilter('page-access-input', 'page-access-table', filter);
	searchInputTableWithFilter('externalip-input', 'externalip-table', filter);
	searchMessageWithFilter('mesInput', 'message-box', filter);

	var numRowRoom = $( "#table-rooms tr:visible" ).length;
	var numRowRestaurant = $( "#table-restaurant tr:visible" ).length;
	var numRowUser = $( "#table-users tr:visible" ).length;
	var numRowCDC = $( "#cdc-table tr:visible" ).length;
	var numRowIP = $( "#ip-stat-table-table tr:visible" ).length;
	var numRowPage = $( "#page-access-table tr:visible" ).length;
	var numRowExIP = $( "#externalip-table tr:visible" ).length;
	var numMes = $( "#message-box div:visible" ).length;
	if(numRowRoom <= 1 && numRowRestaurant <= 1 && numRowUser <= 1 && numRowCDC <= 1 && numRowIP <= 1 && numRowPage <= 1 && numRowExIP <= 1 && numMes <= 0) {
		$('#result').html('<center><b>Found no result for keyowrd: ' + keyword + '</b></center>').css({'color' : '#a94442', 'background': '#fad5d5'});
		$('#keep-footer-bottom').html('<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>');
	}
	if(numRowRoom <= 1) remove('room-result');
	if(numRowRestaurant <= 1) remove('restaurant-result');
	if(numRowUser <= 1) remove('user-result');
	if(numRowCDC <= 1) remove('cdc-result');
	if(numRowIP <= 1) remove('ip-address-result');
	if(numRowPage <= 1) remove('page-access-result');
	if(numRowExIP <= 1) remove('external-ip-result');
	if(numMes <= 0) remove('message-result');
}

function remove(id) {
    var elem = document.getElementById(id);
    return elem.parentNode.removeChild(elem);
}