<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Foundation\Auth\User;

class UsuarioController extends Controller
{
    // -------------------------- API RESTful -----------------------------
    
    public function getAll(){ //traer a todos los usuarios de la BD
        //$user = User::all(); codigo habitual
        //return $user;
        return User::orderBy('id','DESC'); // codigo resumido
    }

    public function add(Request $request){ // crear Usuario
            $Usuario = User::create($request->all());
        return redirect('/home/listusers');
    }

    public function getId($id){ // consultar usuario por id
        return User::find($id);
    }

    public function getuserByname(Request $request){ // consultar usuario por Nombre
        //$name = $request->input('name');
        $usuarios=User::where('name', 'like', '%'.$request->name.'%')->get();
        return view('usuarios', compact('usuarios'));
    }

    public function edit($id, Request $request){ // editar usuario por id
        $usuario = $this->getId($id);
        $usuario->fill($request->all())->save();
        return redirect('/home/listusers');
    }

    public function delete($id){    // borar usuario por id
        $usuario = $this->getId($id);
        $usuario->delete();
        return redirect('/home/listusers');
    }
    // --------------------------------------------------------------------

    // ------------------acceso a vistas de Usuario------------------------
    public function listar(){
        $usuarios=User::all(); //llamando directo en vez de reutilizar (no se por que no pude reutilizar)
        return view('usuarios', compact('usuarios'));
    }

    public function editar($id){     
        $usuario = $this->getId($id);
        return view('editusuario',compact('usuario'));
    }

    public function crear(){                
        return view('crearusuario');
    }

    public function buscar(){
        return view('buscausuario');
    }
}
