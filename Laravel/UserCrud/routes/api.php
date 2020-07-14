<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});
//------ Apis probadas para UserCrud
//Route::get('/listusers','UsuarioController@getAll')->name('getUsuarios'); //listar usuarios OK
//Route::post('/addusers','UsuarioController@add')->name('addUsuarios'); // registrar usuarios ok
//Route::get('/getuser/{id}','UsuarioController@getId')->name('getIdUsuario'); // consultar usuario por id ok
//Route::post('/editusers/{id}','UsuarioController@edit')->name('editUsuario'); // modificar usuario ok
//Route::get('/dellusers/delete/{id}','UsuarioController@delete')->name('borraUsuario'); // eliminar usuario ok
