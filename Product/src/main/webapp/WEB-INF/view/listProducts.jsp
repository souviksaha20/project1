<%@ include file="header.jsp"%>

<section id="mainContent">
	<ol class="breadcrumb">
	  <li><a href="<c:url value="/index"/>">Home</a></li>
	  <c:choose>
		  <c:when test="${category.name == all}">
			<li class="active">Products</li>  	
		  </c:when>
		  <c:otherwise>
			<li><a href="<c:url value="/list/all"/>">Products</a></li>
		  	<li class="active">${category.name}</li>
		  </c:otherwise>	  
	  </c:choose>	  
	</ol>


	<div class="row">

	 <h3>${category.name} Products</h3>
	 
 	 <%@ include file="search.jsp"%>
	 
	 <!-- List of products -->
	 <table class="table table-striped table-condensed">
	 	
	 	<thead>
	 		<tr>
	 			<th>Name</th>
	 			<th>Price</th>
	 			<th>Description</th>
	 			<th>Quantity</th>
	 			<th></th>
	 		</tr>
	 	</thead>
	 	<tbody>
			<c:forEach var="product" items="${category.products}">
				<tr>
		 			<td>${product.name}</td>
		 			<td>${product.price}</td>
		 			<td>${product.description}</td>
		 			<td>${product.quantity}</td>					
					<td><a href="#">View</a> &#160;|&#160;<a href="#">Edit</a> &#160;|&#160;<a href="#">Delete</a> 
				</tr>
			</c:forEach>	 	
	 	</tbody>
	 </table>

	</div>
</section>



<%@ include file="footer.jsp"%>