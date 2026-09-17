package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface Descriptor {
    int objectTypeIndication() default -1;

    int[] tags();
}
