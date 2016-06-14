<%@include file="header.jsp"%>

<body>
<div id="sider">
<div class="container">
  <br>
  
  <h3>
		</h3>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="${img}/A-man-looks-frustrated-while-using-her-laptop-computer1.jpg">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/img/database-connections-freebase-ss-1920.jpg"/>" alt="Chania" >
      </div>
    
      <div class="item">
        <img src="${img}/A-man-looks-frustrated-while-using-her-laptop-computer1.jpg" alt="Flower">
      </div>

      
    </div>
<br>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
<!-- Page Content -->
    <div class="container">

        <!-- Marketing Icons Section -->
        <div class="row">
            <div class="col-lg-12">
             <center>   <h1 class="page-header">
                   product of your choice
                </h1></center>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                  <center>      <h4><i class="fa fa-fw fa-check"></i> Computer</h4></center>
                    </div>
                    <div class="panel-body">
                       <a href="<c:url value="list/computer"/>"><img src="${img}/A-man-looks-frustrated-while-using-her-laptop-computer1.jpg" alt="Chania" width="330" height="200"></a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                    <center>    <h4><i class="fa fa-fw fa-gift"></i> Phone</h4></center>
                    </div>
                    <div class="panel-body">
                    <a href="<c:url value="list/phone"/>"><img src="${img}/database-connections-freebase-ss-1920.jpg" alt="Chania" alt="Chania" width="330" height="200"></a>    
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <center><h4><i class="fa fa-fw fa-compass"></i> TV</h4></center>
                    </div>
                    <div class="panel-body">
                       <a href="<c:url value="list/tv"/>"><img src="${img}/TimeManagement.jpg" alt="Chania" width="330" height="200"></a></div>
 
                    </div>
                </div>
            </div>
        </div>
        <!-- /.row -->




 
<%@include file="footer.jsp"%>

  
</body>

</html>




