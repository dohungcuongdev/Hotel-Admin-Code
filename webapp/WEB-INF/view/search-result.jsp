<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="common/sub-content.jspf"%>

<div class="row">
	<div class="col-xs-12">
		<header class="panel-heading"><center><b>Rooms</b></center></header>
		<%@ include file="common/table-rooms.jspf"%>
	</div>
</div> <br><br>

<div class="row">
	<div class="col-xs-12">
		<header class="panel-heading"><center><b>Restaurant</b></center></header>
		<%@ include file="common/table-restaurant.jspf"%>
	</div>
</div> <br><br>

<div class="row">
	<div class="col-xs-12">
		<section class="panel">
		<header class="panel-heading"><center><b>Message</b></center></header>
		<div class="panel-body" id="message-box">
			<%@ include file="common/mes-box.jspf"%>
		</div>
		</section>
	</div>
</div> <br><br>

<div class="row">
	<div class="col-xs-12">
		<header class="panel-heading"><center><b>User</b></center></header>
		<%@ include file="common/table-users.jspf"%>
	</div>
</div> <br><br>

<div class="row">
	<div class="col-xs-12">
		<header class="panel-heading"><center><b>Customer Data Collection</b></center></header>
		<%@ include file="common/data-collection.jspf"%>
	</div>
</div>

<%@ include file="common/footer.jspf"%>

<script>
	window.onload = function() {
		var filter = '${keyword}'.toUpperCase();
		searchInputTableWithFilter('input-room', 'table-rooms', filter);
		searchInputTableWithFilter('input-item', 'table-restaurant', filter);
		searchInputTableWithFilter('input-user', 'table-users', filter);
		searchInputTableWithFilter('cdc-input', 'cdc-table', filter);
		searchMessageWithFilter('mesInput', 'message-box', filter);
	}
</script>