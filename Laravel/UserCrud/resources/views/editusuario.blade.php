@extends('plantilla')
@section('cuerpo')
<div class="col-12">
    <form action="#" method="post" object="#">
        <input type="hidden" field="#">
        <div class="form-group">
            <label for="inputNombre">Nombre</label>
            <input class="form-control" type="text" value="#" id="inputNombre" field="#" name="campoNombre">
        </div>
        <div class="form-group">
            <label for="inputApellido">Apellido</label>
            <input class="form-control" type="text" value="#" id="inputApellido" field="#" name="campoApellido">
        </div>
        <div class="form-group">
            <label for="inputContrasena">Contrasena</label>
            <input class="form-control" type="password" value="#" id="inputContrasena" field="#" name="campoContraseña">
        </div>
        <div class="form-group">
            <label for="inputCorreo">Correo</label>
            <input class="form-control" type="text" value="#" id="inputCorreo" field="#" name="campoCorreo">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Guardar</button>
            <button type="reset" class="btn btn-primary">Vaciar</button>
        </div>
    </form>
</div>
@endsection