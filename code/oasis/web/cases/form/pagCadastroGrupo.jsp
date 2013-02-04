<%-- 
    Document   : pagCadastroGrupo
    Created on : 29/01/2013, 19:43:53
    Author     : Gabriel Quézid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Oasis</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="../../css/bootstrap.css" rel="stylesheet">
        <link href="../../css/bootstrap-responsive.css" rel="stylesheet">
        <link href="../../css/docs.css" rel="stylesheet">
        <link href="../../css/prettify.css" rel="stylesheet">

        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
          <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- Le fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="assets/ico/favicon.png">

    </head>

    <body data-spy="scroll" data-target=".bs-docs-sidebar">

        <!-- Modal -->
        <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">Formulário: Grupo</h3>
            </div>

            <!-- Formulário de Grupo -->
            <form name="pagCadastroGrupo" id="pagCadastroGrupo" class="" method="" >
                <input type="hidden" name="index" id="index" value="2">
                <div class="modal-body">

                    <div align="center">
                        <table>
                            <tr style="width: 120px;">
                                <td><strong>Nome: </strong><td>
                                <td><input id="nome" name="nome" type="text" class="input" placeholder="nome"><td>
                            </tr>
                            <tr>
                                <td><strong>Descrição: </strong> <td>
                                <td><input id="descricao" name="descricao" type="text" class="input" placeholder="descrição"><td>
                            </tr>
                        </table>
                    </div>  

                </div>
                <div class="modal-footer">
                    <button class="btn" data-dismiss="modal" aria-hidden="true">Fechar</button>
                    <input id="limpar" type="reset" class="btn btn-warning" value="Limpar">
                    <input id="confirmar" type="submit" class="btn btn-primary" value="Confirmar">
                </div>
            </form>

        </div>

        <!-- Le javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
        <script src="http://code.jquery.com/jquery-migrate-1.0.0.min.js"></script>

        <script src="js/bootstrap.js"></script>
        <script src="js/holder/holder.js"></script>

        <!-- Analytics
        ================================================== -->

    </body>
</html>