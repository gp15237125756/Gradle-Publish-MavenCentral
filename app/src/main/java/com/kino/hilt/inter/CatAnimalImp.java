/*
Copyright 2016 Thomas Jammet
mathieu.poux[a]gmail.com
jammetthomas[a]gmail.com
This file is part of Librtmfp.
Librtmfp is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
Librtmfp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.
You should have received a copy of the GNU Lesser General Public License
along with Librtmfp.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.kino.hilt.inter;

import android.util.Log;

import javax.inject.Inject;

/**
 * 猫的实现
 */
public class CatAnimalImp implements IAnimal{

    @Inject
    public CatAnimalImp() {
    }

    @Override
    public void run() {
        Log.d("HILT","猫猫跑起来了");
    }

    @Override
    public void eat() {
        Log.d("HILT","毛毛爱吃鱼");
    }
}