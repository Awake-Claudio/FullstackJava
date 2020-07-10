<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Foundation\Auth\User;

class UsuarioController extends Controller
{
    public function getAll(){ //traer a todos los usuarios de la BD
        //$user = User::all(); codigo habitual
        //return $user;
        return User::all(); // codigo resumido
    }

    public function add(Request $request){ // crear Usuario
        return User::create($request->all());
    }

    public function getId($id){ // consultar usuario por id
        return User::find($id);
    }

    public function edit($id, Request $request){ // editar usuario por id
        $usuario = $this->getId($id);
        $usuario->fill($request->all())->save();
        return $usuario;
    }

    public function delete($id){    // borar usuario por id
        $usuario = $this->getId($id);
        $usuario->delete();
        return $usuario;
    }
}
