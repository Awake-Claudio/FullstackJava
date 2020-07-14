@extends('layouts.app')

@section('content')
<div class="row mt-4">
    <div class="alert col-12 alert-primary" role="alert">
        <h2>Usuarios Registrados</h2>
    </div>
</div>
<div class="row">
    <div class="col-12">
        @if ($usuarios->isEmpty()) 
            <div> No hay Usuarios Registrados o no hay resultados en la busqueda </div>
        @else
        <table class="table">
            <thead class="bg-primary text-white">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Rol</th>
                    <th scope="col">Acciones</th>
                </tr>
            </thead>
            <tbody>
                @foreach($usuarios as $users)
                    <tr > 
                        <th scope="row">{{$users->id}}</th> <!--Dato campo Id -->
                        <td>{{$users->name}}</td>           <!--Dato campo Nombre-->
                        <td>{{$users->email}}</td>          <!--Dato campo Correo-->
                        <td>{{$users->role}}</td>           <!--Dato campo Rol-->
                        <td style="display: flex; justify-items: center; align-items: center;">
                            <form method="get" action="{{url('/home/editarusers/'.$users->id)}}"
                                {{csrf_field()}}
                                <button type="submit" onclick="return confirm('¿Desea Editar?');" class="btn btn-warning">
                                    Editar
                                </button>
                            </form> 
                            <form method="get" action="{{url('/home/dellusers/'.$users->id)}}"
                                {{csrf_field()}}
                                {{method_field('DELETE')}}
                                <button type="submit" onclick="return confirm('¿Desea Borrar?');" class="btn btn-danger">
                                    Borrar
                                </button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
        @endif
    </div>
</div>
@endsection