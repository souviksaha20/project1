<%@ include file="header.jsp"%>

	
	<section id="mainContent">

		<div class="row">

			<div class="col-sm-hidden col-xs-hidden col-md-3">
				
                <p class="lead">${category.name}</p>
                                
                <div class="list-group">
                	<c:forEach var="category" items="${category.subCategories}">
	                    <a href="#" class="list-group-item"><c:out value="${category}"/></a>
                	</c:forEach>                
                </div>
			</div>
		
		<div class="col-md-9">
		
			<div class="row">
			
				<c:forEach var="product" items="${category.products}">
		          <div class="col-md-4">
		              <div class="thumbnail">
		                  <img src="${resourceUrl}/${product.imageUrl}" alt="">
		                  <div class="caption">
		                      <h4 class="pull-right"><span class="glyphicon glyphicon-usd"></span>${product.price}</h4>
		                      <h4><a href="#">${product.name}</a>
		                      </h4>
		                      <p>${product.description}</p>
		                  </div>
		              </div>
		          </div>			
				</c:forEach>
			
			</div>
		
		</div>
	
	
		</div>
</section>



<%@ include file="footer.jsp"%>