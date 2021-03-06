/**
 * Copyright 2014 J. Patrick Meyer
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itemanalysis.jmetrik.commandbuilder;

public class ValueBounds {

    private double min = Double.NEGATIVE_INFINITY;

    private double max = Double.POSITIVE_INFINITY;

    public ValueBounds(double min, double max){
        this.min = min;
        this.max = max;
    }

    public ValueBounds(){
        //unbounded
    }

    public boolean contains(double value){
        if(value>= min && value <= max){
            return false;
        }
        return true;
    }

}
