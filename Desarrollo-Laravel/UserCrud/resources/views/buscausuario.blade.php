@extends('layouts.app')

@section('content')
<div class="col-12">
    <form action="{{url('/home/finduser')}}" method="post" enctype="multipart/form-data">
        {{ csrf_field() }}
        <input type="hidden" field="#">
        <div class="form-group">    
            <label for="name">Nombre de Usuario</label>
            <input class="form-control" type="text" value="" id="name" field="#" name="name">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Buscar</button>
            <button type="reset" class="btn btn-primary">Vaciar</button>
        </div>
    </form>
</div>
@endsection