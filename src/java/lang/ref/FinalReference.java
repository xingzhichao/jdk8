/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang.ref;

/**
 * 程序中有直接可达的引用，而不需要通过任何引用对象。
 * 如果一个对象具有
 * 强引用， GC 绝不会回收它，
 * 当内存空间不足时， JVM 宁愿抛出 OOM。
 * new 出来的对象是典型的强引用。
 */
class FinalReference<T> extends Reference<T> {

    public FinalReference(T referent, ReferenceQueue<? super T> q) {
        super(referent, q);
    }
}
