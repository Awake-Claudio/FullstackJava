@extends('plantilla')
@section('cuerpo')
<div class="row mt-4">
    <div class="alert col-12 alert-primary" role="alert">
        <h2>Usuarios Registrados</h2>
    </div>
</div>
<div class="row">
    <div class="col-12">
        <table class="table">
            <thead class="bg-primary text-white">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Correo</th>
                </tr>
            </thead>
            <tbody>
                <tr > <!--each="usuario : ${usuarios}" -->
                    <th scope="row" text="id del usuario"></th> <!-- ${usuario.getIdUsuario()}--> 
                    <td text="nombre de usuario"></td> <!--${usuario.getNombre()}-->
                    <td text="apellido del usuario"></td> <!--${usuario.getApellido()}-->
                    <td text="correo del usuario"></td> <!--${usuario.getCorreo()}-->
                </tr>
            </tbody>
        </table>
    </div>
</div>
@endsection