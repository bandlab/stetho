/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.stetho.inspector.elements;

public interface DocumentView {
  Object getRootElement();

  ElementInfo getElementInfo(Object element);
}
