@extends('plantilla')
@section('cuerpo')
    <h1> Acceso UserCrud</h1>
        <div class="row">
            <div class="col-md-6 login-form-2">
                <h3>Bienvnido Usuario: {{ $usuario }}</h3>
                <form method="POST">
                    <div class="form-group">
                        <input type="text" class="form-control" name="username" placeholder="nombreusuario" value="" />
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" class="form-control" placeholder="Contrasena" value="" />
                    </div>
                    <div class="form-group">
                        <div class="custom-control custom-checkbox small">
                            <input type="checkbox" class="custom-control-input" name="remember-me" id="customCheck">
                            <label class="custom-control-label" for="customCheck">Recordar</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btnSubmit" value="Iniciar Sesion" />
                    </div>
                    <div class="form-group">
                        <a href="#" class="ForgetPwd" value="Login">¿Perdiste tu contrasena?</a>
                    </div>
                </form>
            </div>
        </div>
@endsection