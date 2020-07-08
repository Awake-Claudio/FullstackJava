<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

// con parametros libres
Route::get('/prueba/{param?}', function ($param='ingrese un "/" y un valor en la url') {
    return 'Hola, Probando la Ruta con parametro : '.$param;
});

//con un solo parametro de tipo numero
Route::get('/prueba-num/{numero?}', function ($numero='ingrese un "/" y un numero en la url') {
    return 'Hola, Probando la Ruta con el numero : '.$numero;
})->where('numero','[0-9]+');

//con un solo parametro de tipo caracter
Route::get('/prueba-text/{text?}', function ($text='ingrese un "/" y un texto en la url') {
    return 'Hola, Probando la Ruta con el texto : '.$text;
})->where('text','[A-Za-z]+');

//con 2 parametros uno de tipo numero y otro caracter
Route::get('/prueba-dual/{numero?}/{text?}', function ($num='ingrese un "/" y un numero ',$tex=' seguido de un "/" y un texto en la url') {
    return 'Hola, Probando la Ruta con el numero y texto: '.$num.' - '.$tex;
})->where(['num'=>'[0-9]', 'tex'=>'[A-Za-z]+']);

// ruta para vista para login de usuario usando atajo para acceder a vista
route::view('logeo','login',['usuario'=>'No identificado']);

//+++++++++++++++++++++++++

// Ruta para el home
route::get('iniciar',function(){
    return view('Home')->name('inicio');
});

// Ruta para el login
route::get('acceder',function(){
    return view('Home')->name('acceso');
});