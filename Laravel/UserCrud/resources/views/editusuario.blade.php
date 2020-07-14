@extends('layouts.app')

@section('content')
<div class="col-12">
    <form action="{{url('/home/editusers/'.$usuario->id)}}" method="post" enctype="multipart/form-data">
        {{ csrf_field() }}
        <input type="hidden" field="#">
        <div class="form-group">    
            <label for="name">Nombre de Usuario</label>
            <input class="form-control" type="text" value="{{$usuario->name}}" id="name" field="#" name="name">
        </div>
        <div class="form-group">
            <label for="email">Correo</label>
            <input class="form-control" type="email" value="{{$usuario->email}}" id="email" field="#" name="email">
        </div>
        <div class="form-group">
            <label for="password">Contrasena</label>
            <input class="form-control" type="password" value="{{$usuario->password}}" id="password" field="#" name="password">
        </div>
        <div class="form-group">
            <label for="password">Rol</label>
            <input class="form-control" type="password" value="{{$usuario->role}}" id="password" field="#" name="password">
        </div>
        
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Guardar</button>
            <button type="reset" class="btn btn-primary">Vaciar</button>
        </div>
    </form>
</div>
@endsection