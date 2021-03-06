/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An annotation for a Spec method that generates tree props.
 * These tree props will be passed silently to all of the Component's children.
 *
 * Tree props are stored in a map keyed on their individual class object, meaning there will only be
 * one entry for tree props of any given type. PLEASE DO NOT USE COMMON JAVA CLASSES, for example,
 * String, Integer etc; creates a wrapper class instead.
 *
 * <p>Example usage:
 * <code>
 *
 * {@literal @}LayoutSpec
 * public class MySpec {
 *
 *   {@literal @}OnCreateTreeProp
 *   SomeTreePropClass onCreateSomeTreeProp(
 *     ComponentsContext c,
 *     {@literal @}Prop SomeProp prop) {
 *    return new SomeTreePropClass(prop.getSomeProperty());
 *   }
 * }
 * </code>
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface OnCreateTreeProp {

}
