
</div>
<footer>
	<div class="row">
		<div class="col-md-6">Copyright &#169; All Rights Reserved
			developed by Khozema Nullwala</div>
		<div class="col-md-6">

			<ul>
				<li><a href="<c:url value="/index"/>">Home</a></li>
				<li><a href="<c:url value="/contact"/>">Contact</a></li>
				<li><a href="<c:url value="/about"/>">About Us</a></li>
			</ul>

		</div>
	</div>
</footer>



<!-- library scripts placed at the end so the pages load faster -->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>

<script type="text/javascript">
	
		window.viewName = "${viewName}";
	
		$(function() {
			
			
			// solution for active menu problem
			switch(viewName) {
			
				case 'login': 
					$('#login').addClass('active');
					break;
			

				case 'register': 
					$('#register').addClass('active');
					break;

					
				case 'contact': 
					$('#contact').addClass('active');
					break;

					
				case 'about': 
					$('#about').addClass('active');
					break;

				case 'list': 
					$('#list').addClass('active');
					break;
					
				default:					
					$('#index').addClass('active');
					
					
			}
			
			
			
		})
	
	</script>

</body>
</html>
