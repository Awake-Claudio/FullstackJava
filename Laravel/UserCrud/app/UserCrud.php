<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class UserCrud extends Model
{
    protected $table = 'user';   
    protected $fillable = array('name', 'email', 'password', 'role');
}
