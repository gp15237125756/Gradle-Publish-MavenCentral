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

package com.kino.hilt.construct;

import android.util.Log;

import javax.inject.Inject;

/**
 * Inject ,依赖组件， 为依赖项，在此示例中，Car 类依赖于拥有 Engine 类的一个实例才能运行
 * 从构造函数的图标上可以看到依赖关系
 */
public class Engine {

    @Inject
    public Engine() {
    }

    public void run(){
        Log.d("HILT"," this car is running");
    }
}