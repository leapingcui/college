<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>摩尔股份</title>
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="${webRoot}/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${webRoot}/fonts/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${webRoot}/fonts/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="${webRoot}/plugins/datatables/dataTables.bootstrap.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${webRoot}/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${webRoot}/dist/css/skins/_all-skins.min.css">


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="${webRoot}/index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>摩</b>尔</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>摩尔股份管理系统</b></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            消息
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">2</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有2条新消息</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li><!-- start message -->
                                        <a href="#">
                                            <h4>
                                                消息1
                                                <small><i class="fa fa-clock-o"></i>5分钟前</small>
                                            </h4>
                                            <p>消息内容</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                    <li>
                                        <a href="#">
                                            <h4>
                                                张工
                                                <small><i class="fa fa-clock-o"></i> 2 小时</small>
                                            </h4>
                                            <p>消息内容</p>
                                        </a>
                                    </li>

                                </ul>
                            </li>
                            <li class="footer"><a href="#">查看所有消息</a></li>
                        </ul>
                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            提醒
                            <i class="fa fa-bell-o"></i>
                            <span class="label label-warning">10</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有10个提醒</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-aqua"></i> 提醒1
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-warning text-yellow"></i> 提醒2
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-red"></i> 提醒3
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-shopping-cart text-green"></i> 提醒4
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-user text-red"></i> 提醒5
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">查看全部</a></li>
                        </ul>
                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            任务
                            <i class="fa fa-flag-o"></i>
                            <span class="label label-danger">9</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有9项任务</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                任务1
                                                <small class="pull-right">20%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">20% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                任务2
                                                <small class="pull-right">40%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">40% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                任务3
                                                <small class="pull-right">60%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">60% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li><!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                任务4
                                                <small class="pull-right">80%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">80% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                </ul>
                            </li>
                            <li class="footer">
                                <a href="#">查看所有任务</a>
                            </li>
                        </ul>
                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${webRoot}/dist/img/close.png" class="user-image" alt="User Image" >
                            <span class="hidden-xs">退出</span>
                        </a>

                    </li>
                    <!-- Control Sidebar Toggle Button -->

                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${webRoot}/dist/img/moer.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>张工</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- 搜索框，不知道有没有必要-->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- js解析el表达式   -->
            <input name="root" id="root" type="hidden" value="${webRoot}"/>
            <script type="text/javascript" src="${webRoot}/public_sidebar.js"></script>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">

                <!--  中间替换的主要的部分-->

                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        信息类别
                        <small>具体信息</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
                        <li><a href="#">类别</a></li>
                        <li class="active">详细</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Data Table With Full Features</h3>
                                </div>
                                <!-- /.box-header -->
                                <div class="box-body">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <tr>
                                            <th>设备名称</th>
                                            <td>${goods.goodsCommon.gcName}</td>
                                        </tr>
                                        <tr>
                                            <th>设备类型</th>
                                            <td>${goods.goodsCommon.gcType}</td>
                                        </tr>
                                        <tr>
                                            <th>设备库存数量</th>
                                            <td>${goods.goodsCommon.gcStockQuantity}</td>
                                        </tr>
                                        <tr>
                                            <th>设备警戒库存数量</th>
                                            <td>${goods.goodsCommon.gcWarnStockQuantity}</td>
                                        </tr>
                                        <tr>
                                            <th>设备历史领用数量</th>
                                            <td>${goods.goodsCommon.gcHistoryReceiveNum}</td>
                                        </tr>
                                        <tr>
                                            <th>设备编号</th>
                                            <td>${goods.gsTrueId}</td>
                                        </tr>
                                        <tr>
                                            <th>设备规格</th>
                                            <td>${goods.gsSpeci}</td>
                                        </tr>
                                        <tr>
                                            <th>设备总数量</th>
                                            <td>${goods.gsTotalQuantity}</td>
                                        </tr>
                                        <tr>
                                            <th>设备剩余数量</th>
                                            <td>${goods.gsLeftQuantity}</td>
                                        </tr>
                                        <tr>
                                            <th>设备批次号</th>
                                            <td>${goods.gsBatchNum}</td>
                                        </tr>
                                        <tr>
                                            <th>生产日期</th>
                                            <td>${goods.gsProduceDate}</td>
                                        </tr>
                                        <tr>
                                            <th>购买日期</th>
                                            <td>${goods.gsBuyDate}</td>
                                        </tr>
                                        <tr>
                                            <th>验收日期</th>
                                            <td>${goods.gsCheckDate}</td>
                                        </tr>
                                        <tr>
                                            <th>购买价</th>
                                            <td>${goods.gsPurchasePrice}</td>
                                        </tr>
                                        <tr>
                                            <th>折旧价</th>
                                            <td>${goods.gsDepreciationPrice}</td>
                                        </tr>
                                        <tr>
                                            <th>制造商</th>
                                            <td>${goods.gsManufacturer}</td>
                                        </tr>
                                        <tr>
                                            <th>供应商</th>
                                            <td>${goods.gsSupplier}</td>
                                        </tr>
                                        <tr>
                                            <th>所属部门</th>
                                            <td>${goods.gsDepartment}</td>
                                        </tr>
                                        <tr>
                                            <th>领用人编号</th>
                                            <td>${goods.gsReceivePersonId}</td>
                                        </tr>
                                        <tr>
                                            <th>领用日期</th>
                                            <td>${goods.gsReceiveDate}</td>
                                        </tr>
                                        <tr>
                                            <th>管理人编号</th>
                                            <td>${goods.gsAdminId}</td>
                                        </tr>
                                        <tr>
                                            <th>校准周期</th>
                                            <td>${goods.gsCalibrationCycle}</td>
                                        </tr>
                                        <tr>
                                            <th>保修期</th>
                                            <td>${goods.gsWarrantyPeriod}</td>
                                        </tr>
                                        <tr>
                                            <th>保存位置</th>
                                            <td>${goods.gsStorePosition}</td>
                                        </tr>
                                    </table>
                                </div>
                                <!-- /.box-body -->
                            </div>
                            <!-- /.box -->
                        </div>
                        <!-- /.col -->
                    </div>
                    <!-- /.row -->
                </section>
                <!-- /.content -->
            </div>
</div>
<!-- /.col -->
</div>
<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->


<!-- Control Sidebar -->

<!-- /.control-sidebar -->
<!-- Add the sidebar's background. This div must be placed
     immediately after the control sidebar -->
<div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="${webRoot}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="${webRoot}/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- jQuery 2.2.3 -->
<script src="${webRoot}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${webRoot}/bootstrap/js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="${webRoot}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${webRoot}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="${webRoot}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${webRoot}/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${webRoot}/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${webRoot}/dist/js/demo.js"></script>
<!-- page script -->
<script>
    $(function () {
        $("#example1").DataTable();
        $('#example2').DataTable({
            "paging": true,
            "lengthChange": false,
            "searching": false,
            "ordering": true,
            "info": true,
            "autoWidth": false
        });
    });
</script>
</body>
</html>