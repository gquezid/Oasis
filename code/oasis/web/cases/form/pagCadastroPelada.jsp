<%-- 
    Document   : pagCadastroPelada
    Created on : 29/01/2013, 19:43:25
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
                <h3 id="myModalLabel">Formulário: Pelada</h3>
            </div>

            <!-- Formulário de Grupo -->
            <form name="pagCadastroPelada" id="pagCadastroPelada" class="" method="" >
                <input type="hidden" name="index" id="index" value="3">
                <div class="modal-body">

                    <div align="center">
                        <table>
                            <tr>
                                <td style="width: 190px;"><strong>Data do Evento: </strong></td>
                                <td align="center">
                                    <div class="input-prepend">
                                        <input type="date" name="dataevento" required>>
                                    </div>
                                </td>
                            </tr>
                            <table>
                                <tr>
                                    <td style="width: 190px;"><strong>Prazo para Convites: </strong></td>
                                    <td align="center">
                                        <div class="input-prepend">
                                            <input type="date" name="dataprazo" required>>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width: 190px;"><strong>Número de Participantes: </strong></td>
                                    <td align="center">
                                        <div class="input-prepend">
                                            <span class="add-on">Mín.</span>
                                            <input class="span2" id="prependedInput" type="text" placeholder="mínimo">
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td><strong>Número de Participantes: </strong></td>
                                    <td align="center">
                                        <div class="input-append">
                                            <input class="span2" id="appendedInput" type="text" placeholder="máximo" >
                                            <span class="add-on">Máx.</span>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td><strong>Logradouro: </strong></td>
                                    <td><input name="logradouro" id="logradouro" type="text" class="input" placeholder="logradouro"></td>
                                </tr>
                                <tr>
                                    <td><strong>Número (N.º): </strong></td>
                                    <td><input name="numero" id="numero" type="text" class="input" placeholder="número"></td>
                                </tr>
                                <tr>
                                    <td><strong>Estado: </strong></td>
                                    <td>
                                        <select name="estado" id="estado" type="text" class="input" required>
                                            <option></option>
                                            <option value="1">Acre</option>
                                            <option value="2">Alagos</option>
                                            <option value="3">Amapá</option>
                                            <option value="4">Amazonas</option>
                                            <option value="5">Bahia</option>
                                            <option value="6">Ceará</option>
                                            <option value="7">Distrito Federal</option>
                                            <option value="8">Espírito Santo</option>
                                            <option value="9">Goiáis</option>
                                            <option value="10">Maranhão</option>
                                            <option value="11">Mato Grosso</option>
                                            <option value="12">Mato Grosso do Sul</option>
                                            <option value="13">Minas Geráis</option>
                                            <option value="14">Pará</option>
                                            <option value="15">Paraiba</option>
                                            <option value="16">Paraná</option>
                                            <option value="17">Pernambuco</option>
                                            <option value="18">Piauí</option>
                                            <option value="19">Rio de Janeiro</option>
                                            <option value="20">Rio Grande do Norte</option>
                                            <option value="21">Rio Grande do Sul</option>
                                            <option value="22">Rondônia</option>
                                            <option value="23">Roraima</option>
                                            <option value="24">Santa Catarina</option>
                                            <option value="25">São Paulo</option>
                                            <option value="26">Sergipe</option>
                                            <option value="27">Tocantins</option>
                                        </select>
                                    </td>
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
